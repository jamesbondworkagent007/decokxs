package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.trade.source.search.OkBizSearchInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C35966oKh;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39513ptk extends AbstractC59533zio<C39519ptq, C48912ued> {
    public final Function1<OkBizSearchInfo, Unit> KWHzl;
    public final Function1<OkBizSearchInfo, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.trade.source.search.OkBizSearchInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.trade.source.search.OkBizSearchInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39513ptk(@NotNull Function1<? super OkBizSearchInfo, Unit> function1, @NotNull Function1<? super OkBizSearchInfo, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C48912ued onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.zblBkD, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new C48912ued(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=5] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C48912ued c48912ued, @NotNull final C39519ptq c39519ptq) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(c48912ued, "");
        Intrinsics.checkNotNullParameter(c39519ptq, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
            c48912ued.EZpvd().setVisibility(0);
        } else {
            c48912ued.EZpvd().setVisibility(8);
        }
        android.content.Context context = c48912ued.itemView.getContext();
        c48912ued.AEQbTJ().setTextSize(16.0f);
        c48912ued.EZpvd().setSelected(c39519ptq.EZpvd().isWatching());
        c48912ued.OLrzqt().setVisibility(8);
        c48912ued.djBIcL().setVisibility(8);
        c48912ued.KWHzl().setVisibility(8);
        java.lang.Double priceLimitNum = c39519ptq.EZpvd().getPriceLimitNum();
        if ((priceLimitNum != null ? priceLimitNum.doubleValue() : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            android.widget.TextView textViewValueOf = c48912ued.valueOf();
            android.content.Context context2 = c48912ued.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textViewValueOf.setTextColor(C33508mxl.copydefault(context2));
        } else {
            android.widget.TextView textViewValueOf2 = c48912ued.valueOf();
            android.content.Context context3 = c48912ued.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textViewValueOf2.setTextColor(C33508mxl.AEQbTJ(context3));
        }
        java.lang.String instType = c39519ptq.EZpvd().getBizInfo().getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (instType.equals("MARGIN")) {
                    c48912ued.copydefault().setVisibility(8);
                    c48912ued.AYXKKw().setVisibility(0);
                    BizInstrument bizInfo = c39519ptq.EZpvd().getBizInfo();
                    SpotInstrument spotInstrument = bizInfo instanceof SpotInstrument ? (SpotInstrument) bizInfo : null;
                    java.lang.String level = spotInstrument != null ? spotInstrument.getLevel() : null;
                    if (level != null && level.length() != 0 && C55608xnE.EZpvd()) {
                        android.widget.TextView textViewAEQbTJ = c48912ued.AEQbTJ();
                        BizInstrument bizInfo2 = c39519ptq.EZpvd().getBizInfo();
                        Intrinsics.copydefault(bizInfo2, "");
                        textViewAEQbTJ.setText(((SpotInstrument) bizInfo2).getUly());
                        try {
                            Result.Application application = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) c39519ptq.EZpvd().getBizInfo().getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1));
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        BizInstrument bizInfo3 = c39519ptq.EZpvd().getBizInfo();
                        Intrinsics.copydefault(bizInfo3, "");
                        java.lang.String displayQuoteSymbol = ((SpotInstrument) bizInfo3).getDisplayQuoteSymbol();
                        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                            objM7377constructorimpl = displayQuoteSymbol;
                        }
                        c48912ued.AYXKKw().setText("/" + ((java.lang.String) objM7377constructorimpl));
                        c48912ued.djBIcL().setVisibility(0);
                        android.widget.TextView textViewDjBIcL = c48912ued.djBIcL();
                        BizInstrument bizInfo4 = c39519ptq.EZpvd().getBizInfo();
                        SpotInstrument spotInstrument2 = bizInfo4 instanceof SpotInstrument ? (SpotInstrument) bizInfo4 : null;
                        textViewDjBIcL.setText((spotInstrument2 != null ? spotInstrument2.getLevel() : null) + "x");
                    }
                    c48912ued.gEmmrt().setText(c39519ptq.EZpvd().getPrice());
                }
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    c48912ued.copydefault().setVisibility(8);
                    c48912ued.AYXKKw().setVisibility(8);
                    android.widget.TextView textViewAEQbTJ2 = c48912ued.AEQbTJ();
                    BizInstrument bizInfo5 = c39519ptq.EZpvd().getBizInfo();
                    OptionInstrument optionInstrument = bizInfo5 instanceof OptionInstrument ? (OptionInstrument) bizInfo5 : null;
                    textViewAEQbTJ2.setText(optionInstrument != null ? optionInstrument.getOptionStk() : null);
                    c48912ued.gEmmrt().setText(c39519ptq.EZpvd().getPrice());
                }
                break;
            case 2552066:
                if (instType.equals("SPOT")) {
                    c48912ued.copydefault().setVisibility(8);
                    c48912ued.AYXKKw().setVisibility(0);
                    if (c39519ptq.EZpvd().getBizInfo() instanceof SpotInstrument) {
                        android.widget.TextView textViewAEQbTJ3 = c48912ued.AEQbTJ();
                        BizInstrument bizInfo6 = c39519ptq.EZpvd().getBizInfo();
                        Intrinsics.copydefault(bizInfo6, "");
                        textViewAEQbTJ3.setText(((SpotInstrument) bizInfo6).getUly());
                        try {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) c39519ptq.EZpvd().getBizInfo().getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1));
                        } catch (java.lang.Throwable th2) {
                            Result.Application application4 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                        }
                        BizInstrument bizInfo7 = c39519ptq.EZpvd().getBizInfo();
                        Intrinsics.copydefault(bizInfo7, "");
                        java.lang.String displayQuoteSymbol2 = ((SpotInstrument) bizInfo7).getDisplayQuoteSymbol();
                        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                            objM7377constructorimpl2 = displayQuoteSymbol2;
                        }
                        c48912ued.AYXKKw().setText("/" + ((java.lang.String) objM7377constructorimpl2));
                        BizInstrument bizInfo8 = c39519ptq.EZpvd().getBizInfo();
                        SpotInstrument spotInstrument3 = bizInfo8 instanceof SpotInstrument ? (SpotInstrument) bizInfo8 : null;
                        java.lang.String level2 = spotInstrument3 != null ? spotInstrument3.getLevel() : null;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) level2)) {
                            level2 = null;
                        }
                        if (level2 == null) {
                            BizInstrument bizInfo9 = c39519ptq.EZpvd().getBizInfo();
                            SpotInstrument spotInstrument4 = bizInfo9 instanceof SpotInstrument ? (SpotInstrument) bizInfo9 : null;
                            level2 = spotInstrument4 != null ? spotInstrument4.getCoinLever() : null;
                        }
                        if (level2 == null || level2.length() == 0 || !C55608xnE.EZpvd()) {
                            c48912ued.djBIcL().setVisibility(8);
                        } else {
                            c48912ued.djBIcL().setVisibility(0);
                            c48912ued.djBIcL().setText(level2 + "x");
                        }
                    }
                    c48912ued.gEmmrt().setText(c39519ptq.EZpvd().getPrice());
                }
                break;
            case 2558355:
                if (instType.equals("SWAP")) {
                    c48912ued.copydefault().setVisibility(8);
                    c48912ued.AYXKKw().setVisibility(8);
                    java.lang.String titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, c39519ptq.EZpvd().getBizInfo().getInstId(), "SWAP", false, false, null, false, false, 124, null);
                    java.lang.String string = context.getResources().getString(C35966oKh.TaskDescription.KWHzl);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.invokespecialhOMIpD);
                    int iCopydefault2 = C33070mpX.copydefault(C35964oKf.TaskDescription.AEQbTJ);
                    Intrinsics.copydefault(context);
                    c48912ued.AEQbTJ().setText(C39518ptp.copydefault(titleByIdAndType$default, string, iCopydefault, iCopydefault2, context));
                    c48912ued.gEmmrt().setText(c39519ptq.EZpvd().getPrice());
                }
                break;
            case 214415088:
                if (instType.equals("FUTURES")) {
                    c48912ued.AYXKKw().setText("");
                    c48912ued.AYXKKw().setVisibility(8);
                    c48912ued.copydefault().setText("");
                    c48912ued.copydefault().setVisibility(8);
                    java.lang.String str = " " + C33070mpX.AYXKKw(C35964oKf.Fragment.apAOXX) + " ";
                    java.lang.String str2 = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, c39519ptq.EZpvd().getBizInfo().getInstId(), "FUTURES", false, false, null, false, false, 124, null) + str;
                    c48912ued.gEmmrt().setText(c39519ptq.EZpvd().getPrice());
                    c48912ued.OLrzqt().setVisibility(8);
                    c48912ued.KWHzl().setVisibility(8);
                    android.widget.TextView textViewAEQbTJ4 = c48912ued.AEQbTJ();
                    int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.Dmq);
                    int iCopydefault4 = C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
                    Intrinsics.copydefault(context);
                    textViewAEQbTJ4.setText(C39518ptp.copydefault(str2, str, iCopydefault3, iCopydefault4, context));
                    c48912ued.AEQbTJ().requestLayout();
                    c48912ued.copydefault().setVisibility(8);
                    c48912ued.djBIcL().setVisibility(8);
                }
                break;
        }
        c48912ued.gEmmrt().setVisibility(0);
        c48912ued.valueOf().setVisibility(0);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c48912ued.EZpvd()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ptl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39513ptk.KWHzl(this.copydefault, c39519ptq, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.pti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39513ptk.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ptm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39513ptk.KWHzl(function1, obj);
            }
        });
        android.widget.TextView textViewValueOf3 = c48912ued.valueOf();
        java.lang.String priceLimit = c39519ptq.EZpvd().getPriceLimit();
        textViewValueOf3.setText(priceLimit != null ? pTF.KWHzl.AEQbTJ(priceLimit) : null);
        c48912ued.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.ptj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39513ptk.KWHzl(this.OLrzqt, c39519ptq, view);
            }
        });
    }

    public static final void KWHzl(C39513ptk c39513ptk, C39519ptq c39519ptq, java.lang.Object obj) {
        c39513ptk.KWHzl.invoke(c39519ptq.EZpvd());
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C39513ptk c39513ptk, C39519ptq c39519ptq, android.view.View view) {
        c39513ptk.OLrzqt.invoke(c39519ptq.EZpvd());
    }
}
