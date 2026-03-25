package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9737bbI {
    InterfaceC9731bbC AEQbTJ();

    InterfaceC9731bbC AEQbTJ(long j, boolean z);

    InterfaceC9731bbC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, boolean z);

    InterfaceC9731bbC EZpvd();

    InterfaceC9731bbC EZpvd(long j, boolean z);

    InterfaceC9731bbC EZpvd(@NotNull java.lang.String str, boolean z);

    java.util.List<InterfaceC9731bbC> KWHzl(boolean z);

    InterfaceC9731bbC KWHzl();

    InterfaceC9731bbC KWHzl(@NotNull java.lang.String str, long j, boolean z);

    java.util.ArrayList<InterfaceC9731bbC> OLrzqt(boolean z);

    InterfaceC9731bbC OLrzqt();

    InterfaceC9731bbC OLrzqt(long j, boolean z);

    InterfaceC9731bbC OLrzqt(@NotNull java.lang.String str, boolean z);

    java.util.List<InterfaceC9731bbC> copydefault(boolean z);

    InterfaceC9731bbC copydefault();

    InterfaceC9731bbC copydefault(java.lang.Long l, boolean z);

    InterfaceC9731bbC gEmmrt();

    /* JADX INFO: renamed from: o.bbI$Application */
    public static final class Application {
        public static /* synthetic */ InterfaceC9731bbC getCoinMeta$default(InterfaceC9737bbI interfaceC9737bbI, java.lang.Long l, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinMeta");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.copydefault(l, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getChainMeta$default(InterfaceC9737bbI interfaceC9737bbI, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainMeta");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.AEQbTJ(j, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getChainMetaByNetwork$default(InterfaceC9737bbI interfaceC9737bbI, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainMetaByNetwork");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.EZpvd(str, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getChainMetaWithRealChainId$default(InterfaceC9737bbI interfaceC9737bbI, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainMetaWithRealChainId");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.EZpvd(j, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getChainMetaWithRealEvmChainId$default(InterfaceC9737bbI interfaceC9737bbI, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainMetaWithRealEvmChainId");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.OLrzqt(j, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getBtcTokenWithSymbolAndTid$default(InterfaceC9737bbI interfaceC9737bbI, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBtcTokenWithSymbolAndTid");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC9737bbI.AEQbTJ(str, str2, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getCoinWithAddress$default(InterfaceC9737bbI interfaceC9737bbI, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinWithAddress");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC9737bbI.OLrzqt(str, z);
        }

        public static /* synthetic */ InterfaceC9731bbC getTokenWithContractAddressAndChainId$default(InterfaceC9737bbI interfaceC9737bbI, java.lang.String str, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenWithContractAddressAndChainId");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC9737bbI.KWHzl(str, j, z);
        }

        public static /* synthetic */ java.util.List getChainCoinsAttribute$default(InterfaceC9737bbI interfaceC9737bbI, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChainCoinsAttribute");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9737bbI.copydefault(z);
        }

        public static /* synthetic */ java.util.List getEvmCompatibleCoinsAttribute$default(InterfaceC9737bbI interfaceC9737bbI, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEvmCompatibleCoinsAttribute");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9737bbI.KWHzl(z);
        }

        public static /* synthetic */ java.util.ArrayList getEvmCoinsAttribute$default(InterfaceC9737bbI interfaceC9737bbI, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEvmCoinsAttribute");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9737bbI.OLrzqt(z);
        }
    }
}
