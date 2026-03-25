package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37158ooZ extends android.view.View {
    public static final ActionBar Companion = new ActionBar(null);

    public C37158ooZ(android.content.Context context) {
        super(context);
    }

    public C37158ooZ(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        AEQbTJ(canvas, getWidth(), getHeight());
        canvas.save();
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i, int i2) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(855638016);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(861230421);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(45.0f, context);
        int i3 = i / iCopydefault;
        if (i3 < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 / iCopydefault;
            if (i5 >= 0) {
                int i6 = 0;
                while (true) {
                    canvas.drawRect(i4 * iCopydefault, i6 * iCopydefault, r8 + iCopydefault, r9 + iCopydefault, (i4 + i6) % 2 == 0 ? paint : paint2);
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (i4 == i3) {
                return;
            } else {
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: o.ooZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
