package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9738bbJ {
    public static final Activity Companion = Activity.EZpvd;

    java.lang.String AEQbTJ();

    InterfaceC9742bbN AEQbTJ(long j);

    InterfaceC9742bbN AEQbTJ(java.lang.Long l);

    java.lang.String AYXKKw();

    java.util.List<InterfaceC9742bbN> AYXKKw(long j);

    java.util.List<C9698baW> AhwBna();

    boolean AhwBna(long j);

    java.lang.String AkhnZx();

    boolean AkhnZx(long j);

    boolean AuCTel();

    boolean AuCTelauCTel();

    boolean AubY();

    boolean AwvSrB();

    boolean AxsJAY();

    boolean DTwDnp();

    java.lang.String DbNXlk();

    java.lang.String EZpvd(long j);

    java.lang.String EZpvd(@NotNull java.lang.String str);

    java.util.List<InterfaceC9780bbz> EZpvd();

    InterfaceC9780bbz EZpvd(long j, java.lang.Integer num);

    boolean EZpvd(java.lang.Long l);

    java.lang.String KWHzl(@NotNull java.lang.String str, long j, boolean z);

    java.lang.String KWHzl(@NotNull java.lang.String str, boolean z);

    java.util.List<InterfaceC9742bbN> KWHzl(long j);

    boolean KWHzl();

    boolean KWHzl(int i, int i2, boolean z);

    boolean KWHzl(java.lang.Long l);

    java.lang.String OLrzqt(long j);

    java.lang.String OLrzqt(@NotNull java.lang.String str);

    boolean OLrzqt();

    boolean ORxRYg();

    boolean OcIXYQ();

    boolean QKVWgx();

    boolean QOLQEE();

    boolean QUSxYX();

    boolean QVAiDq();

    boolean QbewEr();

    boolean QfsBiF();

    boolean RJOkX();

    java.util.List<InterfaceC9731bbC> RcXXUw();

    boolean UeEOUB();

    boolean aKErDB();

    java.lang.String copydefault(long j, int i);

    java.util.Set<java.lang.String> copydefault();

    InterfaceC9742bbN copydefault(long j, java.lang.Integer num, boolean z);

    InterfaceC9780bbz copydefault(long j);

    boolean dNCPSb();

    java.lang.String djBIcL(long j);

    boolean djBIcL();

    boolean djSkpj();

    java.util.List<C9756bbb> dvKsVJ();

    C9757bbc dxcTrN();

    java.lang.String ejfBZ();

    java.util.List<InterfaceC9744bbP> fARcdN();

    long fIwbmz();

    java.lang.String fJNWhG();

    java.lang.String fetchVPNInfo();

    boolean fetchVPNInfo(long j);

    java.util.List<InterfaceC9742bbN> gEmmrt();

    boolean gEmmrt(long j);

    boolean gHZMYf();

    boolean getFieldNames();

    int getNewProxyInstance();

    java.lang.String hDKMBd();

    java.util.List<InterfaceC9780bbz> isConnected();

    boolean iwGUEr();

    boolean sSMYrx();

    int uzCIH();

    java.util.List<InterfaceC9780bbz> valueOf();

    InterfaceC9742bbN valueOf(long j);

    java.util.List<InterfaceC9742bbN> values();

    boolean wlaJM();

    boolean zLjUOn();

    boolean zsXlph();

    boolean zuBGHE();

    /* JADX INFO: renamed from: o.bbJ$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.bbJ$StateListAnimator */
    public static final class StateListAnimator {
        public static java.util.List<C9698baW> KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            java.util.List<InterfaceC9780bbz> listValueOf = interfaceC9738bbJ.valueOf();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            for (InterfaceC9780bbz interfaceC9780bbz : listValueOf) {
                arrayList.add(new C9698baW(java.lang.Long.valueOf(interfaceC9780bbz.getChainId()), interfaceC9780bbz.getAddress()));
            }
            return arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [73=4] */
        public static java.util.Set<java.lang.String> OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            java.util.List<InterfaceC9780bbz> listValueOf = interfaceC9738bbJ.valueOf();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            java.util.Iterator<T> it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC9780bbz) it.next()).getAddress());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            java.lang.String address;
            InterfaceC9780bbz interfaceC9780bbzEZpvd = interfaceC9738bbJ.EZpvd(j, null);
            return (interfaceC9780bbzEZpvd == null || (address = interfaceC9780bbzEZpvd.getAddress()) == null) ? "" : address;
        }

        public static /* synthetic */ java.lang.String addressForRealChainIdAndAddressType$default(InterfaceC9738bbJ interfaceC9738bbJ, long j, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressForRealChainIdAndAddressType");
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return interfaceC9738bbJ.copydefault(j, i);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j, int i) {
            InterfaceC9780bbz interfaceC9780bbzEZpvd = interfaceC9738bbJ.EZpvd(j, java.lang.Integer.valueOf(i));
            if (interfaceC9780bbzEZpvd != null) {
                return interfaceC9780bbzEZpvd.getAddress();
            }
            return null;
        }

        public static /* synthetic */ InterfaceC9780bbz addressFromRealChainId$default(InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressFromRealChainId");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return interfaceC9738bbJ.EZpvd(j, num);
        }

        public static /* synthetic */ InterfaceC9742bbN getCanSupportedCoinAssets$default(InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCanSupportedCoinAssets");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC9738bbJ.copydefault(j, num, z);
        }

        public static java.lang.String copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            return interfaceC9738bbJ.KWHzl("all", true);
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return interfaceC9738bbJ.KWHzl(str, true);
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            return interfaceC9738bbJ.KWHzl("all", j, true);
        }

        public static boolean EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            return interfaceC9738bbJ.AubY() || interfaceC9738bbJ.AwvSrB() || interfaceC9738bbJ.QVAiDq();
        }

        public static boolean AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            return interfaceC9738bbJ.AubY() || interfaceC9738bbJ.AwvSrB() || interfaceC9738bbJ.QVAiDq();
        }
    }
}
