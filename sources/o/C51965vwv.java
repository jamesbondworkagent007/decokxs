package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51965vwv extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public BotGuideData KWHzl;
    public AbstractC48619uYc OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51965vwv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51965vwv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.vwv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51965vwv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51965vwv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51965vwv.KWHzl();
            }
        });
        AYXKKw();
        EZpvd();
    }

    public static final C43316rmw KWHzl() {
        return new C43316rmw();
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    private final void AYXKKw() {
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        this.OLrzqt = (AbstractC48619uYc) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.RXdAnZ, this, true);
        OLrzqt();
    }

    public final void OLrzqt() {
        C43316rmw c43316rmwCopydefault = copydefault();
        c43316rmwCopydefault.register(BotGuideItem.class, new wJZ());
        c43316rmwCopydefault.register(BotGuideLinkItem.class, new wJY(new Function0() { // from class: o.vwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51965vwv.KWHzl(this.EZpvd);
            }
        }));
        AbstractC48619uYc abstractC48619uYc = this.OLrzqt;
        AbstractC48619uYc abstractC48619uYc2 = null;
        if (abstractC48619uYc == null) {
            Intrinsics.gEmmrt("");
            abstractC48619uYc = null;
        }
        abstractC48619uYc.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC48619uYc abstractC48619uYc3 = this.OLrzqt;
        if (abstractC48619uYc3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48619uYc2 = abstractC48619uYc3;
        }
        abstractC48619uYc2.OLrzqt.setAdapter(copydefault());
    }

    public static final Unit KWHzl(C51965vwv c51965vwv) {
        final BotGuideData botGuideData = c51965vwv.KWHzl;
        if (botGuideData != null) {
            C32866mlf.onEvent$default("TradingBot_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vwA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51965vwv.OLrzqt(botGuideData, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotGuideData botGuideData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", botGuideData.getBotType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "learn_more", false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", botGuideData.getCopyType(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull BotGuideData botGuideData) {
        Intrinsics.checkNotNullParameter(botGuideData, "");
        this.KWHzl = botGuideData;
        AbstractC48619uYc abstractC48619uYc = this.OLrzqt;
        AbstractC48619uYc abstractC48619uYc2 = null;
        if (abstractC48619uYc == null) {
            Intrinsics.gEmmrt("");
            abstractC48619uYc = null;
        }
        abstractC48619uYc.copydefault.setText(botGuideData.getBotName());
        AbstractC48619uYc abstractC48619uYc3 = this.OLrzqt;
        if (abstractC48619uYc3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48619uYc3 = null;
        }
        abstractC48619uYc3.copydefault.setTextAppearance(botGuideData.getTitleAppearance());
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(getContext()).EZpvd(botGuideData.getPicUrl());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = c5335NtEZpvd.OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.copydefault(4.0f, context))).KWHzl(C52761wXj.TaskDescription.DuR));
        AbstractC48619uYc abstractC48619uYc4 = this.OLrzqt;
        if (abstractC48619uYc4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48619uYc4 = null;
        }
        c5335NtOLrzqt.EZpvd((android.widget.ImageView) abstractC48619uYc4.EZpvd);
        AbstractC48619uYc abstractC48619uYc5 = this.OLrzqt;
        if (abstractC48619uYc5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48619uYc2 = abstractC48619uYc5;
        }
        AppCompatImageView appCompatImageView = abstractC48619uYc2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(botGuideData.getVideoUrl().length() > 0 ? 0 : 8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(botGuideData.getGuideItemList());
        arrayList.add(botGuideData.getGuideLink());
        C33064mpR.OLrzqt(copydefault(), (java.util.List<? extends java.lang.Object>) arrayList);
    }

    private final void EZpvd() {
        AbstractC48619uYc abstractC48619uYc = this.OLrzqt;
        if (abstractC48619uYc == null) {
            Intrinsics.gEmmrt("");
            abstractC48619uYc = null;
        }
        AppCompatImageView appCompatImageView = abstractC48619uYc.KWHzl;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vwv$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51965vwv EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51965vwv c51965vwv) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c51965vwv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BotGuideData botGuideData = this.EZpvd.KWHzl;
                if (botGuideData != null) {
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    android.content.Context context = this.EZpvd.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.lang.String videoUrl = botGuideData.getVideoUrl();
                    linkedHashMap.put("url", videoUrl != null ? videoUrl : "");
                    linkedHashMap.put("theme", "dark");
                    Unit unit = Unit.INSTANCE;
                    c43056riA.copydefault(context, "okluatradingeco", "/video", C56424yEw.values(linkedHashMap));
                }
            }
        }
    }
}
