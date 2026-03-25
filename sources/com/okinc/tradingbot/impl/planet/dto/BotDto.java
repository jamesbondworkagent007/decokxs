package com.okinc.tradingbot.impl.planet.dto;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C53631wpD;
import o.InterfaceC53629wpB;

/* JADX INFO: loaded from: classes11.dex */
@Serializable(with = C53631wpD.class)
public interface BotDto extends InterfaceC53629wpB {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<BotDto> serializer() {
            return C53631wpD.copydefault;
        }
    }
}
