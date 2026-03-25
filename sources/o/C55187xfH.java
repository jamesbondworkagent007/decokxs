package o;

import android.content.SharedPreferences;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55187xfH extends android.widget.LinearLayout {
    public boolean AEQbTJ;
    public android.content.SharedPreferences AhwBna;
    public Function1<? super java.lang.CharSequence, Unit> EZpvd;
    public final C54919xaE KWHzl;
    public Function0<Unit> OLrzqt;
    public C54984xbQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55187xfH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClearCallback(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemSelectedCallback(Function1<? super java.lang.CharSequence, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:27) call: o.xfH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55187xfH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55187xfH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54919xaE c54919xaEEZpvd = C54919xaE.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54919xaEEZpvd, "");
        this.KWHzl = c54919xaEEZpvd;
        this.AhwBna = context.getSharedPreferences("search_record_expand_status", 0);
        c54919xaEEZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.xfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55187xfH.AEQbTJ(this.KWHzl, view);
            }
        });
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public static final void AEQbTJ(C55187xfH c55187xfH, android.view.View view) {
        Function0<Unit> function0 = c55187xfH.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        C54919xaE c54919xaE = c55187xfH.KWHzl;
        c54919xaE.KWHzl.setVisibility(8);
        C55372xih c55372xih = c54919xaE.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setVisibility(8);
    }

    public final void setHistoryRecordList(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.SharedPreferences sharedPreferences = this.AhwBna;
        C33569myt.OLrzqt(getContext());
        this.AEQbTJ = sharedPreferences.getBoolean("javaClass", false);
        addDataForFlowLayout$default(this, list, 0, 2, null);
        C54919xaE c54919xaE = this.KWHzl;
        c54919xaE.KWHzl.setVisibility(0);
        C55372xih c55372xih = c54919xaE.EZpvd;
        c55372xih.KWHzl();
        c55372xih.setExpand(this.AEQbTJ);
        c55372xih.setVisibility(0);
        c55372xih.setOnFirstTimeMeasureCallback(new Function1() { // from class: o.xfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55187xfH.OLrzqt(this.copydefault, list, ((java.lang.Integer) obj).intValue());
            }
        });
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
        c54984xbQ.setOKDSSize(28);
        c54984xbQ.setSelectedStyle(false, 2);
        setExpandImage(c54984xbQ, ContextCompat.getDrawable(c54984xbQ.getContext(), this.KWHzl.EZpvd.AEQbTJ() ? C52761wXj.TaskDescription.jNexW : C52761wXj.TaskDescription.bindToGooglePlayService));
        c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.xfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55187xfH.setHistoryRecordList$lambda$9$lambda$8(this.copydefault, list, c54984xbQ, view);
            }
        });
        this.copydefault = c54984xbQ;
        this.KWHzl.EZpvd.setOnMeasureCallback(new Function1() { // from class: o.xfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55187xfH.copydefault(this.KWHzl, list, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit OLrzqt(C55187xfH c55187xfH, java.util.List list, int i) {
        if (i > 2) {
            c55187xfH.copydefault(list, c55187xfH.AEQbTJ ? list.size() : c55187xfH.KWHzl.EZpvd.OLrzqt());
            c55187xfH.KWHzl.EZpvd.addView(c55187xfH.copydefault);
        }
        return Unit.INSTANCE;
    }

    public static final void setHistoryRecordList$lambda$9$lambda$8(C55187xfH c55187xfH, java.util.List list, C54984xbQ c54984xbQ, android.view.View view) {
        C55372xih c55372xih = c55187xfH.KWHzl.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setExpand(!c55372xih.AEQbTJ());
        SharedPreferences.Editor editorEdit = c55187xfH.AhwBna.edit();
        C33569myt.OLrzqt(c55372xih.getContext());
        editorEdit.putBoolean("javaClass", c55372xih.AEQbTJ());
        editorEdit.apply();
        if (c55372xih.AEQbTJ()) {
            addDataForFlowLayout$default(c55187xfH, list, 0, 2, null);
            c55187xfH.setExpandImage(c54984xbQ, ContextCompat.getDrawable(c55372xih.getContext(), C52761wXj.TaskDescription.jNexW));
        } else {
            c55187xfH.copydefault(list, c55372xih.OLrzqt());
            c55187xfH.setExpandImage(c54984xbQ, ContextCompat.getDrawable(c55372xih.getContext(), C52761wXj.TaskDescription.bindToGooglePlayService));
        }
        c55187xfH.KWHzl.EZpvd.addView(c55187xfH.copydefault);
    }

    public static final Unit copydefault(C55187xfH c55187xfH, java.util.List list, int i) {
        if (i > 2) {
            c55187xfH.copydefault(list, c55187xfH.AEQbTJ ? list.size() : c55187xfH.KWHzl.EZpvd.OLrzqt());
            c55187xfH.KWHzl.EZpvd.addView(c55187xfH.copydefault);
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        OLrzqt().setText(charSequence);
    }

    public static /* synthetic */ void addDataForFlowLayout$default(C55187xfH c55187xfH, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = list.size();
        }
        c55187xfH.copydefault(list, i);
    }

    public final void copydefault(java.util.List<java.lang.String> list, int i) {
        C55372xih c55372xih = this.KWHzl.EZpvd;
        c55372xih.removeAllViews();
        c55372xih.setVisibility(0);
        for (int i2 = 0; i2 < i; i2++) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
            c54984xbQ.setOKDSSize(28);
            c54984xbQ.setSelectedStyle(false, 2);
            c54984xbQ.setText(list.get(i2));
            android.content.Context context2 = c54984xbQ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c54984xbQ.setMaxWidth(C55298xhM.KWHzl(192.0f, context2));
            c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.xfN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55187xfH.AEQbTJ(this.AEQbTJ, c54984xbQ, view);
                }
            });
            this.KWHzl.EZpvd.addView(c54984xbQ);
        }
    }

    public static final void AEQbTJ(C55187xfH c55187xfH, C54984xbQ c54984xbQ, android.view.View view) {
        Function1<? super java.lang.CharSequence, Unit> function1 = c55187xfH.EZpvd;
        if (function1 != null) {
            function1.invoke(c54984xbQ.getText());
        }
    }

    public final void setExpandImage(C54984xbQ c54984xbQ, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c54984xbQ.getContext(), C52761wXj.Activity.aappFQ));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        c54984xbQ.setCompoundDrawablesRelative(drawable, null, null, null);
    }
}
