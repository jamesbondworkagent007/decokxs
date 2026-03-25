package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import java.util.UUID;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C44103sDl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cCD extends AbstractC12784ctX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public long copydefault;
    public C13854daT djBIcL;
    public int fetchVPNInfo;
    public MpcWalletEncodeInfo gEmmrt;
    public java.lang.String DbNXlk = "";
    public java.util.List<? extends AbstractC12782ctV> values = new java.util.ArrayList();
    public WalletType AkhnZx = WalletType.HDWallet;
    public java.lang.String AhwBna = "";
    public int valueOf = -1;
    public java.util.List<? extends AbstractC12782ctV> AYXKKw = new java.util.ArrayList();

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.AAWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.DemoWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public void AEQbTJ(@NotNull java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX, o.InterfaceC9735bbG
    public java.lang.String EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public void EZpvd(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        this.AkhnZx = walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.ctV>, java.util.List<o.ctV> */
    @Override // o.AbstractC12784ctX, o.InterfaceC9735bbG
    public java.util.List<AbstractC12782ctV> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public void OLrzqt(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(long j) {
        this.copydefault = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(MpcWalletEncodeInfo mpcWalletEncodeInfo) {
        this.gEmmrt = mpcWalletEncodeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public void OLrzqt(@NotNull java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(C13854daT c13854daT) {
        this.djBIcL = c13854daT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public int fARcdN() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.ctV>, java.util.List<o.ctV> */
    @Override // o.AbstractC12784ctX
    public java.util.List<AbstractC12782ctV> fIwbmz() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public C13854daT fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public long gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12784ctX
    public MpcWalletEncodeInfo isConnected() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC12784ctX
    public WalletType fJNWhG() {
        WalletType walletTypeQwvEab;
        WalletType walletTypeDarRvM;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
        WalletType walletTypeQwvEab2 = abstractC12782ctV != null ? abstractC12782ctV.QwvEab() : null;
        if (walletTypeQwvEab2 != null && Application.copydefault[walletTypeQwvEab2.ordinal()] == 1) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
            return (abstractC12782ctV2 == null || (walletTypeDarRvM = abstractC12782ctV2.DarRvM()) == null) ? WalletType.HDWallet : walletTypeDarRvM;
        }
        AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
        return (abstractC12782ctV3 == null || (walletTypeQwvEab = abstractC12782ctV3.QwvEab()) == null) ? WalletType.HDWallet : walletTypeQwvEab;
    }

    @Override // o.AbstractC12784ctX
    public java.lang.String AuCTel() {
        int i = Application.copydefault[fJNWhG().ordinal()];
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActionBarCallback);
        }
        if (i != 3) {
            return i != 4 ? this.AhwBna : C33070mpX.AYXKKw(C13754dXa.FragmentManager.viewCreated);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getApplyableNightMode);
    }

    @Override // o.AbstractC12784ctX
    public boolean AYXKKw() {
        java.util.List<AbstractC12782ctV> listKWHzl = KWHzl();
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (!((AbstractC12782ctV) it.next()).gasjUx()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.AbstractC12784ctX
    public boolean valueOf() {
        java.util.List<AbstractC12782ctV> listKWHzl = KWHzl();
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (!((AbstractC12782ctV) it.next()).AxsJAYaxsJAY()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.AbstractC12784ctX
    public boolean AkhnZx() {
        java.util.List<AbstractC12782ctV> listKWHzl = KWHzl();
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (!((AbstractC12782ctV) it.next()).ffGIBT()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.AbstractC12784ctX, o.InterfaceC9735bbG
    public boolean AEQbTJ() {
        return AYXKKw() || valueOf() || AkhnZx();
    }

    @Override // o.AbstractC12784ctX
    public boolean zLjUOn() {
        return fJNWhG() == WalletType.MPCWallet;
    }

    @Override // o.AbstractC12784ctX
    public boolean getNewProxyInstance() {
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected;
        return zLjUOn() && (mpcWalletEncodeInfoIsConnected = isConnected()) != null && mpcWalletEncodeInfoIsConnected.isEscape() == 1;
    }

    @Override // o.AbstractC12784ctX
    public boolean AubY() {
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected;
        return zLjUOn() && (mpcWalletEncodeInfoIsConnected = isConnected()) != null && mpcWalletEncodeInfoIsConnected.getStatus() == MpcShare2Status.SHARE2_VALID.getValue();
    }

    @Override // o.AbstractC12784ctX
    public boolean copydefault(int i) {
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected;
        java.util.List<java.lang.String> copiedEscapeList;
        return zLjUOn() && (mpcWalletEncodeInfoIsConnected = isConnected()) != null && (copiedEscapeList = mpcWalletEncodeInfoIsConnected.getCopiedEscapeList()) != null && copiedEscapeList.contains(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)));
    }

    public final java.lang.String gHZMYf() {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
        java.lang.String strRlQdEF = abstractC12782ctV != null ? abstractC12782ctV.RlQdEF() : null;
        return strRlQdEF == null ? "" : strRlQdEF;
    }

    @Override // o.AbstractC12784ctX
    public boolean uzCIH() {
        return iwGUEr() || hDKMBd();
    }

    @Override // o.AbstractC12784ctX
    public boolean iwGUEr() {
        C13854daT c13854daTFetchVPNInfo = fetchVPNInfo();
        return (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.KWHzl() : null) == HardwareType.LedgerNanoX;
    }

    @Override // o.AbstractC12784ctX
    public boolean hDKMBd() {
        C13854daT c13854daTFetchVPNInfo = fetchVPNInfo();
        return (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.KWHzl() : null) == HardwareType.LedgerFlex;
    }

    @Override // o.AbstractC12784ctX
    public boolean getFieldNames() {
        C13854daT c13854daTFetchVPNInfo = fetchVPNInfo();
        return (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.KWHzl() : null) == HardwareType.Keystone;
    }

    @Override // o.AbstractC12784ctX
    public boolean zsXlph() {
        C13854daT c13854daTFetchVPNInfo = fetchVPNInfo();
        return (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.KWHzl() : null) == HardwareType.OneKey;
    }

    @Override // o.AbstractC12784ctX
    public boolean AuCTelauCTel() {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
        return abstractC12782ctV != null && abstractC12782ctV.QVAiDq();
    }

    @Override // o.AbstractC12784ctX
    public boolean wlaJM() {
        java.util.List<AbstractC12782ctV> listKWHzl = KWHzl();
        if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (!((AbstractC12782ctV) it.next()).zblBkD()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public AbstractC58260yxt<java.lang.Integer> AxsJAY() {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().copydefault(this);
        final Function1 function1 = new Function1() { // from class: o.cCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.AEQbTJ((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.AhwBna((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.isConnected(function1, obj);
            }
        });
    }

    public static final java.lang.Integer AhwBna(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    @Override // o.AbstractC12784ctX
    public AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt(str);
        return AxsJAY();
    }

    public static final InterfaceC58261yxu fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.AbstractC12784ctX
    public AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu EZpvd(cCD ccd, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() <= 1) {
            AbstractC58260yxt abstractC58260yxtAEQbTJ = C10337bmZ.KWHzl.OLrzqt().AEQbTJ(1);
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ);
            return abstractC58260yxtAEQbTJ;
        }
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(ccd.EZpvd());
    }

    @Override // o.AbstractC12784ctX
    public AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C11607cUn.valueOf(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().djBIcL(EZpvd()));
    }

    @Override // o.AbstractC12784ctX
    public AbstractC58260yxt<java.lang.Integer> copydefault() {
        java.util.List<AbstractC12782ctV> listKWHzl = KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (AbstractC12782ctV abstractC12782ctV : listKWHzl) {
            abstractC12782ctV.EZpvd(true);
            arrayList.add(abstractC12782ctV.DCUTEIddSDPG());
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.cCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.valueOf((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cCJ
            private static final byte[] $$c = {1, -34, -12, 123};
            private static final int $$d = 135;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {65, -51, -28, -122, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
            private static final int $$b = 43;
            private static int AhwBna = 0;
            private static int gEmmrt = 1;
            private static char[] copydefault = {11802, 11794, 11795, 11786, 11799, 11751, 11826, 11780, 11745, 11793, 11790, 11834, 11801, 11788, 11803, 11825, 11837, 11749, 11792, 11750, 11744, 11804, 11787, 11807, 11822, 11824, 11784, 11870, 11820, 11797, 11748, 11805, 11844, 11833, 11798, 11789};
            private static char AEQbTJ = 7138;
            private static char[] EZpvd = {62927, 62512, 62923, 62514, 62924, 62956, 62524, 62925, 62519, 62513, 62516, 62921, 62931, 62526, 62941, 62515, 62525, 62926, 62523, 62935, 62922};
            private static int OLrzqt = 585627040;
            private static boolean KWHzl = true;
            private static boolean valueOf = true;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, int i, short s2) {
                int i2;
                int i3;
                byte[] bArr = $$c;
                int i4 = 120 - s;
                int i5 = 3 - (i * 3);
                int i6 = (s2 * 4) + 1;
                byte[] bArr2 = new byte[i6];
                if (bArr == 0) {
                    int i7 = i4;
                    i4 = i6;
                    i3 = 0;
                    i4 += i7;
                    i2 = i3;
                    i5++;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = bArr[i5];
                    i4 += i7;
                    i2 = i3;
                    i5++;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                    }
                } else {
                    i2 = 0;
                    i5++;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4 = s + 4;
                byte[] bArr = $$a;
                int i5 = i * 5;
                int i6 = (b * 20) + 79;
                byte[] bArr2 = new byte[i5 + 6];
                int i7 = i5 + 5;
                if (bArr == null) {
                    i3 = i4;
                    int i8 = i7;
                    i2 = 0;
                    i4 = i4 + (-i8) + 8;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i2++;
                    i8 = bArr[i3];
                    i4 = i4 + (-i8) + 8;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i7) {
                    }
                } else {
                    i2 = 0;
                    i3 = i4;
                    i4 = i6;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i7) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = gEmmrt + 97;
                AhwBna = i2 % 128;
                java.lang.Integer num = (java.lang.Integer) obj;
                if (i2 % 2 == 0) {
                    return cCD.EZpvd(num);
                }
                cCD.EZpvd(num);
                java.lang.Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [152=8] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(char[] cArr, int[] iArr, int i, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                char[] cArr2;
                int length;
                char[] cArr3;
                int i2 = 2 % 2;
                Ze ze = new Ze();
                char[] cArr4 = EZpvd;
                if (cArr4 != null) {
                    int i3 = $10 + 89;
                    int i4 = i3 % 128;
                    $11 = i4;
                    if (i3 % 2 == 0) {
                        length = cArr4.length;
                        cArr3 = new char[length];
                    } else {
                        length = cArr4.length;
                        cArr3 = new char[length];
                    }
                    int i5 = i4 + 59;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    for (int i7 = 0; i7 < length; i7++) {
                        int i8 = $11 + 51;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i7])};
                            java.lang.Object objEZpvd = YY.EZpvd(-855574269);
                            if (objEZpvd == null) {
                                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr4 = cArr3;
                }
                try {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(OLrzqt)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-1914793274);
                    if (objEZpvd2 == null) {
                        byte b = (byte) ($$c[0] - 1);
                        objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e((byte) 21, b, b), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                    int i10 = 19;
                    int i11 = -1317980492;
                    if (valueOf) {
                        ze.copydefault = bArr.length;
                        char[] cArr5 = new char[ze.copydefault];
                        ze.AEQbTJ = 0;
                        while (ze.AEQbTJ < ze.copydefault) {
                            int i12 = $11 + 107;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            cArr5[ze.AEQbTJ] = (char) (cArr4[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                            java.lang.Object[] objArr4 = {ze, ze};
                            java.lang.Object objEZpvd3 = YY.EZpvd(i11);
                            if (objEZpvd3 == null) {
                                byte b2 = (byte) i10;
                                byte b3 = (byte) ($$c[0] - 1);
                                objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                            i10 = 19;
                            i11 = -1317980492;
                        }
                        objArr[0] = new java.lang.String(cArr5);
                        return;
                    }
                    if (KWHzl) {
                        int i14 = $10 + 103;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            ze.copydefault = cArr.length;
                            cArr2 = new char[ze.copydefault];
                            ze.AEQbTJ = 1;
                        } else {
                            ze.copydefault = cArr.length;
                            cArr2 = new char[ze.copydefault];
                            ze.AEQbTJ = 0;
                        }
                        while (ze.AEQbTJ < ze.copydefault) {
                            cArr2[ze.AEQbTJ] = (char) (cArr4[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                            java.lang.Object[] objArr5 = {ze, ze};
                            java.lang.Object objEZpvd4 = YY.EZpvd(-1317980492);
                            if (objEZpvd4 == null) {
                                byte b4 = (byte) ($$c[0] - 1);
                                objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e((byte) 19, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                        }
                        objArr[0] = new java.lang.String(cArr2);
                        return;
                    }
                    ze.copydefault = iArr.length;
                    char[] cArr6 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    int i15 = $10 + 43;
                    while (true) {
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        if (ze.AEQbTJ >= ze.copydefault) {
                            objArr[0] = new java.lang.String(cArr6);
                            return;
                        } else {
                            cArr6[ze.AEQbTJ] = (char) (cArr4[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                            ze.AEQbTJ++;
                            i15 = $10 + 77;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int i, char[] cArr, byte b, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2;
                java.lang.Object obj;
                int i3 = 2 % 2;
                Zg zg = new Zg();
                char[] cArr2 = copydefault;
                int i4 = 555755035;
                java.lang.Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = $11 + 75;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7])};
                            java.lang.Object objEZpvd = YY.EZpvd(i4);
                            if (objEZpvd == null) {
                                byte b2 = (byte) ($$c[0] - 1);
                                byte b3 = b2;
                                objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                            i7++;
                            i4 = 555755035;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AEQbTJ)};
                java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
                if (objEZpvd2 == null) {
                    byte b4 = (byte) ($$c[0] - 1);
                    byte b5 = b4;
                    objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i8 = $10 + 37;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    zg.KWHzl = 0;
                    while (zg.KWHzl < i2) {
                        zg.AEQbTJ = cArr[zg.KWHzl];
                        zg.OLrzqt = cArr[zg.KWHzl + 1];
                        if (zg.AEQbTJ == zg.OLrzqt) {
                            cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                            cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                            obj = obj2;
                        } else {
                            java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                            java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                            if (objEZpvd3 == null) {
                                byte b6 = (byte) ($$c[0] - 1);
                                objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e((byte) 52, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                int i10 = $10 + 3;
                                $11 = i10 % 128;
                                int i11 = i10 % 2;
                                java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                if (objEZpvd4 == null) {
                                    byte b7 = (byte) ($$c[0] - 1);
                                    objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e((byte) 55, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                obj = null;
                                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                int i12 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[iIntValue];
                                cArr4[zg.KWHzl + 1] = cArr2[i12];
                            } else {
                                obj = null;
                                if (zg.copydefault == zg.EZpvd) {
                                    int i13 = $10 + 17;
                                    $11 = i13 % 128;
                                    int i14 = i13 % 2;
                                    zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                    zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                    int i15 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                    int i16 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[i15];
                                    cArr4[zg.KWHzl + 1] = cArr2[i16];
                                } else {
                                    int i17 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                    int i18 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                    cArr4[zg.KWHzl] = cArr2[i17];
                                    cArr4[zg.KWHzl + 1] = cArr2[i18];
                                }
                            }
                        }
                        zg.KWHzl += 2;
                        obj2 = obj;
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void copydefault(long j, long j2) throws java.lang.Throwable {
                java.lang.Object obj;
                int i = 2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(9, new char[]{15, '\n', 4, '\b', 18, 19, 3, '\n', 13929}, (byte) 117, objArr);
                java.lang.Object obj2 = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(30, new char[]{'\"', 21, 19, 17, 4, 24, 16, '\b', 7, 15, '\t', '!', ' ', '#', '\r', ' ', 24, 29, 13919, 13919, 4, 15, 19, 5, 3, 19, 19, '#', 26, '#'}, (byte) 106, objArr2);
                    java.lang.String str = (java.lang.String) objArr2[0];
                    int i2 = AhwBna + 93;
                    gEmmrt = i2 % 128;
                    if (i2 % 2 == 0) {
                        java.lang.Object[] objArr3 = new java.lang.Object[0];
                        objArr3[0] = str;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(null, null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, new byte[]{-123, -124, -125, -126, -126, -127}, objArr4);
                        java.lang.String str2 = (java.lang.String) objArr4[0];
                        java.lang.Class[] clsArr = new java.lang.Class[0];
                        clsArr[1] = java.lang.String.class;
                        java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod(str2, clsArr);
                        method.setAccessible(true);
                        method.invoke(objNewInstance, objArr3);
                    } else {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(null, null, 127, new byte[]{-123, -124, -125, -126, -126, -127}, objArr5);
                        java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr5[0], java.lang.String.class);
                        method2.setAccessible(true);
                        method2.invoke(objNewInstance, str);
                    }
                    java.lang.Object[] objArr6 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-123, -124, -125, -126, -126, -127}, objArr7);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], java.lang.Long.TYPE);
                    method3.setAccessible(true);
                    method3.invoke(objNewInstance, objArr6);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-114, -125, -116, -127, -124, -127, -115, -116, -118, -117, -127, -119, -122, -124, -118, -119, -121, -120, -125, -121, -125, -122}, objArr8);
                    java.lang.String str3 = (java.lang.String) objArr8[0];
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-116, -124, -119, -114, -121, -113, -118, -121}, objArr9);
                    java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr9[0], null);
                    method4.setAccessible(true);
                    java.lang.Object objInvoke = method4.invoke(objNewInstance, null);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-116, -111, -112}, objArr10);
                    java.lang.String str4 = (java.lang.String) objArr10[0];
                    int i3 = gEmmrt + 45;
                    AhwBna = i3 % 128;
                    int i4 = i3 % 2;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(21, new char[]{' ', '#', '\r', ' ', 24, 26, 15, '\t', 28, 19, 13928, 13928, 29, 18, 17, 19, '\b', 20, 2, 15, 13914}, (byte) 114, objArr11);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objInvoke, str4);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(23, new char[]{17, 27, 7, '\n', 15, 24, 5, '\"', 24, 21, 15, '\t', 28, 3, 22, 0, 4, 5, 19, 5, 1, '\n', 13890}, (byte) 67, objArr12);
                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).toString()};
                        java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                        declaredConstructor2.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                    }
                    int i5 = AhwBna + 69;
                    gEmmrt = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj = pUU.class.getField("copydefault").get(null);
                        int i6 = 30 / 0;
                    } else {
                        obj = pUU.class.getField("copydefault").get(null);
                    }
                    int i7 = gEmmrt + 47;
                    AhwBna = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 4 / 2;
                    }
                    java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method6.setAccessible(true);
                    method6.invoke(null, obj);
                    java.lang.Object[] objArr14 = {str3, objInvoke};
                    java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method7.setAccessible(true);
                    method7.invoke(obj, objArr14);
                    int i9 = AhwBna + 103;
                    gEmmrt = i9 % 128;
                    if (i9 % 2 == 0) {
                        byte b = $$a[6];
                        byte b2 = (byte) (-b);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c(b, b2, b2, objArr15);
                        java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                        method8.setAccessible(false);
                        java.lang.Object objInvoke2 = method8.invoke(obj2, null);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(76, new char[]{5, '\"', '\b', 17, 28, 2, ' ', '\r', 27, '\n', 15, '\t', '\f', 2}, (byte) 110, objArr16);
                        DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).setBoolean(objInvoke2, false);
                    } else {
                        byte b3 = $$a[6];
                        byte b4 = (byte) (-b3);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr17);
                        java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                        method9.setAccessible(true);
                        java.lang.Object objInvoke3 = method9.invoke(obj2, null);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(14, new char[]{5, '\"', '\b', 17, 28, 2, ' ', '\r', 27, '\n', 15, '\t', '\f', 2}, (byte) 103, objArr18);
                        DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).setBoolean(objInvoke3, true);
                    }
                    byte[] bArr = $$a;
                    byte b5 = bArr[6];
                    byte b6 = (byte) (-b5);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    c(b5, b6, b6, objArr19);
                    java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                    method10.setAccessible(true);
                    java.lang.Object objInvoke4 = method10.invoke(obj2, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-118, -107, -124, -108, -116, -109, -110, -125, -123}, objArr20);
                    DetectionInfoBean.class.getField((java.lang.String) objArr20[0]).set(objInvoke4, lValueOf);
                    int i10 = AhwBna + 17;
                    gEmmrt = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte b7 = (byte) ($$b & 29);
                        byte b8 = bArr[13];
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        c(b7, b8, b8, objArr21);
                        java.lang.reflect.Method method11 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr21[0], null);
                        method11.setAccessible(true);
                        method11.invoke(obj2, null);
                        return;
                    }
                    byte b9 = (byte) ($$b & 29);
                    byte b10 = bArr[13];
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    c(b9, b10, b10, objArr22);
                    java.lang.reflect.Method method12 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr22[0], null);
                    method12.setAccessible(true);
                    method12.invoke(obj2, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.AhwBna(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.lang.Integer AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.Integer valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final InterfaceC58261yxu EZpvd(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.gEmmrt((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.valueOf(function1, obj);
            }
        });
    }

    public static final java.lang.Integer gEmmrt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.String values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    @Override // o.AbstractC12784ctX
    public AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCD.KWHzl(str, this, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCD.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.String KWHzl(java.lang.String str, cCD ccd, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return xXW.OLrzqt.AEQbTJ(str, str2, ccd.gHZMYf(), true);
    }

    @Override // o.AbstractC12784ctX
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = KWHzl().iterator();
        java.lang.String strAddS$default = "0";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((AbstractC12782ctV) it.next()).OLrzqt(str), null, null, null, 14, null);
        }
        return strAddS$default;
    }

    @Override // o.AbstractC12784ctX
    public java.lang.String ejfBZ() {
        java.util.Iterator<T> it = KWHzl().iterator();
        java.lang.String strAddS$default = "0";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((AbstractC12782ctV) it.next()).UlJrfe(), null, null, null, 14, null);
        }
        return strAddS$default;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cCD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AbstractC12784ctX KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            cCD ccd = new cCD();
            ccd.AhwBna(UUID.randomUUID().toString());
            ccd.gEmmrt(str);
            ccd.OLrzqt(java.lang.System.currentTimeMillis());
            return ccd;
        }
    }
}
