package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.binder.SignalActivityItemBinder$1;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29535kvV extends AbstractC25436iwg<SignalUiModel, hEQ> {
    public final InterfaceC29581kwO KWHzl;
    public int OLrzqt;
    public final java.lang.String copydefault;

    /* JADX INFO: renamed from: o.kvV$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InfluencerType.values().length];
            try {
                iArr[InfluencerType.KOLs.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InfluencerType.SMART_MONEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InfluencerType.WHALES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[TxType.values().length];
            try {
                iArr2[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29535kvV(InterfaceC29581kwO interfaceC29581kwO, @NotNull java.lang.String str) {
        super(SignalActivityItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = interfaceC29581kwO;
        this.copydefault = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hEQ> c25435iwf, @NotNull SignalUiModel signalUiModel) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        hEQ heq = (hEQ) c25435iwf.EZpvd();
        EZpvd(heq, signalUiModel);
        EZpvd(heq, getPosition(c25435iwf), signalUiModel);
        copydefault(heq, signalUiModel);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C57406yhn.Activity.aKErDB);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        }
        heq.copydefault.setCompoundDrawablePadding(C55298xhM.dp2px$default(4.0f, null, 1, null));
        heq.copydefault.setCompoundDrawablesWithIntrinsicBounds(drawableKWHzl, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        C52794wYp c52794wYp = heq.copydefault;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, signalUiModel));
        ConstraintLayout root = heq.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, signalUiModel, this, c25435iwf));
    }

    public final void AEQbTJ(hEQ heq, float f, boolean z, java.lang.String str, InfluencerType influencerType) {
        int i;
        java.lang.Integer numValueOf;
        android.content.Context context = heq.getRoot().getContext();
        boolean z2 = f >= 1.0f;
        int i2 = C52761wXj.Activity.QwvEab;
        Intrinsics.copydefault(context);
        int iCopydefault = C25382ivf.copydefault(i2, context);
        int iCopydefault2 = C25382ivf.copydefault(C52761wXj.ActionBar.OuxcSI, context);
        int iCopydefault3 = C25382ivf.copydefault(C52761wXj.Activity.dvKsVJ, context);
        int iCopydefault4 = C25382ivf.copydefault(C52761wXj.ActionBar.OuxcSI, context);
        int i3 = z ? C23274hvD.Fragment.hrNTAI : z2 ? C23274hvD.Fragment.DLWbHP : C23274hvD.Fragment.OHqIaq;
        if (z) {
            i = C23274hvD.Fragment.OFhtUX;
        } else if (z2 && influencerType == InfluencerType.SMART_MONEY) {
            i = C23274hvD.Fragment.hBpjJd;
        } else if (z2 && influencerType == InfluencerType.KOLs) {
            i = C23274hvD.Fragment.QHmsKR;
        } else if (z2 && influencerType == InfluencerType.WHALES) {
            i = C23274hvD.Fragment.gwTjWJ;
        } else if (influencerType == InfluencerType.SMART_MONEY) {
            i = C23274hvD.Fragment.RdAHlO;
        } else {
            i = influencerType == InfluencerType.KOLs ? C23274hvD.Fragment.QSBOWP : C23274hvD.Fragment.dHguZz;
        }
        C55320xhi c55320xhi = heq.isConnected;
        c55320xhi.setOnClickListener(new Application(c55320xhi, 1000L, context, i3, i, str));
        heq.fARcdN.setImageTintList(android.content.res.ColorStateList.valueOf(z ? iCopydefault : C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context)));
        if (z) {
            heq.iwGUEr.setTextColor(iCopydefault);
            android.widget.TextView textView = heq.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C31258lqd.EZpvd(textView);
            heq.getNewProxyInstance.setTextColor(iCopydefault);
            C55320xhi c55320xhi2 = heq.isConnected;
            c55320xhi2.setTextColor(iCopydefault);
            c55320xhi2.setText(context.getString(C23274hvD.Fragment.AubY));
            c55320xhi2.setLineStyle(0);
            c55320xhi2.setShowUnderline(true);
            numValueOf = null;
        } else if (z2) {
            C55320xhi c55320xhi3 = heq.isConnected;
            c55320xhi3.setTextColor(iCopydefault2);
            c55320xhi3.setText(context.getString(C23274hvD.Fragment.ffGIBT));
            c55320xhi3.setShowUnderline(false);
            numValueOf = java.lang.Integer.valueOf(iCopydefault2);
        } else if (f > 0.5f) {
            C55320xhi c55320xhi4 = heq.isConnected;
            c55320xhi4.setTextColor(iCopydefault4);
            c55320xhi4.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.OuxcSI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", yII.EZpvd(100 * f) + "%"))));
            c55320xhi4.setShowUnderline(false);
            numValueOf = java.lang.Integer.valueOf(iCopydefault4);
        } else {
            C55320xhi c55320xhi5 = heq.isConnected;
            c55320xhi5.setTextColor(iCopydefault3);
            c55320xhi5.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.OuxcSI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", yII.EZpvd(100 * f) + "%"))));
            c55320xhi5.setShowUnderline(false);
            numValueOf = java.lang.Integer.valueOf(iCopydefault3);
        }
        java.lang.Integer num = numValueOf;
        if (this.OLrzqt == 0) {
            heq.AhwBna.getViewTreeObserver().addOnGlobalLayoutListener(new LoaderManager(heq, this, z2, z, iCopydefault2, context, num, f));
        } else {
            AEQbTJ(heq, z2, z, iCopydefault2, context, num, f, this);
        }
    }

    /* JADX INFO: renamed from: o.kvV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C25435iwf AEQbTJ;
        public final /* synthetic */ C29535kvV EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ SignalUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, SignalUiModel signalUiModel, C29535kvV c29535kvV, C25435iwf c25435iwf) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = signalUiModel;
            this.EZpvd = c29535kvV;
            this.AEQbTJ = c25435iwf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TokenBase tokenBase = new TokenBase(this.copydefault.EZpvd(), this.copydefault.isConnected(), this.copydefault.AuCTel(), this.copydefault.copydefault(), this.copydefault.AEQbTJ(), this.copydefault.fIwbmz(), this.copydefault.fIwbmz(), 0, 0, 0, 0, null, "default_trade", null, null, null, null, 0, 0, false, null, null, false, false, this.EZpvd.copydefault, null, null, 0, false, null, null, false, -16781568, null);
                InterfaceC29581kwO interfaceC29581kwO = this.EZpvd.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Application(this.copydefault, this.EZpvd.getPosition(this.AEQbTJ), tokenBase, "signal"));
                }
                C29408ktA.trackSignalActivityClick$default(C29408ktA.KWHzl, "general", this.copydefault.fIwbmz(), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kvV$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C29535kvV OLrzqt;
        public final /* synthetic */ SignalUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, SignalUiModel signalUiModel, int i, C29535kvV c29535kvV) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = signalUiModel;
            this.AEQbTJ = i;
            this.OLrzqt = c29535kvV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C29408ktA c29408ktA = C29408ktA.KWHzl;
                c29408ktA.copydefault(this.copydefault.ejfBZ(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.copydefault.values())), this.copydefault.fIwbmz(), this.copydefault.djBIcL(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.AEQbTJ + 1)));
                c29408ktA.copydefault("address_number", this.copydefault.fIwbmz(), java.lang.Integer.valueOf(this.copydefault.values()));
                InterfaceC29581kwO interfaceC29581kwO = this.OLrzqt.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.LoaderManager(this.copydefault));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kvV$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.content.Context context, int i, int i2, java.lang.String str) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = context;
            this.copydefault = i;
            this.AEQbTJ = i2;
            this.valueOf = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Intrinsics.copydefault(this.EZpvd);
                android.content.Context context = this.EZpvd;
                java.lang.String string = context.getString(this.copydefault);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = this.EZpvd.getString(this.AEQbTJ);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                C25352ivB.OLrzqt(context, string, string2, C23274hvD.Fragment.QVAiDq);
                C29408ktA.trackSignalActivityClick$default(C29408ktA.KWHzl, "signal_label", this.valueOf, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kvV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29535kvV EZpvd;
        public final /* synthetic */ SignalUiModel OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29535kvV c29535kvV, SignalUiModel signalUiModel) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c29535kvV;
            this.OLrzqt = signalUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.EZpvd.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Fragment(this.OLrzqt, MemeQuickPopUpSource.MarketSignalActivity));
                }
            }
        }
    }

    public static final void AEQbTJ(hEQ heq, boolean z, boolean z2, int i, android.content.Context context, java.lang.Integer num, float f, C29535kvV c29535kvV) {
        int iEZpvd;
        android.view.View view = heq.OLrzqt;
        if (!z || z2) {
            Intrinsics.copydefault(context);
            i = C25382ivf.KWHzl(context, C33492mxV.OLrzqt() ? C52761wXj.Activity.ggKfIT : C52761wXj.Activity.invokespecialODCBUN);
        }
        view.setBackgroundTintList(android.content.res.ColorStateList.valueOf(i));
        android.widget.ImageView imageView = heq.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            if (z2 || f == 0.0f) {
                iEZpvd = 0;
            } else if (z) {
                iEZpvd = c29535kvV.OLrzqt;
            } else {
                iEZpvd = (int) ((c29535kvV.OLrzqt * yII.EZpvd(f * 10)) / 10.0f);
            }
            layoutParams.width = iEZpvd;
            imageView.setLayoutParams(layoutParams);
            if (num != null) {
                heq.AhwBna.setColorFilter(num.intValue());
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: renamed from: o.kvV$LoaderManager */
    public static final class LoaderManager implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ int AYXKKw;
        public final /* synthetic */ hEQ AhwBna;
        public final /* synthetic */ java.lang.Integer EZpvd;
        public final /* synthetic */ float KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ boolean copydefault;
        public final /* synthetic */ C29535kvV valueOf;

        public LoaderManager(hEQ heq, C29535kvV c29535kvV, boolean z, boolean z2, int i, android.content.Context context, java.lang.Integer num, float f) {
            this.AhwBna = heq;
            this.valueOf = c29535kvV;
            this.AEQbTJ = z;
            this.copydefault = z2;
            this.AYXKKw = i;
            this.OLrzqt = context;
            this.EZpvd = num;
            this.KWHzl = f;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.AhwBna.AhwBna.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C29535kvV c29535kvV = this.valueOf;
            android.view.ViewParent parent = this.AhwBna.AhwBna.getParent();
            Intrinsics.copydefault(parent, "");
            c29535kvV.OLrzqt = ((android.widget.FrameLayout) parent).getWidth();
            C29535kvV.AEQbTJ(this.AhwBna, this.AEQbTJ, this.copydefault, this.AYXKKw, this.OLrzqt, this.EZpvd, this.KWHzl, this.valueOf);
        }
    }

    public final void EZpvd(hEQ heq, SignalUiModel signalUiModel) {
        android.widget.ImageView imageView = heq.ejfBZ;
        android.graphics.drawable.Drawable drawableOLrzqt = OLrzqt(signalUiModel.ejfBZ());
        if (drawableOLrzqt != null) {
            drawableOLrzqt.setTint(C25382ivf.KWHzl(TxType.Companion.AEQbTJ(signalUiModel.ejfBZ())));
        } else {
            drawableOLrzqt = null;
        }
        imageView.setImageDrawable(drawableOLrzqt);
        android.widget.TextView textView = heq.uzCIH;
        TxType.Companion companion = TxType.Companion;
        textView.setText(C33070mpX.AYXKKw(companion.EZpvd(signalUiModel.ejfBZ())));
        heq.uzCIH.setTextColor(C25382ivf.KWHzl(companion.AEQbTJ(signalUiModel.ejfBZ())));
        java.lang.String strAYXKKw = signalUiModel.AYXKKw();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw)) {
            strAYXKKw = null;
        }
        if (strAYXKKw != null) {
            heq.zLjUOn.setText(C25322iuY.OLrzqt.EZpvd(strAYXKKw));
        }
        android.widget.ImageView imageView2 = heq.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadImageWithBorder$default(imageView2, signalUiModel.AuCTel(), null, 2, null);
        android.widget.ImageView imageView3 = heq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        C25386ivj.KWHzl(imageView3, signalUiModel.AEQbTJ(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
    }

    public final void EZpvd(hEQ heq, int i, SignalUiModel signalUiModel) {
        int i2;
        android.content.Context context = heq.getRoot().getContext();
        heq.iwGUEr.setText(signalUiModel.fIwbmz());
        int i3 = TaskDescription.EZpvd[signalUiModel.valueOf().ordinal()];
        if (i3 == 1) {
            i2 = C23274hvD.Fragment.DXXBbs;
        } else if (i3 == 2) {
            i2 = C23274hvD.Fragment.OqFWZa;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C23274hvD.Fragment.ODWQjV;
        }
        Intrinsics.copydefault(context);
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(signalUiModel.values()))));
        java.lang.String localCurrencyWithPrecision$default = C23271hvA.getLocalCurrencyWithPrecision$default(C23271hvA.copydefault, signalUiModel.fARcdN(), null, 1, null);
        int iKWHzl = C25382ivf.KWHzl(TxType.Companion.AEQbTJ(signalUiModel.ejfBZ()));
        android.text.SpannableString spannableString = new android.text.SpannableString(strKWHzl + " " + ((java.lang.Object) new android.text.SpannableString(C33069mpW.KWHzl(context, C23274hvD.Fragment.DAIeex, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localCurrencyWithPrecision$default))))));
        spannableString.setSpan(new android.text.style.UnderlineSpan(), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, strKWHzl, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, strKWHzl, 0, false, 6, (java.lang.Object) null) + strKWHzl.length(), 33);
        if (!signalUiModel.getNewProxyInstance()) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, localCurrencyWithPrecision$default, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, localCurrencyWithPrecision$default, 0, false, 6, (java.lang.Object) null) + localCurrencyWithPrecision$default.length(), 33);
        }
        android.widget.TextView textView = heq.getNewProxyInstance;
        textView.setText(spannableString);
        textView.setOnClickListener(new Activity(textView, 1000L, signalUiModel, i, this));
        int iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context);
        heq.iwGUEr.setTextColor(iCopydefault);
        heq.getNewProxyInstance.setTextColor(iCopydefault);
        AEQbTJ(heq, signalUiModel.AkhnZx(), signalUiModel.getNewProxyInstance(), signalUiModel.fIwbmz(), signalUiModel.valueOf());
    }

    public final void copydefault(hEQ heq, SignalUiModel signalUiModel) {
        heq.fIwbmz.setText(signalUiModel.gEmmrt().length() == 0 ? "--" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, signalUiModel.gEmmrt(), false, false, RoundingMode.DOWN, false, 20, null));
        android.widget.TextView textView = heq.hDKMBd;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        textView.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(c23272hvB, signalUiModel.fetchVPNInfo(), null, null, false, 14, null));
        heq.getFieldNames.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(c23272hvB, signalUiModel.DbNXlk(), null, null, false, 14, null));
    }

    public final android.graphics.drawable.Drawable OLrzqt(TxType txType) {
        int i = TaskDescription.AEQbTJ[txType.ordinal()];
        if (i == 1) {
            return C33070mpX.KWHzl(C52761wXj.TaskDescription.ddhgMB);
        }
        if (i == 2) {
            return C33070mpX.KWHzl(C52761wXj.TaskDescription.fObYrO);
        }
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.ddhgMB);
    }
}
