package o;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32549mfg;
import o.C32581mgL;
import o.InterfaceC5386Ps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32581mgL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final java.util.Map<java.lang.String, android.util.Size> KWHzl = new LinkedHashMap();

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull C5328Nm c5328Nm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c5328Nm, "");
        c5328Nm.OLrzqt(new Activity(context, this.KWHzl));
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(glide, "");
        Intrinsics.checkNotNullParameter(registry, "");
        registry.OLrzqt(java.lang.String.class, android.graphics.Bitmap.class, new Application.ActionBar()).copydefault("Bitmap", java.nio.ByteBuffer.class, BitmapDrawable.class, new StateListAnimator(this.KWHzl)).copydefault("Bitmap", java.io.InputStream.class, BitmapDrawable.class, new TaskDescription(this.KWHzl));
    }

    /* JADX INFO: renamed from: o.mgL$Activity */
    public static final class Activity implements RY<java.lang.Object> {
        public final android.content.Context AEQbTJ;
        public final java.util.Map<java.lang.String, android.util.Size> KWHzl;

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<java.lang.Object> interfaceC5462Sq, boolean z) {
            return false;
        }

        public Activity(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, android.util.Size> map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.AEQbTJ = context;
            this.KWHzl = map;
        }

        @Override // o.RY
        public boolean copydefault(java.lang.Object obj, java.lang.Object obj2, final InterfaceC5462Sq<java.lang.Object> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            final android.util.Size size;
            if (!(obj2 instanceof java.lang.String) || !this.KWHzl.containsKey(obj2) || (size = this.KWHzl.get(obj2)) == null) {
                return false;
            }
            if ((size.getWidth() <= C55297xhL.EZpvd() && size.getHeight() <= C55297xhL.EZpvd()) || !(interfaceC5462Sq instanceof AbstractC5458Sm)) {
                return false;
            }
            AbstractC5458Sm abstractC5458Sm = (AbstractC5458Sm) interfaceC5462Sq;
            android.widget.ImageView imageViewKWHzl = abstractC5458Sm.KWHzl();
            Intrinsics.checkNotNullExpressionValue(imageViewKWHzl, "");
            android.widget.ImageView imageView = imageViewKWHzl;
            if (imageView.getMeasuredWidth() > 0 && imageView.getMeasuredHeight() > 0) {
                ActionBar actionBar = C32581mgL.Companion;
                int width = size.getWidth();
                int height = size.getHeight();
                int measuredWidth = imageView.getMeasuredWidth();
                int measuredHeight = imageView.getMeasuredHeight();
                android.widget.ImageView imageViewKWHzl2 = abstractC5458Sm.KWHzl();
                Intrinsics.checkNotNullExpressionValue(imageViewKWHzl2, "");
                actionBar.EZpvd(width, height, measuredWidth, measuredHeight, imageViewKWHzl2);
                return false;
            }
            abstractC5458Sm.OLrzqt(new InterfaceC5457Sl() { // from class: o.mgN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC5457Sl
                public final void OLrzqt(int i, int i2) {
                    C32581mgL.Activity.KWHzl(size, interfaceC5462Sq, i, i2);
                }
            });
            return false;
        }

        public static final void KWHzl(android.util.Size size, InterfaceC5462Sq interfaceC5462Sq, int i, int i2) {
            ActionBar actionBar = C32581mgL.Companion;
            int width = size.getWidth();
            int height = size.getHeight();
            android.widget.ImageView imageViewKWHzl = ((AbstractC5458Sm) interfaceC5462Sq).KWHzl();
            Intrinsics.checkNotNullExpressionValue(imageViewKWHzl, "");
            actionBar.EZpvd(width, height, i, i2, imageViewKWHzl);
        }
    }

    /* JADX INFO: renamed from: o.mgL$StateListAnimator */
    public static final class StateListAnimator implements NL<java.nio.ByteBuffer, BitmapDrawable> {
        public final java.util.Map<java.lang.String, android.util.Size> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
        @Override // o.NL
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(@NotNull java.nio.ByteBuffer byteBuffer, @NotNull NM nm) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            Intrinsics.checkNotNullParameter(nm, "");
            return true;
        }

        public StateListAnimator(@NotNull java.util.Map<java.lang.String, android.util.Size> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = map;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
        @Override // o.NL
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public OC<BitmapDrawable> copydefault(@NotNull java.nio.ByteBuffer byteBuffer, int i, int i2, @NotNull NM nm) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            Intrinsics.checkNotNullParameter(nm, "");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
            java.lang.String str = (java.lang.String) nm.OLrzqt(NJ.OLrzqt("url"));
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                return null;
            }
            java.util.Map<java.lang.String, android.util.Size> map = this.copydefault;
            Intrinsics.copydefault((java.lang.Object) str);
            map.put(str, new android.util.Size(options.outWidth, options.outHeight));
            return null;
        }
    }

    /* JADX INFO: renamed from: o.mgL$TaskDescription */
    public static final class TaskDescription implements NL<java.io.InputStream, BitmapDrawable> {
        public final java.util.Map<java.lang.String, android.util.Size> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
        @Override // o.NL
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(@NotNull java.io.InputStream inputStream, @NotNull NM nm) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(inputStream, "");
            Intrinsics.checkNotNullParameter(nm, "");
            return true;
        }

        public TaskDescription(@NotNull java.util.Map<java.lang.String, android.util.Size> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.KWHzl = map;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
        @Override // o.NL
        public OC<BitmapDrawable> copydefault(@NotNull java.io.InputStream inputStream, int i, int i2, @NotNull NM nm) {
            Intrinsics.checkNotNullParameter(inputStream, "");
            Intrinsics.checkNotNullParameter(nm, "");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            return null;
        }
    }

    /* JADX INFO: renamed from: o.mgL$Application */
    public static final class Application implements InterfaceC5386Ps<java.lang.String, android.graphics.Bitmap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
        @Override // o.InterfaceC5386Ps
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
        @Override // o.InterfaceC5386Ps
        public InterfaceC5386Ps.Application<android.graphics.Bitmap> AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull NM nm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nm, "");
            nm.copydefault(NJ.OLrzqt("url"), str);
            return null;
        }

        /* JADX INFO: renamed from: o.mgL$Application$ActionBar */
        public static final class ActionBar implements InterfaceC5390Pw<java.lang.String, android.graphics.Bitmap> {
            @Override // o.InterfaceC5390Pw
            public void AEQbTJ() {
            }

            @Override // o.InterfaceC5390Pw
            public InterfaceC5386Ps<java.lang.String, android.graphics.Bitmap> AEQbTJ(@NotNull PA pa) {
                Intrinsics.checkNotNullParameter(pa, "");
                return new Application();
            }
        }
    }

    /* JADX INFO: renamed from: o.mgL$LoaderManager */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class LoaderManager extends AbstractC52780wYb {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.CharSequence KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC52780wYb
        public java.lang.CharSequence AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC52780wYb
        public boolean OLrzqt() {
            return this.AEQbTJ;
        }

        public LoaderManager(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = "";
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            c52781wYc.setType(0);
        }

        @Override // o.AbstractC52780wYb
        public void copydefault(@NotNull C54953xam c54953xam) {
            Intrinsics.checkNotNullParameter(c54953xam, "");
            c54953xam.OLrzqt.setText(new android.text.SpannableStringBuilder().append((java.lang.CharSequence) this.EZpvd).append((java.lang.CharSequence) "This mismatch results in unnecessary memory usage. Please consult our Wiki ").append("Guide > Android Guide > Performance Improvement > Reduce memory footprint", new android.text.style.ForegroundColorSpan(-16776961), 33).append((java.lang.CharSequence) " for optimization guidelines."));
            c54953xam.KWHzl.setVisibility(8);
        }

        @Override // o.wXX
        public void onFooterCreated(@NotNull wYF wyf) {
            Intrinsics.checkNotNullParameter(wyf, "");
            super.onFooterCreated(wyf);
            wyf.setPrimaryText("OK");
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.mgJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C32581mgL.LoaderManager.OLrzqt(this.AEQbTJ, view);
                    }
                });
            }
        }

        public static final void OLrzqt(LoaderManager loaderManager, android.view.View view) {
            loaderManager.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.mgL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mgL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void EZpvd(final int i, final int i2, int i3, int i4, @NotNull android.widget.ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "");
            if (i3 > 0 && i4 > 0 && (i3 < i || i4 < i2)) {
                final android.app.Activity activityOLrzqt = OLrzqt(imageView.getContext());
                imageView.setForeground(AppCompatResources.getDrawable(imageView.getContext(), C32549mfg.Application.KWHzl));
                imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.mgK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return C32581mgL.ActionBar.KWHzl(activityOLrzqt, i, i2, view);
                    }
                });
            } else {
                imageView.setForeground(null);
                imageView.setOnLongClickListener(null);
            }
        }

        public static final boolean KWHzl(android.app.Activity activity, int i, int i2, android.view.View view) {
            if (!(activity instanceof AppCompatActivity)) {
                return false;
            }
            LoaderManager loaderManager = new LoaderManager("Image size = {" + i + ", " + i2 + "}\nView size = {" + view.getMeasuredWidth() + ", " + view.getMeasuredHeight() + "}\n");
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            loaderManager.show(supportFragmentManager);
            return false;
        }

        public final android.app.Activity OLrzqt(android.content.Context context) {
            if (context == null) {
                return null;
            }
            while (context instanceof android.content.ContextWrapper) {
                if (context instanceof android.app.Activity) {
                    return (android.app.Activity) context;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }
}
