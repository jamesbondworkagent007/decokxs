package com.okinc.business.defi.wallet.home.custom;

import android.content.Context;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.MarginLayoutParamsCompat;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C11600cUg;
import o.C13754dXa;
import o.C13821dZn;
import o.C18042fat;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTF;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfitAndLossGroupView$setText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $colorScheme;
    final /* synthetic */ BigDecimal $percentage;
    final /* synthetic */ BigDecimal $value;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C18042fat this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitAndLossGroupView$setText$1(C18042fat c18042fat, int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super ProfitAndLossGroupView$setText$1> continuation) {
        super(2, continuation);
        this.this$0 = c18042fat;
        this.$colorScheme = i;
        this.$value = bigDecimal;
        this.$percentage = bigDecimal2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfitAndLossGroupView$setText$1(this.this$0, this.$colorScheme, this.$value, this.$percentage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfitAndLossGroupView$setText$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppCompatTextView appCompatTextView;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        int iEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ViewParent parent = this.this$0.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            int iCopydefault = C11600cUg.copydefault(viewGroup != null ? C56443yFo.AEQbTJ(viewGroup.getMeasuredWidth()) : null);
            AppCompatTextView appCompatTextView2 = viewGroup != null ? (AppCompatTextView) viewGroup.findViewById(C13754dXa.ActionBar.DkIxYv) : null;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AppCompatTextView appCompatTextView3 = appCompatTextView2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$value, this.this$0, iCopydefault, appCompatTextView2, booleanRef2, booleanRef3, objectRef2, this.$percentage, null);
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = appCompatTextView3;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            appCompatTextView = appCompatTextView3;
            booleanRef = booleanRef2;
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appCompatTextView = (AppCompatTextView) this.L$2;
            objectRef = (Ref.ObjectRef) this.L$1;
            booleanRef = (Ref.BooleanRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setGravity(booleanRef.element ? 16 : 48);
        }
        this.this$0.setText((CharSequence) objectRef.element);
        C18042fat c18042fat = this.this$0;
        if (StringsKt__StringsKt.contains$default((CharSequence) objectRef.element, (CharSequence) "***", false, 2, (Object) null)) {
            C18042fat.TaskDescription taskDescription = C18042fat.Companion;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iEZpvd = taskDescription.EZpvd(context);
        } else {
            iEZpvd = this.$colorScheme;
        }
        c18042fat.setTextColor(iEZpvd);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.custom.ProfitAndLossGroupView$setText$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $isCharClipped;
        final /* synthetic */ Ref.BooleanRef $isClipPNLAssetValue;
        final /* synthetic */ int $parentWidth;
        final /* synthetic */ BigDecimal $percentage;
        final /* synthetic */ Ref.ObjectRef<String> $text;
        final /* synthetic */ AppCompatTextView $timeLabel;
        final /* synthetic */ BigDecimal $value;
        int label;
        final /* synthetic */ C18042fat this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BigDecimal bigDecimal, C18042fat c18042fat, int i, AppCompatTextView appCompatTextView, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef<String> objectRef, BigDecimal bigDecimal2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$value = bigDecimal;
            this.this$0 = c18042fat;
            this.$parentWidth = i;
            this.$timeLabel = appCompatTextView;
            this.$isCharClipped = booleanRef;
            this.$isClipPNLAssetValue = booleanRef2;
            this.$text = objectRef;
            this.$percentage = bigDecimal2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$value, this.this$0, this.$parentWidth, this.$timeLabel, this.$isCharClipped, this.$isClipPNLAssetValue, this.$text, this.$percentage, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
        /* JADX WARN: Type inference failed for: r11v14, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object objM7377constructorimpl2;
            String str;
            String plainString;
            BigDecimal bigDecimal;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18042fat c18042fat = this.this$0;
                BigDecimal bigDecimal2 = this.$value;
                try {
                    Result.Application application = Result.Companion;
                    if (bigDecimal2 == null) {
                        bigDecimal2 = BigDecimal.ZERO;
                    }
                    Intrinsics.copydefault(bigDecimal2);
                    objM7377constructorimpl = Result.m7377constructorimpl(c18042fat.KWHzl(bigDecimal2));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    objM7377constructorimpl = "--.--";
                }
                String str2 = (String) objM7377constructorimpl;
                C18042fat c18042fat2 = this.this$0;
                BigDecimal bigDecimal3 = this.$percentage;
                try {
                    Result.Application application3 = Result.Companion;
                    if (bigDecimal3 == null) {
                        bigDecimal3 = BigDecimal.ZERO;
                    }
                    Intrinsics.copydefault(bigDecimal3);
                    objM7377constructorimpl2 = Result.m7377constructorimpl(c18042fat2.OLrzqt(bigDecimal3));
                } catch (Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                String str3 = (String) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl2) == null ? objM7377constructorimpl2 : "--.--");
                BigDecimal bigDecimal4 = this.$value;
                BigDecimal bigDecimal5 = BigDecimal.ZERO;
                if (C33129mqd.AEQbTJ(bigDecimal4, bigDecimal5)) {
                    this.this$0.setRiseState(1);
                    str = Marker.ANY_NON_NULL_MARKER;
                } else if (C33129mqd.gEmmrt(this.$value, bigDecimal5)) {
                    this.this$0.setRiseState(-1);
                    str = "-";
                } else {
                    this.this$0.setRiseState(0);
                    str = "";
                }
                C18042fat c18042fat3 = this.this$0;
                try {
                    bigDecimal = this.$value;
                } catch (Exception unused) {
                }
                if (bigDecimal != null) {
                    plainString = bigDecimal.toPlainString();
                    if (plainString == null) {
                        plainString = "--";
                    }
                }
                c18042fat3.setFormattedValue(plainString);
                this.this$0.setFormattedPercentValue(str3);
                int i = this.$parentWidth;
                AppCompatTextView appCompatTextView = this.$timeLabel;
                Integer numAEQbTJ = null;
                int iCopydefault = C11600cUg.copydefault(appCompatTextView != null ? C56443yFo.AEQbTJ(appCompatTextView.getMeasuredWidth()) : null);
                AppCompatTextView appCompatTextView2 = this.$timeLabel;
                if (appCompatTextView2 != null) {
                    ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
                    numAEQbTJ = C56443yFo.AEQbTJ(layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0);
                }
                int iCopydefault2 = (i - iCopydefault) - C11600cUg.copydefault(numAEQbTJ);
                if (iCopydefault2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append(" (");
                    sb.append(str3);
                    sb.append(")");
                    float f = iCopydefault2;
                    this.$isCharClipped.element = this.this$0.getPaint().measureText(sb.toString()) > f;
                    Ref.BooleanRef booleanRef = this.$isClipPNLAssetValue;
                    TextPaint paint = this.this$0.getPaint();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    booleanRef.element = paint.measureText(sb2.toString()) > f;
                }
                Ref.ObjectRef<String> objectRef = this.$text;
                C13821dZn c13821dZn = C13821dZn.EZpvd;
                pTF ptf = pTF.KWHzl;
                if (this.$isCharClipped.element && this.$isClipPNLAssetValue.element && str2.length() >= 3) {
                    String strSubstring = str2.substring(0, str2.length() - 3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    str2 = strSubstring + "..";
                }
                objectRef.element = c13821dZn.OLrzqt(ptf.AEQbTJ(str + str2) + (this.$isCharClipped.element ? "\n" : " ") + "(" + str3 + ")");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
