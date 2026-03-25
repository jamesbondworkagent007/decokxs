package o;

import android.content.SharedPreferences;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48917uei extends android.widget.LinearLayout {
    public boolean AEQbTJ;
    public android.content.SharedPreferences AYXKKw;
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public final C54919xaE OLrzqt;
    public C54984xbQ copydefault;

    /* JADX INFO: renamed from: o.uei$Application */
    public interface Application {
        java.lang.String onGetTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48917uei(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClearClickCallback(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnExpandCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:24) call: o.uei.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C48917uei(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48917uei(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54919xaE c54919xaEEZpvd = C54919xaE.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54919xaEEZpvd, "");
        this.OLrzqt = c54919xaEEZpvd;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("search_record_expand_status", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.AYXKKw = sharedPreferences;
        c54919xaEEZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48917uei.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(C48917uei c48917uei, android.view.View view) {
        Function0<Unit> function0 = c48917uei.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        C54919xaE c54919xaE = c48917uei.OLrzqt;
        c54919xaE.KWHzl.setVisibility(8);
        C55372xih c55372xih = c54919xaE.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setVisibility(8);
    }

    public final <T extends Application> void setHistoryRecordList(@NotNull final java.util.List<? extends T> list, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.content.SharedPreferences sharedPreferences = this.AYXKKw;
        C33569myt.OLrzqt(getContext());
        this.AEQbTJ = sharedPreferences.getBoolean("javaClass", false);
        addDataForFlowLayout$default(this, list, 0, function1, 2, null);
        C54919xaE c54919xaE = this.OLrzqt;
        c54919xaE.KWHzl.setVisibility(0);
        C55372xih c55372xih = c54919xaE.EZpvd;
        c55372xih.KWHzl();
        c55372xih.setExpand(this.AEQbTJ);
        c55372xih.setVisibility(0);
        c55372xih.setOnFirstTimeMeasureCallback(new Function1() { // from class: o.ueo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48917uei.KWHzl(this.OLrzqt, list, function1, ((java.lang.Integer) obj).intValue());
            }
        });
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
        c54984xbQ.setOKDSSize(28);
        c54984xbQ.setSelectedStyle(false, 2);
        setExpandImage(c54984xbQ, ContextCompat.getDrawable(c54984xbQ.getContext(), this.OLrzqt.EZpvd.AEQbTJ() ? C52761wXj.TaskDescription.jNexW : C52761wXj.TaskDescription.bindToGooglePlayService));
        c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.uen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48917uei.setHistoryRecordList$lambda$9$lambda$8(this.copydefault, list, function1, c54984xbQ, view);
            }
        });
        this.copydefault = c54984xbQ;
        this.OLrzqt.EZpvd.setOnMeasureCallback(new Function1() { // from class: o.uem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48917uei.AEQbTJ(this.OLrzqt, list, function1, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(C48917uei c48917uei, java.util.List list, Function1 function1, int i) {
        if (i > 2) {
            c48917uei.AEQbTJ(list, c48917uei.AEQbTJ ? list.size() : c48917uei.OLrzqt.EZpvd.OLrzqt(), function1);
            c48917uei.OLrzqt.EZpvd.addView(c48917uei.copydefault);
        }
        return Unit.INSTANCE;
    }

    public static final void setHistoryRecordList$lambda$9$lambda$8(C48917uei c48917uei, java.util.List list, Function1 function1, C54984xbQ c54984xbQ, android.view.View view) {
        C55372xih c55372xih = c48917uei.OLrzqt.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setExpand(!c55372xih.AEQbTJ());
        SharedPreferences.Editor editorEdit = c48917uei.AYXKKw.edit();
        C33569myt.OLrzqt(c55372xih.getContext());
        editorEdit.putBoolean("javaClass", c55372xih.AEQbTJ());
        editorEdit.apply();
        if (c55372xih.AEQbTJ()) {
            addDataForFlowLayout$default(c48917uei, list, 0, function1, 2, null);
            c48917uei.setExpandImage(c54984xbQ, ContextCompat.getDrawable(c55372xih.getContext(), C52761wXj.TaskDescription.jNexW));
        } else {
            c48917uei.AEQbTJ(list, c55372xih.OLrzqt(), function1);
            c48917uei.setExpandImage(c54984xbQ, ContextCompat.getDrawable(c55372xih.getContext(), C52761wXj.TaskDescription.bindToGooglePlayService));
        }
        c48917uei.OLrzqt.EZpvd.addView(c48917uei.copydefault);
        Function1<? super java.lang.Boolean, Unit> function12 = c48917uei.EZpvd;
        if (function12 != null) {
            function12.invoke(java.lang.Boolean.valueOf(c55372xih.AEQbTJ()));
        }
    }

    public static final Unit AEQbTJ(C48917uei c48917uei, java.util.List list, Function1 function1, int i) {
        if (i > 2) {
            c48917uei.AEQbTJ(list, c48917uei.AEQbTJ ? list.size() : c48917uei.OLrzqt.EZpvd.OLrzqt(), function1);
            c48917uei.OLrzqt.EZpvd.addView(c48917uei.copydefault);
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.OLrzqt.OLrzqt.setText(charSequence);
    }

    public static /* synthetic */ void addDataForFlowLayout$default(C48917uei c48917uei, java.util.List list, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = list.size();
        }
        c48917uei.AEQbTJ(list, i, function1);
    }

    public final <T extends Application> void AEQbTJ(java.util.List<? extends T> list, int i, final Function1<? super T, Unit> function1) {
        C55372xih c55372xih = this.OLrzqt.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setVisibility(0);
        for (int i2 = 0; i2 < i; i2++) {
            final T t = list.get(i2);
            java.lang.String strOnGetTitle = t.onGetTitle();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOnGetTitle)) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
                c54984xbQ.setOKDSSize(28);
                c54984xbQ.setSelectedStyle(false, 2);
                c54984xbQ.setText(strOnGetTitle);
                android.content.Context context2 = c54984xbQ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c54984xbQ.setMaxWidth(C55298xhM.KWHzl(192.0f, context2));
                c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.uek
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C48917uei.copydefault(function1, t, view);
                    }
                });
                this.OLrzqt.EZpvd.addView(c54984xbQ);
            }
        }
    }

    public static final void copydefault(Function1 function1, Application application, android.view.View view) {
        function1.invoke(application);
    }

    public final void setExpandImage(C54984xbQ c54984xbQ, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c54984xbQ.getContext(), C52761wXj.Activity.aappFQ));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        c54984xbQ.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final void KWHzl() {
        SharedPreferences.Editor editorEdit = this.AYXKKw.edit();
        C33569myt.OLrzqt(getContext());
        editorEdit.putBoolean("javaClass", false);
        editorEdit.apply();
    }
}
