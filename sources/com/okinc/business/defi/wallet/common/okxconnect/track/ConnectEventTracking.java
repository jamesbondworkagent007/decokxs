package com.okinc.business.defi.wallet.common.okxconnect.track;

import com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C10854bwM;
import o.C16016ebv;
import o.C32866mlf;
import o.C32868mlh;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectEventTracking {
    public static final ConnectEventTracking AEQbTJ = new ConnectEventTracking();

    private ConnectEventTracking() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source OKX_CONNECT = new Source("OKX_CONNECT", 0, "okx_connect");
        public static final Source TON_CONNECT = new Source("TON_CONNECT", 1, "ton_connect");
        public static final Source WALLET_CONNECT = new Source("WALLET_CONNECT", 2, "wallet_connect");
        private final String connectName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Source[] $values() {
            return new Source[]{OKX_CONNECT, TON_CONNECT, WALLET_CONNECT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Source> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getConnectName() {
            return this.connectName;
        }

        private Source(String str, int i, String str2) {
            this.connectName = str2;
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sourceArr$values);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public final Object EZpvd(@NotNull final Source source, @NotNull final String str, @NotNull final String str2, @NotNull final List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Application application = Result.Companion;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("Web3WalletConnect_Confirm_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ebp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConnectEventTracking.EZpvd(list, source, str, str2, (EventParamsList) obj);
                }
            });
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ebv.copydefault(java.util.List):java.lang.String */
    public static final Unit EZpvd(List list, Source source, String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chain", C16016ebv.KWHzl(list), false);
        eventParamsList.put("connect_method", source.getConnectName(), true);
        eventParamsList.put("dapp", str, false);
        eventParamsList.put("dapp_link", str2, false);
        return Unit.INSTANCE;
    }

    public final Object copydefault(final boolean z) {
        try {
            Result.Application application = Result.Companion;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("ObtainOrigin_ApiCall_Api_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ebr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConnectEventTracking.AEQbTJ(z, (EventParamsList) obj);
                }
            });
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("fetch_status", String.valueOf(z), true);
        return Unit.INSTANCE;
    }

    public final Object EZpvd(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final Source source) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(source, "");
        try {
            Result.Application application = Result.Companion;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("Report_OKXConnectAPP_RequestStart_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ebm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConnectEventTracking.AEQbTJ(str, str2, str3, str4, source, (EventParamsList) obj);
                }
            });
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit AEQbTJ(String str, String str2, String str3, String str4, Source source, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("url", str, false);
        eventParamsList.put("call_method", str2, false);
        eventParamsList.put("chain", str3, false);
        eventParamsList.put("dapp_name", str4, false);
        eventParamsList.put("source", source.getConnectName(), false);
        return Unit.INSTANCE;
    }
}
