package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.find_ui.ranking.BaseRankingFragment$changeAnimState$1$1;
import com.okinc.find_ui.ranking.BaseRankingFragment$performLongClick$1$1;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.unify_find.viewmodel.RankModel;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C44103sDl;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34904nlJ extends AbstractC27793kDo implements InterfaceC34987nmn, MarketToolDialog.TaskDescription {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public InterfaceC34915nlU AhwBna;
    public final boolean AkhnZx;
    public C55525xlb KWHzl;
    public int OLrzqt;
    public android.widget.FrameLayout fARcdN;
    public C55052xcf fJNWhG;
    public int isConnected;
    public Job valueOf;
    public boolean copydefault = true;
    public final boolean fetchVPNInfo = true;
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.nlO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC34904nlJ.AEQbTJ();
        }
    });
    public boolean values = true;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.nlM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC34904nlJ.OLrzqt(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.nlJ$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.values = z;
    }

    public java.lang.String AkhnZx() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(int i) {
        switch (i) {
            case 0:
                return "hot-rank";
            case 1:
                return "gainers-rank";
            case 2:
                return "losers-rank";
            case 3:
                return "new-coin-rank";
            case 4:
                return "hot-fever-rank";
            case 5:
                return "Market-cap-rank";
            case 6:
                return "turn-over-rank";
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.fetchVPNInfo;
    }

    public abstract RankModel fIwbmz();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55525xlb fetchVPNInfo() {
        return this.KWHzl;
    }

    public void getNewProxyInstance() {
    }

    public void hDKMBd() {
    }

    public boolean iwGUEr() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return "discover_ranking_list";
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt KWHzl() {
        return (C38383pWt) this.ejfBZ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38383pWt AEQbTJ() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        rVN.copydefault(this);
        hDKMBd();
        C55052xcf c55052xcf = this.fJNWhG;
        if (c55052xcf != null) {
            c55052xcf.setTitle(C55634xne.copydefault.KWHzl());
        }
    }

    @Override // o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.fARcdN = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.OKSWiw);
        ejfBZ();
        getFieldNames();
    }

    public final void ejfBZ() {
        try {
            android.os.Bundle arguments = getArguments();
            java.lang.Integer numValueOf = arguments != null ? java.lang.Integer.valueOf(arguments.getInt("CURRENT_PAGE_NUM", 0)) : null;
            Intrinsics.copydefault(numValueOf);
            this.OLrzqt = numValueOf.intValue();
            android.os.Bundle arguments2 = getArguments();
            this.AEQbTJ = arguments2 != null ? arguments2.getBoolean("is_detail_page", false) : false;
            android.os.Bundle arguments3 = getArguments();
            java.lang.Integer numValueOf2 = arguments3 != null ? java.lang.Integer.valueOf(arguments3.getInt("PAGE_FROM", 0)) : null;
            Intrinsics.copydefault(numValueOf2);
            this.isConnected = numValueOf2.intValue();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o.nlJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC34987nmn
    public void OLrzqt(@NotNull android.view.View view, int i, C55525xlb c55525xlb) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(getClass().getName());
        if (((fragmentFindFragmentByTag instanceof C32995moB) && ((C32995moB) fragmentFindFragmentByTag).isAdded()) || c55525xlb == null) {
            return;
        }
        this.KWHzl = c55525xlb;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseRankingFragment$performLongClick$1$1(this, c55525xlb, iArr, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }

    public MarketCoinInfo OLrzqt(@NotNull C55525xlb c55525xlb) {
        Intrinsics.checkNotNullParameter(c55525xlb, "");
        return new MarketCoinInfo(c55525xlb.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
    }

    @Override // o.InterfaceC34987nmn
    public void copydefault(int i) {
        int i2 = this.isConnected;
        if (i2 != 0 && i2 == 1) {
            KWHzl(WalletSearchRequest.SEARCH_SOURCE_DISCOVER, OLrzqt(i));
        } else {
            KWHzl("page_home", OLrzqt(i));
        }
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        intent.putExtra("ranking_id", i);
        intent.putExtra("ranking_tab_key", KWHzl(i));
        startActivity(intent);
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "page_home")) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("HomePage_Ranking_ViewAll_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nlH
                private static short[] djBIcL;
                private static final byte[] $$c = {Ascii.SYN, Ascii.EM, 71, 62};
                private static final int $$d = 11;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {57, -92, 62, -26, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
                private static final int $$b = 23;
                private static int AhwBna = 0;
                private static int fetchVPNInfo = 1;
                private static int EZpvd = 1996896508;
                private static int copydefault = 1640963155;
                private static int OLrzqt = -254653257;
                private static byte[] gEmmrt = {-70, -12, Ascii.CR, -16, 6, -6, 8, -11, 39, -63, -60, 3, 9, -12, -3, Ascii.VT, 0, Ascii.NAK, -38, 8, -16, Ascii.CAN, -2, -4, 3, 35, -47, 3, -11, -10, Ascii.SO, 72, -89, 9, 8, -12, 0, Ascii.CAN, -27, -7, Ascii.SUB, -25, 37, -75, 6, -11, Ascii.CR, -8, 6, Ascii.US, -19, -13, 8, 0, -13, 46, -35, -12, Ascii.CR, -2, Ascii.SUB, -11, -6, 4, 42, -70, 2, -13, 46, -23, -7, Ascii.CAN, -10, 10};
                private static char[] AYXKKw = {11792, 11745, 11788, 11822, 11787, 11807, 11748, 11789, 11835, 11744, 11786, 11831, 11801, 11821, 11750, 11804, 11795, 11780, 11820, 11870, 11798, 11806, 11825, 11751, 11793, 11794, 11805, 11803, 11790, 11824, 11749, 11799, 11802, 11826, 11797, 11800};
                private static char valueOf = 7138;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static java.lang.String $$e(byte b, short s, short s2) {
                    int i;
                    int i2 = (s * 2) + 1;
                    int i3 = s2 + 65;
                    int i4 = 3 - (b * 3);
                    byte[] bArr = $$c;
                    byte[] bArr2 = new byte[i2];
                    if (bArr == null) {
                        int i5 = i2;
                        i = 0;
                        i3 += -i5;
                        i4++;
                        bArr2[i] = (byte) i3;
                        i++;
                        if (i == i2) {
                            return new java.lang.String(bArr2, 0);
                        }
                        i5 = bArr[i4];
                        i3 += -i5;
                        i4++;
                        bArr2[i] = (byte) i3;
                        i++;
                        if (i == i2) {
                        }
                    } else {
                        i = 0;
                        i4++;
                        bArr2[i] = (byte) i3;
                        i++;
                        if (i == i2) {
                        }
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
                    int i;
                    int i2;
                    int i3 = 13 - (b2 * 10);
                    int i4 = 99 - (s * 20);
                    int i5 = b * 5;
                    byte[] bArr = $$a;
                    byte[] bArr2 = new byte[11 - i5];
                    int i6 = 10 - i5;
                    if (bArr == null) {
                        int i7 = i3;
                        int i8 = 0;
                        i3 = i3 + (-i4) + 8;
                        i2 = i7;
                        i = i8;
                        bArr2[i] = (byte) i3;
                        if (i == i6) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        int i9 = i2 + 1;
                        int i10 = i + 1;
                        i7 = i9;
                        i4 = bArr[i9];
                        i8 = i10;
                        i3 = i3 + (-i4) + 8;
                        i2 = i7;
                        i = i8;
                        bArr2[i] = (byte) i3;
                        if (i == i6) {
                        }
                    } else {
                        i = 0;
                        i2 = i3;
                        i3 = i4;
                        bArr2[i] = (byte) i3;
                        if (i == i6) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i = 2 % 2;
                    int i2 = AhwBna + 109;
                    fetchVPNInfo = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitCopydefault = AbstractC34904nlJ.copydefault(str, str2, (EventParamsList) obj);
                    int i4 = AhwBna + 33;
                    fetchVPNInfo = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitCopydefault;
                    }
                    throw null;
                }

                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void a(int i, int i2, byte b, short s, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
                    char c;
                    int i4 = 2 % 2;
                    Zj zj = new Zj();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(copydefault)};
                        java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
                        if (objEZpvd == null) {
                            objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                        boolean z = iIntValue == -1;
                        if (z) {
                            int i5 = $10 + 63;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                            byte[] bArr = gEmmrt;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                                    java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                                    if (objEZpvd2 == null) {
                                        objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                                    }
                                    bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                byte[] bArr3 = gEmmrt;
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(EZpvd)};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                                if (objEZpvd3 == null) {
                                    objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr3[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) copydefault) ^ (-2166281683126510581L))));
                            } else {
                                iIntValue = (short) (((short) (((long) djBIcL[i3 + ((int) (((long) EZpvd) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) copydefault) ^ (-2166281683126510581L))));
                            }
                        }
                        if (iIntValue > 0) {
                            zj.OLrzqt = ((i3 + iIntValue) - 2) + ((int) (((long) EZpvd) ^ (-2166281683126510581L))) + (!(z ^ true) ? 1 : 0);
                            java.lang.Object[] objArr5 = {zj, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(OLrzqt), sb};
                            java.lang.Object objEZpvd4 = YY.EZpvd(-2015189563);
                            if (objEZpvd4 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e(b2, b3, (byte) (b3 | 46)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            byte[] bArr4 = gEmmrt;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i8 = 0; i8 < length2; i8++) {
                                    bArr5[i8] = (byte) (((long) bArr4[i8]) ^ (-2166281683126510581L));
                                }
                                bArr4 = bArr5;
                            }
                            boolean z2 = bArr4 != null;
                            zj.KWHzl = 1;
                            while (zj.KWHzl < iIntValue) {
                                if (!z2) {
                                    short[] sArr = djBIcL;
                                    zj.OLrzqt = zj.OLrzqt - 1;
                                    zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                } else {
                                    int i9 = $11 + 87;
                                    $10 = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        byte[] bArr6 = gEmmrt;
                                        int i10 = zj.OLrzqt;
                                        zj.OLrzqt = 0;
                                        c = (char) (zj.AEQbTJ << (((byte) (((byte) (((long) bArr6[i10]) ^ (-2166281683126510581L))) * s)) ^ b));
                                    } else {
                                        byte[] bArr7 = gEmmrt;
                                        zj.OLrzqt = zj.OLrzqt - 1;
                                        c = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                    }
                                    zj.EZpvd = c;
                                }
                                sb.append(zj.EZpvd);
                                zj.AEQbTJ = zj.EZpvd;
                                zj.KWHzl++;
                            }
                        }
                        java.lang.String string = sb.toString();
                        int i11 = $11 + 39;
                        $10 = i11 % 128;
                        if (i11 % 2 == 0) {
                            objArr[0] = string;
                        } else {
                            int i12 = 40 / 0;
                            objArr[0] = string;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=6] */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void b(char[] cArr, byte b, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                    int i2;
                    java.lang.Object obj;
                    int i3 = 2 % 2;
                    Zg zg = new Zg();
                    char[] cArr2 = AYXKKw;
                    int i4 = 555755035;
                    java.lang.Object obj2 = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i5 = $11 + 65;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7])};
                                java.lang.Object objEZpvd = YY.EZpvd(i4);
                                if (objEZpvd == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, b3, (byte) (b3 | 55)), new java.lang.Class[]{java.lang.Integer.TYPE});
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
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
                    if (objEZpvd2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b4, b5, (byte) (b5 | 55)), new java.lang.Class[]{java.lang.Integer.TYPE});
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
                        zg.KWHzl = 0;
                        int i8 = $11 + 5;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        while (zg.KWHzl < i2) {
                            zg.AEQbTJ = cArr[zg.KWHzl];
                            zg.OLrzqt = cArr[zg.KWHzl + 1];
                            if (zg.AEQbTJ == zg.OLrzqt) {
                                int i10 = $11 + 89;
                                $10 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ >>> b);
                                    cArr4[zg.KWHzl] = (char) (zg.OLrzqt * b);
                                } else {
                                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                                    cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                                }
                                obj = obj2;
                            } else {
                                java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                                if (objEZpvd3 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b6, b7, (byte) (b7 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                    java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                    java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                    if (objEZpvd4 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                    int i11 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[iIntValue];
                                    cArr4[zg.KWHzl + 1] = cArr2[i11];
                                } else {
                                    obj = null;
                                    if (zg.copydefault == zg.EZpvd) {
                                        zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                        zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                        int i12 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                        int i13 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                        cArr4[zg.KWHzl] = cArr2[i12];
                                        cArr4[zg.KWHzl + 1] = cArr2[i13];
                                    } else {
                                        int i14 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                        int i15 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                        cArr4[zg.KWHzl] = cArr2[i14];
                                        cArr4[zg.KWHzl + 1] = cArr2[i15];
                                    }
                                }
                            }
                            zg.KWHzl += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i16 = 0; i16 < i; i16++) {
                        int i17 = $10 + 1;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                    }
                    java.lang.String str3 = new java.lang.String(cArr4);
                    int i19 = $11 + 35;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    objArr[0] = str3;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                public static void EZpvd(long j, long j2) throws java.lang.Throwable {
                    java.lang.Object objInvoke;
                    java.lang.String str3;
                    int i = 2 % 2;
                    long j3 = j ^ (j2 << 32);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(1860349831, -89, (byte) 0, (short) 0, -382280951, objArr);
                    java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                    int i2 = AhwBna + 1;
                    fetchVPNInfo = i2 % 128;
                    int i3 = i2 % 2;
                    try {
                        java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(1860349835, -89, (byte) 0, (short) 0, -382280942, objArr2);
                        java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(new char[]{4, 29, 29, 28, 2, 30}, (byte) 32, 6, objArr4);
                        java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                        method.setAccessible(true);
                        method.invoke(objNewInstance, objArr3);
                        int i4 = AhwBna + 83;
                        fetchVPNInfo = i4 % 128;
                        int i5 = i4 % 2;
                        java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(new char[]{4, 29, 29, 28, 2, 30}, (byte) 32, 6, objArr6);
                        java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                        method2.setAccessible(true);
                        method2.invoke(objNewInstance, objArr5);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(1860349832, -89, (byte) 0, (short) 0, -382280908, objArr7);
                        java.lang.String str4 = (java.lang.String) objArr7[0];
                        int i6 = AhwBna + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        fetchVPNInfo = i6 % 128;
                        if (i6 % 2 == 0) {
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(new char[]{6, 28, 16, 7, 1, ' ', 6, 18}, (byte) 114, 93, objArr8);
                            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                            method3.setAccessible(false);
                            objInvoke = method3.invoke(objNewInstance, null);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(new char[]{'\r', '\n', 13871}, (byte) 2, 5, objArr9);
                            str3 = (java.lang.String) objArr9[0];
                        } else {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(new char[]{6, 28, 16, 7, 1, ' ', 6, 18}, Ascii.EM, 8, objArr10);
                            java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr10[0], null);
                            method4.setAccessible(true);
                            objInvoke = method4.invoke(objNewInstance, null);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b(new char[]{'\r', '\n', 13871}, (byte) 50, 3, objArr11);
                            str3 = (java.lang.String) objArr11[0];
                        }
                        int i7 = AhwBna + 125;
                        fetchVPNInfo = i7 % 128;
                        int i8 = i7 % 2;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        b(new char[]{' ', 26, 28, 27, '#', 28, 28, 6, 28, 5, 13903, 13903, 4, 0, 3, 0, 15, 28, '\t', 28, 13889}, (byte) 89, 21, objArr12);
                        java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr12[0], java.lang.Object.class, java.lang.String.class);
                        method5.setAccessible(true);
                        method5.invoke(null, objInvoke, str3);
                        if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(new char[]{28, 4, 30, 27, '\r', 18, 1, '\r', 18, 1, 28, 6, 25, 1, 1, 30, 7, '\"', 1, 29, '#', '\r', 13846}, Ascii.ETB, 23, objArr13);
                            java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).toString()};
                            java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                            declaredConstructor2.setAccessible(true);
                            throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr14));
                        }
                        java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                        int i9 = fetchVPNInfo + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        AhwBna = i9 % 128;
                        int i10 = i9 % 2;
                        java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                        method6.setAccessible(true);
                        method6.invoke(null, obj2);
                        java.lang.Object[] objArr15 = {str4, objInvoke};
                        java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                        method7.setAccessible(true);
                        method7.invoke(obj2, objArr15);
                        int i11 = fetchVPNInfo + 1;
                        AhwBna = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr = $$a;
                            byte b = bArr[13];
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            c(b, (byte) (-bArr[6]), b, objArr16);
                            java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
                            method8.setAccessible(true);
                            java.lang.Object objInvoke2 = method8.invoke(obj, null);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            b(new char[]{1, '\r', 22, 0, 13921, 13921, 30, 1, 17, 6, 2, 6, 22, '\n', 29, 1, 6, 28, 13909}, (byte) 108, 0, objArr17);
                            DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).setBoolean(objInvoke2, true);
                        } else {
                            byte[] bArr2 = $$a;
                            byte b2 = bArr2[13];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            c(b2, (byte) (-bArr2[6]), b2, objArr18);
                            java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                            method9.setAccessible(true);
                            java.lang.Object objInvoke3 = method9.invoke(obj, null);
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            b(new char[]{1, '\r', 22, 0, 13921, 13921, 30, 1, 17, 6, 2, 6, 22, '\n', 29, 1, 6, 28, 13909}, (byte) 109, 19, objArr19);
                            DetectionInfoBean.class.getField((java.lang.String) objArr19[0]).setBoolean(objInvoke3, true);
                        }
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c(b3, (byte) (-bArr3[6]), b3, objArr20);
                        java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                        method10.setAccessible(true);
                        java.lang.Object objInvoke4 = method10.invoke(obj, null);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(1860349864, -89, (byte) 0, (short) 0, -382280886, objArr21);
                        DetectionInfoBean.class.getField((java.lang.String) objArr21[0]).set(objInvoke4, lValueOf);
                        int i12 = fetchVPNInfo + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        AhwBna = i12 % 128;
                        if (i12 % 2 != 0) {
                            byte b4 = bArr3[6];
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c((byte) (-b4), bArr3[13], (byte) (-b4), objArr22);
                            java.lang.reflect.Method method11 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr22[0], null);
                            method11.setAccessible(true);
                            method11.invoke(obj, null);
                            return;
                        }
                        byte b5 = bArr3[6];
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        c((byte) (-b5), bArr3[13], (byte) (-b5), objArr23);
                        java.lang.reflect.Method method12 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr23[0], null);
                        method12.setAccessible(true);
                        method12.invoke(obj, null);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("DiscoverPage_Ranking_ViewAll_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nlF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34904nlJ.AEQbTJ(str, str2, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", str, false);
        eventParamsList.put("sub_tab", str2, false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", str, false);
        eventParamsList.put("sub_tab", str2, false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? "RANKING_HOT_CRYPTO" : "RANKING_LARGEST_TURNOVER" : "RANKING_LARGEST_MKT_CAP" : Intrinsics.EZpvd((java.lang.Object) C55633xnd.getStableText$default(null, 1, null), (java.lang.Object) "USDT") ? "RANKING_NEW_LISTINGS" : "RANKING_NEW_LISTINGS_SPOT" : "RANKING_TOP_LOSERS" : "RANKING_TOP_GAINERS";
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        C55525xlb c55525xlb;
        java.lang.String strCopydefault;
        RankModel rankModelIsConnected;
        java.lang.String strValueOf;
        RankModel rankModelIsConnected2;
        Intrinsics.checkNotNullParameter(action, "");
        C55525xlb c55525xlb2 = this.KWHzl;
        WatchListData watchListDataOLrzqt = (c55525xlb2 == null || (strCopydefault = c55525xlb2.copydefault()) == null || (rankModelIsConnected = isConnected()) == null || (strValueOf = rankModelIsConnected.valueOf(strCopydefault)) == null || (rankModelIsConnected2 = isConnected()) == null) ? null : rankModelIsConnected2.OLrzqt(strValueOf, "SPOT");
        if (action == MarketToolDialog.Action.STAR) {
            if (watchListDataOLrzqt != null && (c55525xlb = this.KWHzl) != null) {
                AEQbTJ(watchListDataOLrzqt, c55525xlb);
            }
            C32866mlf.onEvent$default("TokenList_Longpress_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.nlS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34904nlJ.EZpvd(this.OLrzqt, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(AbstractC34904nlJ abstractC34904nlJ, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "item_type", "star", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, abstractC34904nlJ.isConnected == 0 ? "rankings_homepage" : "rankings_discover", false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", "", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull WatchListData watchListData, @NotNull final C55525xlb c55525xlb) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        Intrinsics.checkNotNullParameter(c55525xlb, "");
        MutableLiveData<BizResp> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, new StateListAnimator(new Function1() { // from class: o.nlK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC34904nlJ.EZpvd(c55525xlb, this, (BizResp) obj);
            }
        }));
        if (!Intrinsics.EZpvd(c55525xlb.gEmmrt(), java.lang.Boolean.TRUE)) {
            RankModel rankModelIsConnected = isConnected();
            if (rankModelIsConnected != null) {
                rankModelIsConnected.OLrzqt(watchListData, mutableLiveData);
                return;
            }
            return;
        }
        RankModel rankModelIsConnected2 = isConnected();
        if (rankModelIsConnected2 != null) {
            RankModel.removeWatchList$default(rankModelIsConnected2, watchListData, mutableLiveData, false, 4, null);
        }
    }

    public static final Unit EZpvd(C55525xlb c55525xlb, AbstractC34904nlJ abstractC34904nlJ, BizResp bizResp) {
        if (bizResp.isSuccess()) {
            if (Intrinsics.EZpvd(c55525xlb.gEmmrt(), java.lang.Boolean.TRUE)) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf), 0, 1, (java.lang.Object) null);
                C46688tbr c46688tbr = C46688tbr.KWHzl;
                java.lang.String strAkhnZx = abstractC34904nlJ.AkhnZx();
                c46688tbr.KWHzl(strAkhnZx != null ? strAkhnZx : "Market_Home_Rank", C56423yEv.EZpvd(C56390yDp.OLrzqt("remove fav", c55525xlb.copydefault())));
            } else {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.DTwDnp), 0, 1, (java.lang.Object) null);
                C46688tbr c46688tbr2 = C46688tbr.KWHzl;
                java.lang.String strAkhnZx2 = abstractC34904nlJ.AkhnZx();
                c46688tbr2.KWHzl(strAkhnZx2 != null ? strAkhnZx2 : "Market_Home_Rank", C56423yEv.EZpvd(C56390yDp.OLrzqt("add fav", c55525xlb.copydefault())));
            }
            abstractC34904nlJ.getNewProxyInstance();
        } else {
            C55326xho.toastWithFailedIcon$default(bizResp.getErrorMsg(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final RankModel isConnected() {
        return fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof InterfaceC34915nlU) {
            this.AhwBna = (InterfaceC34915nlU) context;
        }
    }

    public void getFieldNames() {
        MutableLiveData<java.lang.Boolean> mutableLiveDataEjfBZ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataAkhnZx;
        RankModel rankModelIsConnected = isConnected();
        if (rankModelIsConnected != null && (mutableLiveDataAkhnZx = rankModelIsConnected.AkhnZx()) != null) {
            mutableLiveDataAkhnZx.observe(this, new StateListAnimator(new Function1() { // from class: o.nlN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34904nlJ.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
        }
        RankModel rankModelIsConnected2 = isConnected();
        if (rankModelIsConnected2 == null || (mutableLiveDataEjfBZ = rankModelIsConnected2.ejfBZ()) == null) {
            return;
        }
        mutableLiveDataEjfBZ.observe(this, new StateListAnimator(new Function1() { // from class: o.nlL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC34904nlJ.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit KWHzl(AbstractC34904nlJ abstractC34904nlJ, java.lang.Boolean bool) {
        InterfaceC34915nlU interfaceC34915nlU;
        if (!bool.booleanValue() && (interfaceC34915nlU = abstractC34904nlJ.AhwBna) != null) {
            interfaceC34915nlU.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC34904nlJ abstractC34904nlJ, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            abstractC34904nlJ.EZpvd(false);
            if (abstractC34904nlJ.iwGUEr()) {
                abstractC34904nlJ.KWHzl(true);
            }
        } else {
            abstractC34904nlJ.KWHzl(false);
        }
        Intrinsics.copydefault(bool);
        abstractC34904nlJ.copydefault(bool.booleanValue());
        rVN.reportFullyDrawn$default(abstractC34904nlJ, !bool.booleanValue(), (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public void copydefault(boolean z) {
        if (fARcdN() && this.copydefault) {
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            this.copydefault = false;
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    public final void EZpvd(boolean z) {
        android.view.ViewGroup viewGroup;
        if (this.values) {
            Job job = this.valueOf;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            android.view.View view = getView();
            if (view == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
                return;
            }
            if (z) {
                this.valueOf = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseRankingFragment$changeAnimState$1$1(this, viewGroup, null), 3, null);
            } else {
                this.values = false;
                pXA.OLrzqt(viewGroup);
            }
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        InterfaceC55467xkW interfaceC55467xkWValues = values();
        if (interfaceC55467xkWValues == null) {
            return Unit.INSTANCE;
        }
        java.lang.Object objEZpvd = interfaceC55467xkWValues.EZpvd(continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final C55173xeu AuCTel() {
        return (C55173xeu) this.DbNXlk.getValue();
    }

    public static final C55173xeu OLrzqt(AbstractC34904nlJ abstractC34904nlJ) {
        android.content.Context contextRequireContext = abstractC34904nlJ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    public final void KWHzl(boolean z) {
        android.widget.FrameLayout frameLayout = this.fARcdN;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            android.widget.FrameLayout frameLayout2 = this.fARcdN;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                return;
            }
            return;
        }
        C55173xeu c55173xeuAuCTel = AuCTel();
        java.lang.String string = getString(qZH.PendingIntent.DsL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeuAuCTel.setTitle(string);
        AuCTel().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
        C55173xeu c55173xeuAuCTel2 = AuCTel();
        java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeuAuCTel2.setRetry(string2);
        AuCTel().setRetryClickListener(new View.OnClickListener() { // from class: o.nlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC34904nlJ.EZpvd(this.KWHzl, view);
            }
        });
        AuCTel().setEmptyTypeImage(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        AuCTel().setLayoutParams(layoutParams);
        if (AuCTel().getParent() != null) {
            android.view.ViewParent parent = AuCTel().getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(AuCTel());
        }
        android.widget.FrameLayout frameLayout3 = this.fARcdN;
        if (frameLayout3 != null) {
            frameLayout3.addView(AuCTel());
        }
    }

    public static final void EZpvd(AbstractC34904nlJ abstractC34904nlJ, android.view.View view) {
        abstractC34904nlJ.onVisible();
        android.widget.FrameLayout frameLayout = abstractC34904nlJ.fARcdN;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        abstractC34904nlJ.values = true;
        abstractC34904nlJ.EZpvd(true);
    }

    public InterfaceC55467xkW values() {
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC55467xkW) {
            return (InterfaceC55467xkW) activity;
        }
        return null;
    }
}
