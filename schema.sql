create table if not exists public.users (
    id bigserial primary key,

    -- Link to Firebase Auth user
    firebase_uid text not null unique,

    -- Auth / identity
    email text not null unique,
    user_name text not null unique,

    -- Profile
    full_name text,
    phone text,
    avatar_url text,
    bio text,

    -- Delivery address
    address text,
    city text,

    -- App settings
    role smallint not null default 1,
    preferred_language varchar(10) not null default 'en',

    -- Audit
    created_at timestamptz not null default now(),
    updated_at timestamptz not null default now(),

    -- Optional: guardrails
    constraint users_role_check check (role in (1,2,3))
    );