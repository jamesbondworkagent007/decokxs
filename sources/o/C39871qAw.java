package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.market.search.features.kline.formula.model.FormulaSearchData;
import com.okinc.market.search.features.kline.formula.model.FormulaSearchHistoryItemVo;
import com.okinc.market.search.features.kline.formula.widget.FormulaSearchHeaderView$checkClickAction$2$1;
import com.okinc.market.search.features.kline.formula.widget.FormulaSearchHeaderView$initView$3$2;
import com.okinc.market.search.features.kline.formula.widget.FormulaSearchHeaderView$onTextChanged$1;
import com.okinc.market.search.features.kline.formula.widget.FormulaSearchHeaderView$textChangesFlow$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C33473mxC;
import o.C52761wXj;
import o.qAG;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39871qAw extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C42657raZ AEQbTJ;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Job copydefault;
    public qAJ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39871qAw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39871qAw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qAJ EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(qAJ qaj) {
        this.gEmmrt = qaj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:73) call: o.qAw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39871qAw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39871qAw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42657raZ c42657raZOLrzqt = C42657raZ.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42657raZOLrzqt, "");
        this.AEQbTJ = c42657raZOLrzqt;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39871qAw.KWHzl();
            }
        });
        this.KWHzl = "";
        if (ViewCompat.isAttachedToWindow(this)) {
            AhwBna();
        } else {
            addOnAttachStateChangeListener(new LoaderManager(this, this));
        }
    }

    /* JADX INFO: renamed from: o.qAw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qAw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.qAw$LoaderManager */
    public static final class LoaderManager implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C39871qAw KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public LoaderManager(android.view.View view, C39871qAw c39871qAw) {
            this.AEQbTJ = view;
            this.KWHzl = c39871qAw;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            this.KWHzl.AhwBna();
        }
    }

    private final java.util.ArrayList<FormulaSearchHistoryItemVo> valueOf() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList KWHzl() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("sp_market_key_history_formula", FormulaSearchHistoryItemVo.class);
        return arrayList == null ? new java.util.ArrayList() : arrayList;
    }

    public final Flow<java.lang.CharSequence> KWHzl(android.widget.EditText editText) {
        return FlowKt.callbackFlow(new FormulaSearchHeaderView$textChangesFlow$1(editText, this, null));
    }

    /* JADX INFO: renamed from: o.qAw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C39871qAw KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C39871qAw c39871qAw) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c39871qAw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(qZH.PendingIntent.OxbLUn);
                viewOnClickListenerC54939xaY.copydefault(qZH.PendingIntent.HJWChPiaHEvk);
                viewOnClickListenerC54939xaY.EZpvd(qZH.PendingIntent.uzCIH, new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.qAw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C39871qAw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C39871qAw c39871qAw) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c39871qAw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                qAJ qajEZpvd = this.copydefault.EZpvd();
                if (qajEZpvd != null) {
                    qajEZpvd.EZpvd();
                }
            }
        }
    }

    public final Job AEQbTJ(android.widget.EditText editText) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(editText);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return null;
        }
        return BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new FormulaSearchHeaderView$onTextChanged$1(this, editText, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(int i) {
        android.graphics.drawable.Drawable drawableKWHzl = i > 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.TarCU) : null;
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        this.AEQbTJ.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null);
    }

    public final void AEQbTJ(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        EZpvd(true);
        android.text.Editable text = this.AEQbTJ.AEQbTJ.getText();
        C39863qAo c39863qAo = C39863qAo.EZpvd;
        if (c39863qAo.AEQbTJ(C33129mqd.gEmmrt(text))) {
            AppCompatTextView appCompatTextView = this.AEQbTJ.AYXKKw;
            Intrinsics.copydefault(appCompatTextView);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(C33070mpX.AYXKKw(qZH.PendingIntent.fAklCm));
            Intrinsics.copydefault(appCompatTextView);
        } else {
            AppCompatTextView appCompatTextView2 = this.AEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
            this.AEQbTJ.AEQbTJ.setBackground(C33070mpX.KWHzl(qZH.Activity.fetchVPNInfo));
            copydefault();
            KWHzl(bizInstrument);
        }
        qAJ qaj = this.gEmmrt;
        if (qaj != null) {
            qaj.OLrzqt(c39863qAo.copydefault(C33129mqd.gEmmrt(text)));
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.text.Editable text = this.AEQbTJ.AEQbTJ.getText();
        if (text != null) {
            text.insert(this.AEQbTJ.AEQbTJ.getSelectionStart(), str);
        }
    }

    public final void copydefault() {
        int selectionEnd = this.AEQbTJ.AEQbTJ.getSelectionEnd();
        int length = selectionEnd - this.KWHzl.length();
        if (length < 0) {
            return;
        }
        android.text.Editable text = this.AEQbTJ.AEQbTJ.getText();
        if (text != null) {
            text.delete(length, selectionEnd);
        }
        this.KWHzl = "";
    }

    public final void KWHzl(BizInstrument bizInstrument) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSStyle(6);
        c55251xgS.setOKDSSize(-3);
        c55251xgS.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c55251xgS.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg)));
        c55251xgS.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c55251xgS.setText(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, null, false, bizInstrument.getDisplayId(), 60, null));
        c55251xgS.measure(0, 0);
        c55251xgS.layout(0, 0, c55251xgS.getMeasuredWidth(), c55251xgS.getMeasuredHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(c55251xgS.getMeasuredWidth(), c55251xgS.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        c55251xgS.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        android.text.SpannableString spannableString = new android.text.SpannableString("{" + bizInstrument.getInstId() + ContainerUtils.FIELD_DELIMITER + bizInstrument.getInstType() + "}");
        spannableString.setSpan(new C39861qAm(bitmapDrawable, C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)), 0, spannableString.length(), 33);
        int selectionStart = this.AEQbTJ.AEQbTJ.getSelectionStart();
        android.text.Editable text = this.AEQbTJ.AEQbTJ.getText();
        if (text != null) {
            text.insert(selectionStart, spannableString);
        }
    }

    public final void OLrzqt() {
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.AEQbTJ.AEQbTJ.getText());
        qAJ qaj = this.gEmmrt;
        if (qaj != null) {
            qaj.OLrzqt(C39863qAo.EZpvd.copydefault(strGEmmrt));
        }
        java.lang.String strCopydefault = C39863qAo.EZpvd.copydefault(strGEmmrt, new Function2() { // from class: o.qAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C39871qAw.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        if (strCopydefault != null) {
            AppCompatTextView appCompatTextView = this.AEQbTJ.AYXKKw;
            Intrinsics.copydefault(appCompatTextView);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(strCopydefault);
            this.AEQbTJ.AEQbTJ.setBackground(C33070mpX.KWHzl(qZH.Activity.fJNWhG));
            return;
        }
        FormulaSearchHistoryItemVo formulaSearchHistoryItemVo = new FormulaSearchHistoryItemVo(strGEmmrt);
        if (valueOf().contains(formulaSearchHistoryItemVo)) {
            valueOf().remove(formulaSearchHistoryItemVo);
        }
        valueOf().add(0, formulaSearchHistoryItemVo);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(valueOf().size()), 6)) {
            valueOf().remove(5);
        }
        SPUtils.put("sp_market_key_history_formula", valueOf());
        C48917uei c48917uei = this.AEQbTJ.KWHzl;
        Intrinsics.copydefault(c48917uei);
        c48917uei.setVisibility(valueOf().isEmpty() ^ true ? 0 : 8);
        c48917uei.setHistoryRecordList(valueOf(), new FormulaSearchHeaderView$checkClickAction$2$1(this));
        copydefault(formulaSearchHistoryItemVo);
    }

    public static final Unit EZpvd(C39871qAw c39871qAw, int i, int i2) {
        android.text.Editable text = c39871qAw.AEQbTJ.AEQbTJ.getText();
        Intrinsics.copydefault(text, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder((android.text.SpannableStringBuilder) text);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)), i, i2, 33);
        int selectionEnd = c39871qAw.AEQbTJ.AEQbTJ.getSelectionEnd();
        Job job = c39871qAw.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        c39871qAw.AEQbTJ.AEQbTJ.setText(spannableStringBuilder);
        c39871qAw.AEQbTJ.AEQbTJ.setSelection(selectionEnd);
        qAG qag = c39871qAw.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(qag, "");
        c39871qAw.copydefault = c39871qAw.AEQbTJ(qag);
        return Unit.INSTANCE;
    }

    public final void copydefault(FormulaSearchHistoryItemVo formulaSearchHistoryItemVo) {
        if (formulaSearchHistoryItemVo != null) {
            java.lang.String strReplace = new Regex("\\{[^{}]*\\}|(\\d+(\\.\\d+)?)").replace(formulaSearchHistoryItemVo.getTitle(), new Function1() { // from class: o.qAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39871qAw.OLrzqt((MatchResult) obj);
                }
            });
            C40375qTn c40375qTn = C40375qTn.AEQbTJ;
            c40375qTn.copydefault("FormulaSearchHeaderView", "formula str: " + strReplace);
            FormulaSearchData formulaSearchDataOLrzqt = OLrzqt(strReplace);
            c40375qTn.copydefault("FormulaSearchHeaderView", "extracted str: " + formulaSearchDataOLrzqt);
            java.lang.String strOnGetTitle = formulaSearchHistoryItemVo.onGetTitle();
            AEQbTJ(strOnGetTitle);
            qAJ qaj = this.gEmmrt;
            if (qaj != null) {
                qaj.OLrzqt(strOnGetTitle, formulaSearchDataOLrzqt);
            }
        }
    }

    public static final java.lang.CharSequence OLrzqt(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        if (matchResult.OLrzqt().get(1).length() > 0) {
            return "{" + ((java.lang.Object) matchResult.OLrzqt().get(1)) + "}";
        }
        return matchResult.KWHzl();
    }

    public final FormulaSearchData OLrzqt(java.lang.String str) {
        int i = 0;
        java.util.List<java.lang.String> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(Regex.findAll$default(new Regex("\\{([^}]+)\\}"), str, 0, 2, null), new Function1() { // from class: o.qAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39871qAw.KWHzl((MatchResult) obj);
            }
        }));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strReplaceFirst$default = str;
        for (java.lang.String str2 : listZuBGHE) {
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null));
            if (listFJNWhG.size() == 1) {
                listFJNWhG.add("CONST");
            } else {
                listFJNWhG.set(1, KWHzl((java.lang.String) listFJNWhG.get(1)));
            }
            C56404yEc.zsXlph(listFJNWhG);
            arrayList.add(listFJNWhG);
            strReplaceFirst$default = C59449zhJ.replaceFirst$default(strReplaceFirst$default, "{" + str2 + "}", ExifInterface.GPS_MEASUREMENT_INTERRUPTED + i, false, 4, (java.lang.Object) null);
            i++;
        }
        return new FormulaSearchData(EZpvd(strReplaceFirst$default), C33488mxR.EZpvd(arrayList));
    }

    public static final java.lang.String KWHzl(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.OLrzqt().get(1);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OPTION") ? "MARK" : "TRADE";
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return C59449zhJ.replace$default(C59449zhJ.replace$default(str, "×", "*", false, 4, (java.lang.Object) null), "÷", "/", false, 4, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        qAG qag = this.AEQbTJ.AEQbTJ;
        Intrinsics.copydefault(qag);
        this.copydefault = AEQbTJ(qag);
        qag.setFilters(new qAI[]{new qAI()});
        new C33473mxC(qag, new Application(qag));
        this.AEQbTJ.AEQbTJ.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.qAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return C39871qAw.AEQbTJ(this.OLrzqt, textView, i, keyEvent);
            }
        });
        final C48917uei c48917uei = this.AEQbTJ.KWHzl;
        c48917uei.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.aBDePw));
        c48917uei.setOnClearClickCallback(new Function0() { // from class: o.qAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39871qAw.AEQbTJ(c48917uei, this);
            }
        });
        c48917uei.setHistoryRecordList(valueOf(), new FormulaSearchHeaderView$initView$3$2(this));
        Intrinsics.copydefault(c48917uei);
        c48917uei.setVisibility(valueOf().isEmpty() ^ true ? 0 : 8);
        C55258xgZ c55258xgZ = this.AEQbTJ.OLrzqt;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = this.AEQbTJ.copydefault;
        c55258xgZ2.setOnClickListener(new TaskDescription(c55258xgZ2, 1000L, this));
        this.AEQbTJ.AEQbTJ.setOnKeyClickListener(new Fragment());
    }

    /* JADX INFO: renamed from: o.qAw$Application */
    public static final class Application implements C33473mxC.Activity {
        public final /* synthetic */ qAG OLrzqt;

        public Application(qAG qag) {
            this.OLrzqt = qag;
        }

        @Override // o.C33473mxC.Activity
        public void EZpvd(android.view.View view, android.graphics.drawable.Drawable drawable) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.setText("");
        }

        @Override // o.C33473mxC.Activity
        public void KWHzl(android.view.View view, android.graphics.drawable.Drawable drawable) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.setText("");
        }
    }

    public static final boolean AEQbTJ(C39871qAw c39871qAw, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 2 && i != 3 && i != 6) {
            return false;
        }
        c39871qAw.EZpvd(false);
        return true;
    }

    public static final Unit AEQbTJ(C48917uei c48917uei, C39871qAw c39871qAw) {
        Intrinsics.copydefault(c48917uei);
        c48917uei.setVisibility(8);
        c39871qAw.valueOf().clear();
        SPUtils.put("sp_market_key_history_formula", c39871qAw.valueOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qAw$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.qAw$Fragment */
    public static final class Fragment implements qAG.Application {
        public Fragment() {
        }

        @Override // o.qAG.Application
        public boolean KWHzl() {
            int selectionStart = C39871qAw.this.AEQbTJ.AEQbTJ.getSelectionStart();
            int selectionEnd = C39871qAw.this.AEQbTJ.AEQbTJ.getSelectionEnd();
            C40375qTn c40375qTn = C40375qTn.AEQbTJ;
            c40375qTn.copydefault("FormulaSearchHeaderView", "SearchInput: start delete, selectionStart " + selectionStart + ", selectionEnd " + selectionEnd);
            if (!C33129mqd.gEmmrt(java.lang.Integer.valueOf(selectionStart), 0) && !C33129mqd.gEmmrt(java.lang.Integer.valueOf(selectionEnd), 0)) {
                android.text.Editable text = C39871qAw.this.AEQbTJ.AEQbTJ.getText();
                android.text.style.ImageSpan[] imageSpanArr = text != null ? (android.text.style.ImageSpan[]) text.getSpans(selectionStart, selectionEnd, android.text.style.ImageSpan.class) : null;
                if (imageSpanArr != null) {
                    if (!(imageSpanArr.length == 0)) {
                        c40375qTn.copydefault("FormulaSearchHeaderView", "SearchInput: " + imageSpanArr.length + " spans");
                        java.util.Iterator itEZpvd = yHX.EZpvd(imageSpanArr);
                        while (itEZpvd.hasNext()) {
                            android.text.style.ImageSpan imageSpan = (android.text.style.ImageSpan) itEZpvd.next();
                            int spanStart = text.getSpanStart(imageSpan);
                            int spanEnd = text.getSpanEnd(imageSpan);
                            C40375qTn.AEQbTJ.copydefault("FormulaSearchHeaderView", "SearchInput: spanStart " + spanStart + ", selectionEnd " + selectionEnd + ", spanEnd " + spanEnd);
                            if (C33129mqd.copydefault(java.lang.Integer.valueOf(selectionEnd), java.lang.Integer.valueOf(spanEnd))) {
                                text.delete(spanStart, spanEnd);
                                C39871qAw.this.AEQbTJ.AEQbTJ.setSelection(spanStart);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // o.qAG.Application
        public boolean EZpvd() {
            C39871qAw.this.EZpvd(false);
            return true;
        }
    }

    public final void EZpvd(boolean z) {
        qAG qag = this.AEQbTJ.AEQbTJ;
        if (z) {
            Intrinsics.copydefault(qag);
            android.content.Context context = qag.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C41431qqg.EZpvd(qag, context);
            return;
        }
        Intrinsics.copydefault(qag);
        android.content.Context context2 = qag.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C41431qqg.AEQbTJ(qag, context2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.AEQbTJ.KWHzl.KWHzl();
        super.onDetachedFromWindow();
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("Chart_Formula_Coins_Click", (TrackChannel[]) null, new Function1() { // from class: o.qAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39871qAw.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "operations", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
