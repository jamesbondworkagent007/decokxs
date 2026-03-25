package o;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUS {
    public static /* synthetic */ void loadImageBitmap$default(android.widget.ImageView imageView, java.lang.String str, AbstractC5396Qc[] abstractC5396QcArr, android.graphics.drawable.Drawable drawable, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        AEQbTJ(imageView, str, abstractC5396QcArr, drawable, function2);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull AbstractC5396Qc[] abstractC5396QcArr, android.graphics.drawable.Drawable drawable, @NotNull Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC5396QcArr, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C5335Nt c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd().copydefault(str).AEQbTJ(drawable).OLrzqt((RY) new Activity(str, function2));
        Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
        if (!(abstractC5396QcArr.length == 0)) {
            C5448Sc c5448ScAEQbTJ = new C5448Sc().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(abstractC5396QcArr, abstractC5396QcArr.length));
            Intrinsics.checkNotNullExpressionValue(c5448ScAEQbTJ, "");
            c5335NtOLrzqt = c5335NtOLrzqt.OLrzqt((RX<?>) c5448ScAEQbTJ);
        }
        c5335NtOLrzqt.EZpvd(imageView);
    }

    public static final class Activity implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ Function2<android.graphics.Bitmap, java.lang.Throwable, Unit> AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.lang.String str, Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit> function2) {
            this.KWHzl = str;
            this.AEQbTJ = function2;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            pUU.copydefault("loadImageBitmap", this.KWHzl + " failed: " + (glideException != null ? glideException.getMessage() : null));
            this.AEQbTJ.invoke(null, glideException);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            this.AEQbTJ.invoke(bitmap, null);
            return false;
        }
    }
}
