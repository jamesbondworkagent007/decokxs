package com.okinc.web3.security.features.importing.utils;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes17.dex */
public final class Regexes {
    public static final Regexes INSTANCE = new Regexes();
    private static final Regex SEED_PHRASE_WHITESPACE = new Regex("\\s");
    private static final Regex SEED_PHRASE_PRIVATE_KEY = new Regex("^(ed25519-priv-)?[0-9a-zA-Z\\s]+$");
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Regex getSEED_PHRASE_PRIVATE_KEY() {
        return SEED_PHRASE_PRIVATE_KEY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Regex getSEED_PHRASE_WHITESPACE() {
        return SEED_PHRASE_WHITESPACE;
    }

    private Regexes() {
    }
}
