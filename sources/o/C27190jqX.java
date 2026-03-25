package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27190jqX extends LinearLayoutCompat {
    public final iML copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27190jqX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27190jqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.jqX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27190jqX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27190jqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        iML imlKWHzl = iML.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(imlKWHzl, "");
        this.copydefault = imlKWHzl;
    }

    public final void setData(@NotNull java.util.List<C27188jqV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.getRoot().removeAllViews();
        for (C27188jqV c27188jqV : list) {
            iMS imsCopydefault = iMS.copydefault(android.view.LayoutInflater.from(getContext()));
            imsCopydefault.EZpvd.setText(c27188jqV.AEQbTJ());
            if (!c27188jqV.KWHzl().isEmpty()) {
                C27212jqt c27212jqt = imsCopydefault.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c27212jqt, "");
                c27212jqt.setVisibility(c27188jqV.KWHzl().isEmpty() ^ true ? 0 : 8);
                C27538jxA c27538jxA = C27538jxA.EZpvd;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c27538jxA.OLrzqt(context, imsCopydefault.OLrzqt, C27538jxA.parseInvestLogoData$default(c27538jxA, c27188jqV.KWHzl(), null, null, null, 14, null), 20.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
            }
            Intrinsics.checkNotNullExpressionValue(imsCopydefault, "");
            this.copydefault.getRoot().addView(imsCopydefault.getRoot());
        }
    }

    /* JADX INFO: renamed from: o.jqX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jqX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
