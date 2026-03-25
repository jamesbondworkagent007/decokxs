package com.okinc.wallet.hardware.impl.onekey.data;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C57146ycs;

/* JADX INFO: loaded from: classes12.dex */
@Serializable(with = C57146ycs.class)
public interface Response {
    public static final Companion Companion = Companion.AEQbTJ;

    boolean getSuccess();

    public static final class Companion {
        public static final /* synthetic */ Companion AEQbTJ = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<Response> serializer() {
            return C57146ycs.KWHzl;
        }
    }
}
