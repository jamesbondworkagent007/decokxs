package o;

import android.graphics.PointF;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nPC extends AbstractC5450Se<SubsamplingScaleImageView, java.io.File> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final Function2<java.lang.Float, PointF, Unit> AYXKKw;
    public final SubsamplingScaleImageView djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Float, ? super android.graphics.PointF, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nPC(@NotNull SubsamplingScaleImageView subsamplingScaleImageView, Function2<? super java.lang.Float, ? super PointF, Unit> function2) {
        super(subsamplingScaleImageView);
        Intrinsics.checkNotNullParameter(subsamplingScaleImageView, "");
        this.djBIcL = subsamplingScaleImageView;
        this.AYXKKw = function2;
        subsamplingScaleImageView.setOnImageEventListener(new SubsamplingScaleImageView.OnImageEventListener() { // from class: o.nPC.3
            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onImageLoadError(java.lang.Exception exc) {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onImageLoaded() {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onPreviewLoadError(java.lang.Exception exc) {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onPreviewReleased() {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onTileLoadError(java.lang.Exception exc) {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
            public void onReady() {
                nPC npc;
                Function2 function22;
                float width = nPC.this.djBIcL.getWidth() / nPC.this.djBIcL.getSWidth();
                float sHeight = nPC.this.djBIcL.getSHeight();
                nPC.this.djBIcL.setMaxScale(20.0f);
                if (sHeight * width > nPC.this.djBIcL.getHeight()) {
                    pUU.EZpvd("SubsamplingScaleImageViewTarget", "The image is taller than the view.");
                    PointF pointF = new PointF(0.0f, 0.0f);
                    nPC.this.djBIcL.setMinimumScaleType(4);
                    nPC.this.djBIcL.setMinScale(width);
                    nPC.this.djBIcL.setScaleAndCenter(width, pointF);
                    Function2 function23 = nPC.this.AYXKKw;
                    if (function23 != null) {
                        function23.invoke(java.lang.Float.valueOf(width), pointF);
                        return;
                    }
                    return;
                }
                pUU.EZpvd("SubsamplingScaleImageViewTarget", "The image is shorter than or fits within the view.");
                nPC.this.djBIcL.setMinimumScaleType(1);
                nPC.this.djBIcL.resetScaleAndCenter();
                PointF center = nPC.this.djBIcL.getCenter();
                if (center == null || (function22 = (npc = nPC.this).AYXKKw) == null) {
                    return;
                }
                function22.invoke(java.lang.Float.valueOf(npc.djBIcL.getScale()), center);
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
    @Override // o.InterfaceC5462Sq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull java.io.File file, InterfaceC5460So<? super java.io.File> interfaceC5460So) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageSource imageSourceUri = ImageSource.uri(android.net.Uri.fromFile(file));
        Intrinsics.checkNotNullExpressionValue(imageSourceUri, "");
        this.djBIcL.setOrientation(-1);
        this.djBIcL.setImage(imageSourceUri);
    }

    @Override // o.InterfaceC5462Sq
    public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
        pUU.valueOf("SubsamplingScaleImageViewTarget", "Image load failed");
    }

    @Override // o.AbstractC5450Se
    public void OLrzqt(android.graphics.drawable.Drawable drawable) {
        pUU.EZpvd("SubsamplingScaleImageViewTarget", "Resource cleared");
    }
}
