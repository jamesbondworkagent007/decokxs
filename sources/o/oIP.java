package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oIP extends RecyclerView.ViewHolder {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final android.widget.ImageView EZpvd;
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oIP(@NotNull android.widget.ImageView imageView, @NotNull Function1<? super java.lang.String, Unit> function1) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = imageView;
        this.OLrzqt = function1;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setImageBitmap(AEQbTJ(str));
        android.widget.ImageView imageView = this.EZpvd;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this, str));
    }

    public final android.graphics.Bitmap AEQbTJ(java.lang.String str) {
        android.content.Context context = this.EZpvd.getContext();
        Intrinsics.copydefault(context);
        int iOLrzqt = C55298xhM.OLrzqt(32, context);
        float fKWHzl = C55298xhM.KWHzl(24.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(fKWHzl);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iOLrzqt, iOLrzqt, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float f = iOLrzqt / 2.0f;
        canvas.drawText(str, f, f - rect.exactCenterY(), paint);
        return bitmapCreateBitmap;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ oIP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, oIP oip, java.lang.String str) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = oip;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.invoke(this.copydefault);
            }
        }
    }
}
