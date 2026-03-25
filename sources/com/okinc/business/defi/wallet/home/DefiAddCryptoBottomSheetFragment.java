package com.okinc.business.defi.wallet.home;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.wallet.home.DefiAddCryptoBottomSheetFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52789wYk;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C32866mlf;
import o.C33070mpX;
import o.C44103sDl;
import o.C52781wYc;
import o.C55371xig;
import o.C56390yDp;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DefiAddCryptoBottomSheetFragment extends AbstractC52789wYk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity copydefault;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.DefiAddCryptoBottomSheetFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final DefiAddCryptoBottomSheetFragment copydefault() {
            return new DefiAddCryptoBottomSheetFragment();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType FROM_EXCHANGE = new ButtonType("FROM_EXCHANGE", 0);
        public static final ButtonType ON_CHAIN = new ButtonType("ON_CHAIN", 1);
        public static final ButtonType BUY_CRYPTO = new ButtonType("BUY_CRYPTO", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{FROM_EXCHANGE, ON_CHAIN, BUY_CRYPTO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ButtonType> getEntries() {
            return $ENTRIES;
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buttonTypeArr$values);
        }

        private ButtonType(String str, int i) {
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.eMJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    DefiAddCryptoBottomSheetFragment.AYXKKw(this.OLrzqt);
                }
            });
        }
    }

    public static final void AYXKKw(DefiAddCryptoBottomSheetFragment defiAddCryptoBottomSheetFragment) {
        rVN.reportFullyDrawn$default((Fragment) defiAddCryptoBottomSheetFragment, true, (String) null, 2, (Object) null);
    }

    private final void AEQbTJ() {
        ArrayList arrayList = new ArrayList(3);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C55371xig c55371xig = new C55371xig(fragmentActivityRequireActivity, null, 2, null);
        c55371xig.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatTextKey));
        c55371xig.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatLongKey));
        c55371xig.setImageDrawable(ContextCompat.getDrawable(requireActivity(), C13754dXa.Activity.wlaJM));
        c55371xig.setClickCallback(new Function0() { // from class: o.eME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiAddCryptoBottomSheetFragment.EZpvd(this.EZpvd);
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        C55371xig c55371xig2 = new C55371xig(fragmentActivityRequireActivity2, null, 2, null);
        c55371xig2.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatApi21Builder));
        c55371xig2.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatApi21));
        c55371xig2.setImageDrawable(ContextCompat.getDrawable(requireActivity(), C13754dXa.Activity.AuCTelauCTel));
        c55371xig2.setClickCallback(new Function0() { // from class: o.eMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiAddCryptoBottomSheetFragment.OLrzqt(this.EZpvd);
            }
        });
        arrayList.add(c55371xig);
        arrayList.add(c55371xig2);
        OLrzqt(arrayList);
    }

    public static final Unit EZpvd(DefiAddCryptoBottomSheetFragment defiAddCryptoBottomSheetFragment) {
        C32866mlf.onEvent$default("Web3Onboarding_Sheet_FirstDepositMethod_Click", (TrackChannel[]) null, new Function1() { // from class: o.eMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiAddCryptoBottomSheetFragment.gEmmrt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        defiAddCryptoBottomSheetFragment.copydefault();
        defiAddCryptoBottomSheetFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(FirebaseAnalytics.Param.METHOD, "withdraw_from_exchange", false));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DefiAddCryptoBottomSheetFragment defiAddCryptoBottomSheetFragment) {
        C32866mlf.onEvent$default("Web3Onboarding_Sheet_FirstDepositMethod_Click", (TrackChannel[]) null, new Function1() { // from class: o.eMD
            private static final byte[] $$c = {59, 54, -122, -120};
            private static final int $$d = 40;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {122, -2, -85, 4, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
            private static final int $$b = 17;
            private static int AYXKKw = 0;
            private static int gEmmrt = 1;
            private static char[] AEQbTJ = {62486, 62586, 62588, 62585, 62472, 62587, 62576, 62482, 62564, 62567, 62581, 62471, 62580, 62565, 62921, 62582, 62577, 62590, 62485, 62583, 62578, 62589, 62511, 62492, 62490, 62493, 62566, 62575, 62504, 62480, 62579};
            private static int KWHzl = 585627113;
            private static boolean copydefault = true;
            private static boolean EZpvd = true;
            private static int OLrzqt = 1694165019;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i, short s, byte b) {
                int i2;
                byte[] bArr = $$c;
                int i3 = b + 99;
                int i4 = (i * 3) + 1;
                int i5 = s + 4;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i6 = i4;
                    i2 = 0;
                    i3 += -i6;
                    i5++;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i6 = bArr[i5];
                    i3 += -i6;
                    i5++;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                    }
                } else {
                    i2 = 0;
                    i5++;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, short s, byte b, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4;
                byte[] bArr = $$a;
                int i5 = s + 4;
                int i6 = 99 - (i * 20);
                int i7 = (b * 5) + 6;
                byte[] bArr2 = new byte[i7];
                if (bArr == null) {
                    i3 = i5;
                    int i8 = i7;
                    i4 = 0;
                    i5 = i5 + i8 + 8;
                    i2 = i4;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i4 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i8 = bArr[i3];
                    i5 = i5 + i8 + 8;
                    i2 = i4;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i4 == i7) {
                    }
                } else {
                    i2 = 0;
                    i5 = i6;
                    i3 = i5;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i4 == i7) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = gEmmrt + 5;
                AYXKKw = i2 % 128;
                EventParamsList eventParamsList = (EventParamsList) obj;
                if (i2 % 2 != 0) {
                    DefiAddCryptoBottomSheetFragment.EZpvd(eventParamsList);
                    throw null;
                }
                Unit unitEZpvd = DefiAddCryptoBottomSheetFragment.EZpvd(eventParamsList);
                int i3 = gEmmrt + 91;
                AYXKKw = i3 % 128;
                int i4 = i3 % 2;
                return unitEZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, char[] cArr, int i2, int i3, boolean z, java.lang.Object[] objArr) throws java.lang.Throwable {
                java.lang.Throwable cause;
                int i4 = 2 % 2;
                Zl zl = new Zl();
                char[] cArr2 = new char[i3];
                zl.OLrzqt = 0;
                int i5 = $11 + 115;
                while (true) {
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    if (zl.OLrzqt >= i3) {
                        break;
                    }
                    int i7 = $11 + 29;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    zl.KWHzl = cArr[zl.OLrzqt];
                    cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
                    int i9 = zl.OLrzqt;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i9]), java.lang.Integer.valueOf(OLrzqt)};
                        java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                        if (objEZpvd == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e(b, b2, (byte) (b2 & 17)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr3 = {zl, zl};
                        java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                        if (objEZpvd2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, b4, (byte) (b4 & 16)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                        i5 = $11 + 109;
                    } catch (java.lang.Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    int i10 = $11 + 79;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    zl.AEQbTJ = i2;
                    char[] cArr3 = new char[i3];
                    java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
                    java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
                }
                if (!(!z)) {
                    char[] cArr4 = new char[i3];
                    zl.OLrzqt = 0;
                    while (zl.OLrzqt < i3) {
                        cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                        java.lang.Object[] objArr4 = {zl, zl};
                        java.lang.Object objEZpvd3 = YY.EZpvd(654343494);
                        if (objEZpvd3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b5, b6, (byte) (b6 & 16)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new java.lang.String(cArr2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [152=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int i, char[] cArr, int[] iArr, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Ze ze = new Ze();
                char[] cArr2 = AEQbTJ;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i3 = $11 + 125;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                            java.lang.Object objEZpvd = YY.EZpvd(-855574269);
                            if (objEZpvd == null) {
                                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
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
                try {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(KWHzl)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-1914793274);
                    if (objEZpvd2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e(b, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                    int i6 = -1317980492;
                    if (EZpvd) {
                        int i7 = $10 + 61;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        ze.copydefault = bArr.length;
                        char[] cArr4 = new char[ze.copydefault];
                        ze.AEQbTJ = 0;
                        int i9 = $10 + 97;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        while (ze.AEQbTJ < ze.copydefault) {
                            int i11 = $11 + 35;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                            java.lang.Object[] objArr4 = {ze, ze};
                            java.lang.Object objEZpvd3 = YY.EZpvd(i6);
                            if (objEZpvd3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 - 1);
                                objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b3, b4, (byte) (b4 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                            i6 = -1317980492;
                        }
                        objArr[0] = new java.lang.String(cArr4);
                        return;
                    }
                    if (!copydefault) {
                        ze.copydefault = iArr.length;
                        char[] cArr5 = new char[ze.copydefault];
                        ze.AEQbTJ = 0;
                        while (ze.AEQbTJ < ze.copydefault) {
                            cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                            ze.AEQbTJ++;
                        }
                        objArr[0] = new java.lang.String(cArr5);
                        return;
                    }
                    int i13 = $10 + 67;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    ze.copydefault = cArr.length;
                    char[] cArr6 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    while (ze.AEQbTJ < ze.copydefault) {
                        cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                        try {
                            java.lang.Object[] objArr5 = {ze, ze};
                            java.lang.Object objEZpvd4 = YY.EZpvd(-1317980492);
                            if (objEZpvd4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b5, b6, (byte) (b6 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new java.lang.String(cArr6);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void KWHzl(long j, long j2) throws java.lang.Throwable {
                int i = 2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(127, null, null, new byte[]{-122, -126, -121, -122, -123, -124, -125, -126, -127}, objArr);
                java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-105, -110, -112, -123, -108, -106, -106, -123, -127, -107, -119, -108, -115, -109, -110, -112, -115, -111, -112, -113, -114, -118, -126, -124, -115, -116, -117, -118, -123, -119, -120}, objArr2);
                    java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-117, -122, -115, -124, -124, -123}, objArr4);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, objArr3);
                    int i2 = gEmmrt + 97;
                    AYXKKw = i2 % 128;
                    int i3 = i2 % 2;
                    java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-117, -122, -115, -124, -124, -123}, objArr6);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-118, -115, -107, -123, -122, -123, -104, -107, -126, -106, -123, -121, -109, -122, -126, -121, -114, -112, -115, -114, -115, -109}, objArr7);
                    java.lang.String str = (java.lang.String) objArr7[0];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(107, new char[]{3, 65532, '\t', 4, 65512, '\t', 7, 65534}, 2, 8, false, objArr8);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                    method3.setAccessible(true);
                    java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(109, new char[]{65530, 6, 0}, 3, 3, true, objArr9);
                    java.lang.Object[] objArr10 = {objInvoke, (java.lang.String) objArr9[0]};
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(102, new char[]{65512, 5, 65533, 65535, 2, 65533, '\f', 65535, 14, 65535, 7, 65531, '\f', 65531, 65514, 6, 6, 15, 65512, 14, '\t'}, 6, 21, true, objArr11);
                    java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objArr10);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(127, null, null, new byte[]{-115, -100, -121, -106, -123, -121, -114, -121, -122, -121, -113, -114, -126, -122, -113, -101, -121, -113, -107, -126, -102, -110, -103}, objArr12);
                        java.lang.String string = ((java.lang.String) objArr12[0]).toString();
                        int i4 = gEmmrt + 5;
                        AYXKKw = i4 % 128;
                        if (i4 % 2 == 0) {
                            java.lang.Object[] objArr13 = {string};
                            java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                            declaredConstructor2.setAccessible(true);
                            throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                        }
                        java.lang.Object[] objArr14 = new java.lang.Object[0];
                        objArr14[1] = string;
                        java.lang.Class[] clsArr = new java.lang.Class[0];
                        clsArr[1] = java.lang.String.class;
                        java.lang.reflect.Constructor declaredConstructor3 = java.lang.IllegalStateException.class.getDeclaredConstructor(clsArr);
                        declaredConstructor3.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor3.newInstance(objArr14));
                    }
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    int i5 = gEmmrt + 63;
                    AYXKKw = i5 % 128;
                    int i6 = i5 % 2;
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, obj2);
                    int i7 = AYXKKw + 125;
                    gEmmrt = i7 % 128;
                    int i8 = i7 % 2;
                    java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method6.setAccessible(true);
                    method6.invoke(obj2, str, objInvoke);
                    byte[] bArr = $$a;
                    byte b = bArr[13];
                    byte b2 = bArr[6];
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(b, (byte) (-b2), b2, objArr15);
                    java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                    method7.setAccessible(true);
                    java.lang.Object objInvoke2 = method7.invoke(obj, null);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-117, -115, -111, -112, -123, -114, -114, -99, -118, -115, -107, -107, -119, -108, -115, -109, -101, -121}, objArr16);
                    DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).setBoolean(objInvoke2, true);
                    int i9 = AYXKKw;
                    int i10 = i9 + 35;
                    gEmmrt = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 119;
                    gEmmrt = i12 % 128;
                    if (i12 % 2 == 0) {
                        byte b3 = bArr[13];
                        byte b4 = bArr[6];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c(b3, (byte) (-b4), b4, objArr17);
                        java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                        method8.setAccessible(true);
                        java.lang.Object objInvoke3 = method8.invoke(obj, null);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(28, null, null, new byte[]{-126, -97, -122, -98, -107, -119, -108, -115, -117}, objArr18);
                        DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).set(objInvoke3, lValueOf);
                    } else {
                        byte b5 = bArr[13];
                        byte b6 = bArr[6];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(b5, (byte) (-b6), b6, objArr19);
                        java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                        method9.setAccessible(true);
                        java.lang.Object objInvoke4 = method9.invoke(obj, null);
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(127, null, null, new byte[]{-126, -97, -122, -98, -107, -119, -108, -115, -117}, objArr20);
                        DetectionInfoBean.class.getField((java.lang.String) objArr20[0]).set(objInvoke4, lValueOf2);
                    }
                    byte b7 = bArr[6];
                    byte b8 = bArr[13];
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    c(b7, (byte) (b7 | 8), b8, objArr21);
                    java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr21[0], null);
                    method10.setAccessible(true);
                    method10.invoke(obj, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }, 1, (Object) null);
        defiAddCryptoBottomSheetFragment.KWHzl();
        defiAddCryptoBottomSheetFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(FirebaseAnalytics.Param.METHOD, "receive_by_qr", false));
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("app_noAsset_receive_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        C32866mlf.onEvent$default("Web3HomePageZeroAssets_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.eMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiAddCryptoBottomSheetFragment.valueOf((EventParamsList) obj);
            }
        }, 1, (Object) null);
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = this.copydefault;
        if (activity != null) {
            activity.copydefault(BundleKt.bundleOf(C56390yDp.OLrzqt("button_type", "ON_CHAIN")));
        }
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "send_using_address", true);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C32866mlf.onEvent$default("app_noAsset_withdraw_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        C32866mlf.onEvent$default("Web3HomePageZeroAssets_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.eML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiAddCryptoBottomSheetFragment.AYXKKw((EventParamsList) obj);
            }
        }, 1, (Object) null);
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = this.copydefault;
        if (activity != null) {
            activity.copydefault(BundleKt.bundleOf(C56390yDp.OLrzqt("button_type", "FROM_EXCHANGE")));
        }
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "transfer_from_okxexchange", true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
        show(fragmentManager, str);
    }
}
