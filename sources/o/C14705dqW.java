package o;

import android.graphics.Paint;
import android.graphics.RectF;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14705dqW extends android.view.View {
    public java.util.ArrayList<TaskDescription> AEQbTJ;
    public float EZpvd;
    public final float KWHzl;
    public RectF OLrzqt;
    public final android.graphics.Paint copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14705dqW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14705dqW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.dqW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14705dqW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14705dqW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.KWHzl = C55298xhM.dp2pxFloat$default(6.0f, null, 1, null);
        this.AEQbTJ = new java.util.ArrayList<>();
        this.OLrzqt = new RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.copydefault = paint;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        if (this.AEQbTJ.isEmpty()) {
            this.copydefault.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
            RectF rectF = this.OLrzqt;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, height, height, this.copydefault);
            return;
        }
        if (this.AEQbTJ.size() == 1) {
            this.copydefault.setColor(C33070mpX.copydefault(((TaskDescription) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AEQbTJ)).copydefault()));
            RectF rectF2 = this.OLrzqt;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF2, height, height, this.copydefault);
            return;
        }
        java.lang.String strSubS$default = C33129mqd.subS$default(java.lang.Integer.valueOf(getWidth()), C33129mqd.mulS$default(java.lang.Float.valueOf(this.EZpvd), java.lang.Integer.valueOf(this.AEQbTJ.size() - 1), null, null, null, 14, null), null, null, null, 14, null);
        OLrzqt(strSubS$default);
        float f = 0.0f;
        for (TaskDescription taskDescription : this.AEQbTJ) {
            this.copydefault.setColor(C33070mpX.copydefault(taskDescription.copydefault()));
            float fDjBIcL = C33129mqd.djBIcL(C33129mqd.divS$default(C33129mqd.mulS$default(strSubS$default, taskDescription.OLrzqt(), null, null, null, 14, null), 100, null, null, null, 14, null));
            RectF rectF3 = this.OLrzqt;
            float f2 = fDjBIcL + f;
            rectF3.set(f, 0.0f, f2, getHeight());
            canvas.drawRoundRect(rectF3, height, height, this.copydefault);
            f = this.EZpvd + f2;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.AEQbTJ.size()), 1)) {
            return;
        }
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(java.lang.Float.valueOf(this.KWHzl), str, 0, null, 6, null), 100), false, 2, RoundingMode.DOWN, 1, null);
        java.lang.String strAddS$default = "";
        for (TaskDescription taskDescription : this.AEQbTJ) {
            taskDescription.copydefault(C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.max(C33129mqd.djBIcL(taskDescription.OLrzqt()), C33129mqd.djBIcL(strConvertToString$default)))));
            strAddS$default = C33129mqd.addS$default(strAddS$default, taskDescription.OLrzqt(), null, null, null, 14, null);
        }
        if (C33129mqd.AEQbTJ(strAddS$default, 100)) {
            java.lang.String strDivS$default = C33129mqd.divS$default("100", strAddS$default, null, null, null, 14, null);
            for (TaskDescription taskDescription2 : this.AEQbTJ) {
                taskDescription2.copydefault(C54862xYb.convertToString$default(C54862xYb.OLrzqt(taskDescription2.OLrzqt(), strDivS$default), false, 2, RoundingMode.DOWN, 1, null));
            }
        }
    }

    public static /* synthetic */ void setData$default(C14705dqW c14705dqW, java.util.List list, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 4.0f;
        }
        c14705dqW.setData(list, f);
    }

    public final void setData(@NotNull java.util.List<TaskDescription> list, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = C55298xhM.dp2pxFloat$default(f, null, 1, null);
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        requestLayout();
    }

    /* JADX INFO: renamed from: o.dqW$TaskDescription */
    public static final class TaskDescription {
        public final int KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i2 & 2) != 0) {
                i = taskDescription.KWHzl;
            }
            return taskDescription.OLrzqt(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DefiPercentageBean(percentage=" + this.copydefault + ", color=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.KWHzl = i;
        }
    }
}
