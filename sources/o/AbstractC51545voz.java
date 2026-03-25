package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.biz.TacticsType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardProfit;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51071vgB;
import o.C32113mPz;
import o.C48033uCm;
import o.C51624vqY;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49317umK;
import o.InterfaceC8104awT;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC51545voz extends AbstractC59533zio<HomeStrategyCardInfo, ActionBar> {
    public final Function2<HomeStrategyCardInfo, java.lang.Integer, Unit> AEQbTJ;
    public final Function2<HomeStrategyCardInfo, java.lang.Integer, Unit> EZpvd;
    public final boolean KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final java.lang.String copydefault;

    public static final void copydefault(android.view.View view) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 boolean)
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r9v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r10v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r11v0 kotlin.jvm.functions.Function2))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(boolean, kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit>, java.lang.String):void (m)] (LINE:98) call: o.voz.<init>(boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, java.lang.String):void type: THIS */
    public /* synthetic */ AbstractC51545voz(boolean z, Function2 function2, Function1 function1, Function2 function22, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function22, (i & 16) != 0 ? null : str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC51545voz(boolean z, Function2<? super HomeStrategyCardInfo, ? super java.lang.Integer, Unit> function2, Function1<? super java.lang.String, Unit> function1, Function2<? super HomeStrategyCardInfo, ? super java.lang.Integer, Unit> function22, java.lang.String str) {
        this.KWHzl = z;
        this.EZpvd = function2;
        this.OLrzqt = function1;
        this.AEQbTJ = function22;
        this.copydefault = str;
    }

    /* JADX INFO: renamed from: o.voz$ActionBar */
    public static abstract class ActionBar extends RecyclerView.ViewHolder {
        public final C51624vqY AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final android.widget.TextView AhwBna;
        public final android.widget.LinearLayout AkhnZx;
        public final android.widget.TextView AuCTel;
        public final android.widget.TextView DbNXlk;
        public final android.widget.ImageView EZpvd;
        public final android.widget.TextView KWHzl;
        public final C55251xgS OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.TextView ejfBZ;
        public final ConstraintLayout fARcdN;
        public final android.widget.TextView fIwbmz;
        public final C55251xgS fJNWhG;
        public final android.widget.TextView fetchVPNInfo;
        public final C51601vqB gEmmrt;
        public final C55353xiO hDKMBd;
        public final C55258xgZ isConnected;
        public final Group iwGUEr;
        public final C55251xgS uzCIH;
        public final android.view.View valueOf;
        public final android.widget.TextView values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AuCTel() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C51624vqY KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C51601vqB djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView ejfBZ() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConstraintLayout fARcdN() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fJNWhG() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Group getFieldNames() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS getNewProxyInstance() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55258xgZ isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55353xiO uzCIH() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView values() {
            return this.DbNXlk;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.RIuxYh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.DcMfJK);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (C55251xgS) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.zLAIeZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi18);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.isConnected = (C55258xgZ) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.sendMetadata);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.DbNXlk = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi181);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.values = (android.widget.TextView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C48033uCm.Application.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.AuCTel = (android.widget.TextView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C48033uCm.Application.onRetainCustomNonConfigurationInstance);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.fIwbmz = (android.widget.TextView) viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C48033uCm.Application.GiPPlL);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById9;
            android.view.View viewFindViewById10 = view.findViewById(C48033uCm.Application.QDqgQU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById10;
            android.view.View viewFindViewById11 = view.findViewById(C48033uCm.Application.play);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
            this.fetchVPNInfo = (android.widget.TextView) viewFindViewById11;
            android.view.View viewFindViewById12 = view.findViewById(C48033uCm.Application.fdt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "");
            this.gEmmrt = (C51601vqB) viewFindViewById12;
            android.view.View viewFindViewById13 = view.findViewById(C48033uCm.Application.DcMfJKffREWX);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "");
            this.AEQbTJ = (C51624vqY) viewFindViewById13;
            android.view.View viewFindViewById14 = view.findViewById(C48033uCm.Application.setCustomTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "");
            this.fJNWhG = (C55251xgS) viewFindViewById14;
            android.view.View viewFindViewById15 = view.findViewById(C48033uCm.Application.bindView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "");
            this.uzCIH = (C55251xgS) viewFindViewById15;
            android.view.View viewFindViewById16 = view.findViewById(C48033uCm.Application.MediaSessionCompatApi21QueueItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "");
            this.ejfBZ = (android.widget.TextView) viewFindViewById16;
            android.view.View viewFindViewById17 = view.findViewById(C48033uCm.Application.isTransportControlEnabled);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "");
            this.AkhnZx = (android.widget.LinearLayout) viewFindViewById17;
            android.view.View viewFindViewById18 = view.findViewById(C48033uCm.Application.MediaBrowserCompatItemCallback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "");
            this.AYXKKw = (android.widget.TextView) viewFindViewById18;
            android.view.View viewFindViewById19 = view.findViewById(C48033uCm.Application.MediaBrowserCompatItemReceiver);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById19;
            android.view.View viewFindViewById20 = view.findViewById(C48033uCm.Application.jumpToCurrentState);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "");
            this.hDKMBd = (C55353xiO) viewFindViewById20;
            android.view.View viewFindViewById21 = view.findViewById(C48033uCm.Application.isAutoMirrored);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "");
            this.iwGUEr = (Group) viewFindViewById21;
            android.view.View viewFindViewById22 = view.findViewById(C48033uCm.Application.AppCompatDelegateImpl5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "");
            this.fARcdN = (ConstraintLayout) viewFindViewById22;
            android.view.View viewFindViewById23 = view.findViewById(C48033uCm.Application.HJWChPiaHEvk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "");
            this.valueOf = viewFindViewById23;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fe, code lost:
    
        if (r0.equals("recurring") == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030c, code lost:
    
        if (r0.equals("smart_portfolio") == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030f, code lost:
    
        r0 = r38.getCcy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0313, code lost:
    
        if (r0 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0315, code lost:
    
        r0 = o.yDY.AhwBna();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0319, code lost:
    
        r24 = r0;
        r0 = 2;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x02f5. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull ActionBar actionBar, @NotNull HomeStrategyCardInfo homeStrategyCardInfo) {
        java.lang.String strJoinToString$default;
        int i;
        C55320xhi c55320xhiKWHzl;
        int i2;
        C55312xha c55312xhaValueOf;
        java.lang.String pnlRatio;
        java.lang.String botPnl$default;
        java.lang.String algoOrdType;
        int i3;
        java.util.List<java.lang.String> listGEmmrt;
        java.util.List<java.lang.String> list;
        java.lang.String followerCount;
        java.lang.String avatar;
        java.lang.String followerAssets;
        java.lang.String upperCase;
        java.lang.String strAYXKKw;
        C55320xhi c55320xhiKWHzl2;
        java.lang.String strAYXKKw2;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        android.content.Context context = actionBar.itemView.getContext();
        android.widget.TextView textViewOLrzqt = actionBar.OLrzqt();
        java.lang.String algoOrdType2 = homeStrategyCardInfo.getAlgoOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) algoOrdType2, (java.lang.Object) "recurring") || Intrinsics.EZpvd((java.lang.Object) algoOrdType2, (java.lang.Object) "smart_portfolio")) {
            java.util.List<java.lang.String> ccy = homeStrategyCardInfo.getCcy();
            if (ccy == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(ccy, null, null, null, 3, null, null, 55, null)) == null) {
                strJoinToString$default = "";
            }
        } else {
            strJoinToString$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, homeStrategyCardInfo.getInstId(), homeStrategyCardInfo.getInstType(), false, false, 12, null);
        }
        textViewOLrzqt.setText(strJoinToString$default);
        C55251xgS c55251xgSAEQbTJ = actionBar.AEQbTJ();
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(homeStrategyCardInfo.getAlgoOrdType());
        c55251xgSAEQbTJ.setText(tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null);
        android.view.View view = actionBar.itemView;
        view.setOnClickListener(new Application(view, 1000L, context, this, homeStrategyCardInfo, actionBar));
        C55251xgS c55251xgSAEQbTJ2 = actionBar.AEQbTJ();
        java.lang.String algoOrdType3 = homeStrategyCardInfo.getAlgoOrdType();
        if (algoOrdType3 != null) {
            switch (algoOrdType3.hashCode()) {
                case -1831183611:
                    i = !algoOrdType3.equals("spot_dca") ? C52761wXj.TaskDescription.QYvkLl : C52761wXj.TaskDescription.QVMIlxQVMIlx;
                    break;
                case -1402017003:
                    if (algoOrdType3.equals("contract_dca")) {
                        i = C52761wXj.TaskDescription.DcMfJKDIADVb;
                        break;
                    }
                    break;
                case -1216369070:
                    if (algoOrdType3.equals("smart_portfolio")) {
                        i = C52761wXj.TaskDescription.SqfPTR;
                        break;
                    }
                    break;
                case -512749997:
                    if (algoOrdType3.equals("contract_grid")) {
                        i = C52761wXj.TaskDescription.svY;
                        break;
                    }
                    break;
                case 3181382:
                    algoOrdType3.equals("grid");
                    break;
                case 1165749981:
                    if (algoOrdType3.equals("recurring")) {
                        i = C52761wXj.TaskDescription.zdxASf;
                        break;
                    }
                    break;
            }
        }
        c55251xgSAEQbTJ2.setTagIcon(C33070mpX.KWHzl(i));
        boolean z = Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getAlgoOrdType(), (java.lang.Object) "contract_dca") || Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getAlgoOrdType(), (java.lang.Object) "contract_grid");
        C55251xgS c55251xgSFIwbmz = actionBar.fIwbmz();
        c55251xgSFIwbmz.setVisibility((z && C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getDirection())) ? 0 : 8);
        java.lang.String direction = homeStrategyCardInfo.getDirection();
        if (direction == null) {
            direction = "";
        }
        c55251xgSFIwbmz.setText(C56033xvF.AhwBna(direction));
        java.lang.String direction2 = homeStrategyCardInfo.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        c55251xgSFIwbmz.setOKDSStyle(C56033xvF.valueOf(direction2));
        C55251xgS newProxyInstance = actionBar.getNewProxyInstance();
        newProxyInstance.setVisibility((z && C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getLeverage())) ? 0 : 8);
        java.lang.String leverage = homeStrategyCardInfo.getLeverage();
        if (leverage == null) {
            leverage = "";
        }
        newProxyInstance.setText(C56033xvF.getBotLever$default(leverage, false, 2, null));
        java.lang.String direction3 = homeStrategyCardInfo.getDirection();
        if (direction3 == null) {
            direction3 = "";
        }
        newProxyInstance.setOKDSStyle(C56033xvF.valueOf(direction3));
        boolean fieldNames = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
        if (fieldNames) {
            actionBar.isConnected().setHelperLabelType(2);
            C55312xha c55312xhaValueOf2 = actionBar.isConnected().valueOf();
            if (c55312xhaValueOf2 != null) {
                c55312xhaValueOf2.setOnClickListener(new View.OnClickListener() { // from class: o.voE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        AbstractC51545voz.copydefault(view2);
                    }
                });
            }
        } else {
            actionBar.isConnected().setHelperLabelType(1);
            C55312xha c55312xhaValueOf3 = actionBar.isConnected().valueOf();
            if (c55312xhaValueOf3 != null) {
                c55312xhaValueOf3.OLrzqt();
            }
            C55312xha c55312xhaValueOf4 = actionBar.isConnected().valueOf();
            if (c55312xhaValueOf4 != null && (c55320xhiKWHzl = c55312xhaValueOf4.KWHzl()) != null) {
                i2 = 0;
                c55320xhiKWHzl.setOnClickListener(new TaskDescription(c55320xhiKWHzl, 1000L, this, homeStrategyCardInfo, actionBar));
            }
            c55312xhaValueOf = actionBar.isConnected().valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                if (!fieldNames) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase4);
                } else {
                    strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.gCiISl);
                }
                c55320xhiKWHzl2.setText(strAYXKKw2);
            }
            android.widget.TextView textViewValues = actionBar.values();
            pnlRatio = homeStrategyCardInfo.getPnlRatio();
            if (pnlRatio == null) {
                pnlRatio = "";
            }
            textViewValues.setText(C56033xvF.fmtBotPnlPercent$default(C56033xvF.KWHzl(pnlRatio), true, i2, 4, null));
            actionBar.values().setTextColor(!homeStrategyCardInfo.isEnable() ? C56033xvF.OLrzqt((java.lang.Object) homeStrategyCardInfo.getPnlRatio()) : C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
            android.widget.TextView textViewFetchVPNInfo = actionBar.fetchVPNInfo();
            textViewFetchVPNInfo.setVisibility((fieldNames || !C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getPnl())) ? 8 : i2);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getPnlCcy())) {
                java.lang.String instId = homeStrategyCardInfo.getInstId();
                java.lang.String str = instId == null ? "" : instId;
                java.lang.String instType = homeStrategyCardInfo.getInstType();
                java.lang.String str2 = instType == null ? "" : instType;
                java.lang.String pnl = homeStrategyCardInfo.getPnl();
                botPnl$default = C56033xvF.getBotPnl$default(str, str2, pnl == null ? "" : pnl, "USDT", false, true, C33129mqd.gEmmrt(homeStrategyCardInfo.getDisplayDigits()), false, null, null, null, 1920, null) + homeStrategyCardInfo.getPnlCcy();
            } else {
                java.lang.String instId2 = homeStrategyCardInfo.getInstId();
                java.lang.String str3 = instId2 == null ? "" : instId2;
                java.lang.String instType2 = homeStrategyCardInfo.getInstType();
                java.lang.String str4 = instType2 == null ? "" : instType2;
                java.lang.String pnl2 = homeStrategyCardInfo.getPnl();
                botPnl$default = C56033xvF.getBotPnl$default(str3, str4, pnl2 == null ? "" : pnl2, "USDT", true, true, "2", false, null, null, null, 1920, null);
            }
            textViewFetchVPNInfo.setText(botPnl$default);
            textViewFetchVPNInfo.setTextColor(C56033xvF.OLrzqt((java.lang.Object) homeStrategyCardInfo.getPnl()));
            C51601vqB c51601vqBDjBIcL = actionBar.djBIcL();
            algoOrdType = homeStrategyCardInfo.getAlgoOrdType();
            if (algoOrdType == null) {
                switch (algoOrdType.hashCode()) {
                    case -1831183611:
                        if (algoOrdType.equals("spot_dca")) {
                            i3 = 2;
                            java.lang.String[] strArr = new java.lang.String[2];
                            java.lang.String upperCase2 = o.TaskDescription.AEQbTJ(homeStrategyCardInfo.getInstId()).copydefault().toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                            strArr[i2] = upperCase2;
                            java.lang.String instType3 = homeStrategyCardInfo.getInstType();
                            if (instType3 == null) {
                                instType3 = "";
                            }
                            java.lang.String instId3 = homeStrategyCardInfo.getInstId();
                            if (instId3 == null) {
                                instId3 = "";
                            }
                            java.lang.String strAYXKKw3 = new C55887xsS(instType3, instId3).AYXKKw();
                            if (strAYXKKw3 == null) {
                                strAYXKKw3 = "";
                            }
                            strArr[1] = strAYXKKw3;
                            listGEmmrt = yDY.gEmmrt(strArr);
                        } else {
                            i3 = 2;
                            java.lang.String strCopydefault = o.TaskDescription.AEQbTJ(homeStrategyCardInfo.getInstId()).copydefault();
                            java.util.Locale locale = java.util.Locale.ROOT;
                            java.lang.String upperCase3 = strCopydefault.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                            java.lang.String upperCase4 = o.TaskDescription.AEQbTJ(homeStrategyCardInfo.getInstId()).AEQbTJ().toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                            listGEmmrt = yDY.gEmmrt(upperCase3, upperCase4);
                        }
                        list = listGEmmrt;
                        break;
                    case -1216369070:
                        break;
                    case 3181382:
                        if (!algoOrdType.equals("grid")) {
                        }
                        list = listGEmmrt;
                        break;
                    case 1165749981:
                        break;
                }
            }
            C51601vqB.refreshCircleCoins$default(c51601vqBDjBIcL, list, 2, 0, 4, null);
            actionBar.AuCTel().setText(AEQbTJ(C33129mqd.subS$default(homeStrategyCardInfo.getPTime(), homeStrategyCardInfo.getCTime(), null, null, null, 14, null)));
            actionBar.AuCTel().setEnabled(homeStrategyCardInfo.isEnable());
            android.widget.TextView textViewFJNWhG = actionBar.fJNWhG();
            xMR xmr = xMR.copydefault;
            java.lang.String maxDrawdown = homeStrategyCardInfo.getMaxDrawdown();
            textViewFJNWhG.setText(xMR.formatPercent$default(xmr, maxDrawdown != null ? "" : maxDrawdown, 0, RoundingMode.DOWN, 2, null));
            actionBar.fJNWhG().setEnabled(homeStrategyCardInfo.isEnable());
            android.widget.TextView textViewGEmmrt = actionBar.gEmmrt();
            followerCount = homeStrategyCardInfo.getFollowerCount();
            if (followerCount == null) {
                followerCount = "";
            }
            textViewGEmmrt.setText(xmr.copydefault(followerCount));
            wUE wue = wUE.OLrzqt;
            android.widget.ImageView imageViewCopydefault = actionBar.copydefault();
            avatar = homeStrategyCardInfo.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            wue.KWHzl(imageViewCopydefault, wUE.Application.m8784constructorimpl$default(avatar, null, i3, null));
            actionBar.ejfBZ().setVisibility(!C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getProfitSharingRatio()) ? i2 : 8);
            android.widget.TextView textViewEjfBZ = actionBar.ejfBZ();
            int i4 = C55688xof.Application.OeawrHRnVkix;
            java.lang.String profitSharingRatio = homeStrategyCardInfo.getProfitSharingRatio();
            textViewEjfBZ.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr, profitSharingRatio != null ? "" : profitSharingRatio, 0, null, 4, null)))));
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getCopyType(), (java.lang.Object) "3");
            actionBar.AYXKKw().setVisibility(!zEZpvd ? i2 : 8);
            actionBar.AhwBna().setVisibility(!zEZpvd ? i2 : 8);
            actionBar.AhwBna().setEnabled(homeStrategyCardInfo.isEnable());
            followerAssets = homeStrategyCardInfo.getFollowerAssets();
            if (followerAssets == null) {
                followerAssets = "";
            }
            java.lang.Integer displayDigits = homeStrategyCardInfo.getDisplayDigits();
            java.lang.String strOLrzqt = xmr.OLrzqt(followerAssets, displayDigits == null ? displayDigits.intValue() : i3);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getFollowerAssetsCcy())) {
                upperCase = o.TaskDescription.AEQbTJ(homeStrategyCardInfo.getInstId()).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            } else {
                upperCase = homeStrategyCardInfo.getFollowerAssetsCcy();
            }
            actionBar.AhwBna().setText(strOLrzqt + " " + upperCase);
            actionBar.EZpvd().setVisibility(!homeStrategyCardInfo.getShowOperate() ? i2 : 8);
            if (homeStrategyCardInfo.isEnable()) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ORrpqH);
            } else if (zEZpvd) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onPlay);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.Ohcwxs);
            }
            actionBar.EZpvd().setText(strAYXKKw);
            actionBar.EZpvd().setEnabled(homeStrategyCardInfo.isEnable());
            boolean z2 = !C56071xvr.gEmmrt.EZpvd(homeStrategyCardInfo.getProfitSharingRatio());
            actionBar.valueOf().setVisibility(!z2 ? i2 : 8);
            actionBar.AkhnZx().setVisibility(!z2 ? i2 : 8);
            android.widget.LinearLayout linearLayoutAkhnZx = actionBar.AkhnZx();
            linearLayoutAkhnZx.setOnClickListener(new StateListAnimator(linearLayoutAkhnZx, 1000L, this, homeStrategyCardInfo, zEZpvd));
            if (!Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getStatus(), (java.lang.Object) "pending_signal")) {
                actionBar.getFieldNames().setVisibility(i2);
                actionBar.KWHzl().setVisibility(8);
                actionBar.uzCIH().setAnimationFromUrl(uLQ.Companion.OLrzqt().AhwBna());
                actionBar.uzCIH().playAnimation();
                return;
            }
            actionBar.getFieldNames().setVisibility(8);
            actionBar.KWHzl().setVisibility(i2);
            actionBar.uzCIH().cancelAnimation();
            AEQbTJ(actionBar.KWHzl(), homeStrategyCardInfo);
            return;
        }
        i2 = 0;
        c55312xhaValueOf = actionBar.isConnected().valueOf();
        if (c55312xhaValueOf != null) {
            if (!fieldNames) {
            }
            c55320xhiKWHzl2.setText(strAYXKKw2);
        }
        android.widget.TextView textViewValues2 = actionBar.values();
        pnlRatio = homeStrategyCardInfo.getPnlRatio();
        if (pnlRatio == null) {
        }
        textViewValues2.setText(C56033xvF.fmtBotPnlPercent$default(C56033xvF.KWHzl(pnlRatio), true, i2, 4, null));
        actionBar.values().setTextColor(!homeStrategyCardInfo.isEnable() ? C56033xvF.OLrzqt((java.lang.Object) homeStrategyCardInfo.getPnlRatio()) : C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
        android.widget.TextView textViewFetchVPNInfo2 = actionBar.fetchVPNInfo();
        textViewFetchVPNInfo2.setVisibility((fieldNames || !C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getPnl())) ? 8 : i2);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getPnlCcy())) {
        }
        textViewFetchVPNInfo2.setText(botPnl$default);
        textViewFetchVPNInfo2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) homeStrategyCardInfo.getPnl()));
        C51601vqB c51601vqBDjBIcL2 = actionBar.djBIcL();
        algoOrdType = homeStrategyCardInfo.getAlgoOrdType();
        if (algoOrdType == null) {
        }
        C51601vqB.refreshCircleCoins$default(c51601vqBDjBIcL2, list, 2, 0, 4, null);
        actionBar.AuCTel().setText(AEQbTJ(C33129mqd.subS$default(homeStrategyCardInfo.getPTime(), homeStrategyCardInfo.getCTime(), null, null, null, 14, null)));
        actionBar.AuCTel().setEnabled(homeStrategyCardInfo.isEnable());
        android.widget.TextView textViewFJNWhG2 = actionBar.fJNWhG();
        xMR xmr2 = xMR.copydefault;
        java.lang.String maxDrawdown2 = homeStrategyCardInfo.getMaxDrawdown();
        textViewFJNWhG2.setText(xMR.formatPercent$default(xmr2, maxDrawdown2 != null ? "" : maxDrawdown2, 0, RoundingMode.DOWN, 2, null));
        actionBar.fJNWhG().setEnabled(homeStrategyCardInfo.isEnable());
        android.widget.TextView textViewGEmmrt2 = actionBar.gEmmrt();
        followerCount = homeStrategyCardInfo.getFollowerCount();
        if (followerCount == null) {
        }
        textViewGEmmrt2.setText(xmr2.copydefault(followerCount));
        wUE wue2 = wUE.OLrzqt;
        android.widget.ImageView imageViewCopydefault2 = actionBar.copydefault();
        avatar = homeStrategyCardInfo.getAvatar();
        if (avatar == null) {
        }
        wue2.KWHzl(imageViewCopydefault2, wUE.Application.m8784constructorimpl$default(avatar, null, i3, null));
        actionBar.ejfBZ().setVisibility(!C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getProfitSharingRatio()) ? i2 : 8);
        android.widget.TextView textViewEjfBZ2 = actionBar.ejfBZ();
        int i42 = C55688xof.Application.OeawrHRnVkix;
        java.lang.String profitSharingRatio2 = homeStrategyCardInfo.getProfitSharingRatio();
        textViewEjfBZ2.setText(C33069mpW.copydefault(i42, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr2, profitSharingRatio2 != null ? "" : profitSharingRatio2, 0, null, 4, null)))));
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getCopyType(), (java.lang.Object) "3");
        actionBar.AYXKKw().setVisibility(!zEZpvd2 ? i2 : 8);
        actionBar.AhwBna().setVisibility(!zEZpvd2 ? i2 : 8);
        actionBar.AhwBna().setEnabled(homeStrategyCardInfo.isEnable());
        followerAssets = homeStrategyCardInfo.getFollowerAssets();
        if (followerAssets == null) {
        }
        java.lang.Integer displayDigits2 = homeStrategyCardInfo.getDisplayDigits();
        java.lang.String strOLrzqt2 = xmr2.OLrzqt(followerAssets, displayDigits2 == null ? displayDigits2.intValue() : i3);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) homeStrategyCardInfo.getFollowerAssetsCcy())) {
        }
        actionBar.AhwBna().setText(strOLrzqt2 + " " + upperCase);
        actionBar.EZpvd().setVisibility(!homeStrategyCardInfo.getShowOperate() ? i2 : 8);
        if (homeStrategyCardInfo.isEnable()) {
        }
        actionBar.EZpvd().setText(strAYXKKw);
        actionBar.EZpvd().setEnabled(homeStrategyCardInfo.isEnable());
        boolean z22 = !C56071xvr.gEmmrt.EZpvd(homeStrategyCardInfo.getProfitSharingRatio());
        actionBar.valueOf().setVisibility(!z22 ? i2 : 8);
        actionBar.AkhnZx().setVisibility(!z22 ? i2 : 8);
        android.widget.LinearLayout linearLayoutAkhnZx2 = actionBar.AkhnZx();
        linearLayoutAkhnZx2.setOnClickListener(new StateListAnimator(linearLayoutAkhnZx2, 1000L, this, homeStrategyCardInfo, zEZpvd2));
        if (!Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getStatus(), (java.lang.Object) "pending_signal")) {
        }
    }

    /* JADX INFO: renamed from: o.voz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ HomeStrategyCardInfo AEQbTJ;
        public final /* synthetic */ AbstractC51545voz AhwBna;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.content.Context context, AbstractC51545voz abstractC51545voz, HomeStrategyCardInfo homeStrategyCardInfo, ActionBar actionBar) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = context;
            this.AhwBna = abstractC51545voz;
            this.AEQbTJ = homeStrategyCardInfo;
            this.EZpvd = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.view.View view2 = this.copydefault;
                if (C55697xoo.OLrzqt.isConnected()) {
                    if (this.AhwBna.KWHzl) {
                        AbstractC51545voz abstractC51545voz = this.AhwBna;
                        android.content.Context context = view2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        abstractC51545voz.copydefault(context, this.AEQbTJ);
                    }
                    Function2 function2 = this.AhwBna.EZpvd;
                    if (function2 != null) {
                        function2.invoke(this.AEQbTJ, java.lang.Integer.valueOf(this.EZpvd.getBindingAdapterPosition()));
                        return;
                    }
                    return;
                }
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                if (interfaceC8104awT != null) {
                    Intrinsics.copydefault(this.KWHzl);
                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, this.KWHzl, null, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.voz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ HomeStrategyCardInfo AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ AbstractC51545voz KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC51545voz abstractC51545voz, HomeStrategyCardInfo homeStrategyCardInfo, boolean z) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = abstractC51545voz;
            this.AEQbTJ = homeStrategyCardInfo;
            this.EZpvd = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.OLrzqt;
                if (this.KWHzl.OLrzqt != null) {
                    this.KWHzl.OLrzqt.invoke(this.AEQbTJ.getTraderUniqueName());
                    return;
                }
                AbstractC51545voz abstractC51545voz = this.KWHzl;
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                abstractC51545voz.OLrzqt(context, this.AEQbTJ.getTraderUniqueName());
                AbstractC51545voz abstractC51545voz2 = this.KWHzl;
                java.lang.String algoOrdType = this.AEQbTJ.getAlgoOrdType();
                abstractC51545voz2.OLrzqt("trader_avatar", algoOrdType != null ? algoOrdType : "", this.EZpvd ? "profit_sharing" : "non_profit_sharing");
            }
        }
    }

    /* JADX INFO: renamed from: o.voz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ AbstractC51545voz AEQbTJ;
        public final /* synthetic */ HomeStrategyCardInfo EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC51545voz abstractC51545voz, HomeStrategyCardInfo homeStrategyCardInfo, ActionBar actionBar) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = abstractC51545voz;
            this.EZpvd = homeStrategyCardInfo;
            this.copydefault = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function2 function2 = this.AEQbTJ.AEQbTJ;
                if (function2 != null) {
                    function2.invoke(this.EZpvd, java.lang.Integer.valueOf(this.copydefault.getBindingAdapterPosition()));
                }
            }
        }
    }

    public final void AEQbTJ(C51624vqY c51624vqY, HomeStrategyCardInfo homeStrategyCardInfo) {
        int color;
        int color2;
        java.util.Collection collectionAhwBna;
        if (homeStrategyCardInfo.isEnable()) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c51624vqY.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            color = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            color = ContextCompat.getColor(c51624vqY.getContext(), C32113mPz.ActionBar.ejfBZ);
        }
        c51624vqY.setLineColor(color);
        if (homeStrategyCardInfo.isEnable()) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = c51624vqY.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            color2 = C33512mxp.tradeRiseGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            color2 = ContextCompat.getColor(c51624vqY.getContext(), C32113mPz.ActionBar.ejfBZ);
        }
        c51624vqY.setFillStartColor(color2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<HomeStrategyCardProfit> profitHistory = homeStrategyCardInfo.getProfitHistory();
        if (profitHistory == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(profitHistory, 10));
            java.util.Iterator<T> it = profitHistory.iterator();
            while (it.hasNext()) {
                collectionAhwBna.add(new C51624vqY.ActionBar(C33129mqd.AEQbTJ(((HomeStrategyCardProfit) it.next()).getPnlRatio()), null, 2, null));
            }
        }
        arrayList.addAll(collectionAhwBna);
        c51624vqY.KWHzl(C56405yEd.zLjUOn(arrayList));
        c51624vqY.setTouchEnabled(false);
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault(C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null));
        java.lang.String strRemS$default = C33129mqd.remS$default(str, "86400000", null, null, null, 14, null);
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda3), C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))));
    }

    public final void copydefault(android.content.Context context, HomeStrategyCardInfo homeStrategyCardInfo) {
        if (homeStrategyCardInfo.isEnable()) {
            java.lang.String algoOrdType = homeStrategyCardInfo.getAlgoOrdType();
            if (algoOrdType == null) {
                algoOrdType = "";
            }
            OLrzqt("copy_bot", algoOrdType, Intrinsics.EZpvd((java.lang.Object) homeStrategyCardInfo.getCopyType(), (java.lang.Object) "3") ? "profit_sharing" : "non_profit_sharing");
            ActivityC51071vgB.TaskDescription taskDescription = ActivityC51071vgB.Companion;
            java.lang.String algoId = homeStrategyCardInfo.getAlgoId();
            java.lang.String algoOrdType2 = homeStrategyCardInfo.getAlgoOrdType();
            ActivityC51071vgB.TaskDescription.startActivity$default(taskDescription, context, algoId, algoOrdType2 == null ? "" : algoOrdType2, null, this.copydefault, 8, null);
        }
    }

    public static /* synthetic */ void onClickEvent$default(AbstractC51545voz abstractC51545voz, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickEvent");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        abstractC51545voz.OLrzqt(str, str2, str3);
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.voC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC51545voz.OLrzqt(str2, str, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.fWSAZA));
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.QWSkGZ, new View.OnClickListener() { // from class: o.voA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC51545voz.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        if (interfaceC49317umK != null) {
            InterfaceC49317umK.Application.navigateToTraderBusinessLinePage$default(interfaceC49317umK, context, str, BusinessLine.Bots, "bot_square", null, 16, null);
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
