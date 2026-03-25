package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC52122vzt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51957vwn extends android.widget.RelativeLayout {
    public AbstractC48615uXz AEQbTJ;
    public final C43316rmw OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51957vwn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51957vwn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.vwn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51957vwn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51957vwn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C43316rmw c43316rmw = new C43316rmw();
        this.OLrzqt = c43316rmw;
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        this.AEQbTJ = (AbstractC48615uXz) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.GLcwwN, this, true);
        c43316rmw.register(C51484vnr.class, new C51480vnn(new Function1() { // from class: o.vwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51957vwn.KWHzl(this.EZpvd, (C51484vnr) obj);
            }
        }));
        RecyclerView recyclerView = this.AEQbTJ.OLrzqt;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        recyclerView.addItemDecoration(new C57584ylF(4, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        recyclerView.setAdapter(c43316rmw);
    }

    public static final Unit KWHzl(C51957vwn c51957vwn, C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        if (c51957vwn.EZpvd(c51484vnr.AEQbTJ())) {
            C55326xho.toast$default(C55688xof.Application.ActivityResultContractsPickVisualMediaImageAndVideo, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            c51957vwn.AEQbTJ(c51484vnr.AEQbTJ());
            C55867xrz.KWHzl.EZpvd(c51484vnr.OLrzqt(), c51484vnr.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull C51938vwU c51938vwU) {
        Intrinsics.checkNotNullParameter(c51938vwU, "");
        AppCompatTextView appCompatTextView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c51938vwU.EZpvd()) ^ true ? 0 : 8);
        this.AEQbTJ.AEQbTJ.setText(c51938vwU.EZpvd());
        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) c51938vwU.KWHzl());
    }

    public final void AEQbTJ(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            C52841waI.Companion.EZpvd(C35334ntP.KWHzl(this));
            return;
        }
        xUV xuv = xUV.EZpvd;
        java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
        java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_type");
        BotTradeData botTradeData = new BotTradeData(str, str2, strEZpvd2 == null ? "" : strEZpvd2, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
        ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        application.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_home_recommend", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
    }

    public final boolean EZpvd(java.lang.String str) {
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return interfaceC54581xNrCopydefault != null && (userTradeConfigInfoGHZMYf = interfaceC54581xNrCopydefault.gHZMYf()) != null && userTradeConfigInfoGHZMYf.getRoleType() == 1 && C51468vnb.DbNXlk().contains(str);
    }
}
