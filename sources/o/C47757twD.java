package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47757twD extends AbstractC43310rmq<ImageItem, AbstractC46288tOu> {
    public final Function2<ImageItem, android.graphics.Bitmap, Unit> AEQbTJ;
    public final Function1<java.lang.Integer, Unit> KWHzl;
    public final Function1<ImageItem, Unit> OLrzqt;
    public final Function1<ImageItem, Unit> copydefault;

    /* JADX INFO: renamed from: o.twD$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UploadState.values().length];
            try {
                iArr[UploadState.Idle.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UploadState.Uploading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadState.Success.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadState.Failed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47757twD() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.igXuih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r5v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.ImageItem, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.ImageItem, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.okinc.planet.domain.remote.dto.ImageItem, ? super android.graphics.Bitmap, kotlin.Unit>):void (m)] (LINE:27) call: o.twD.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C47757twD(Function1 function1, Function1 function12, Function1 function13, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.ImageItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.ImageItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.planet.domain.remote.dto.ImageItem, ? super android.graphics.Bitmap, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47757twD(Function1<? super ImageItem, Unit> function1, Function1<? super ImageItem, Unit> function12, Function1<? super java.lang.Integer, Unit> function13, Function2<? super ImageItem, ? super android.graphics.Bitmap, Unit> function2) {
        this.OLrzqt = function1;
        this.copydefault = function12;
        this.KWHzl = function13;
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C43312rms<AbstractC46288tOu> c43312rms, @NotNull final ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(imageItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, imageItem);
        EZpvd(imageItem, c43312rms);
        ShapeableImageView shapeableImageView = ((AbstractC46288tOu) c43312rms.OLrzqt()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        KWHzl(imageItem, shapeableImageView, new Function1() { // from class: o.twJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47757twD.KWHzl(imageItem, this, c43312rms, (android.graphics.Bitmap) obj);
            }
        }, new Function0() { // from class: o.twK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47757twD.EZpvd(imageItem, this, c43312rms);
            }
        });
        final AbstractC46288tOu abstractC46288tOu = (AbstractC46288tOu) c43312rms.OLrzqt();
        abstractC46288tOu.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.twH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47757twD.EZpvd(this.copydefault, imageItem, view);
            }
        });
        abstractC46288tOu.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.twN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47757twD.copydefault(imageItem, this, c43312rms, abstractC46288tOu, view);
            }
        });
        abstractC46288tOu.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.twP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47757twD.AEQbTJ(this.OLrzqt, c43312rms, view);
            }
        });
    }

    public static final Unit KWHzl(ImageItem imageItem, C47757twD c47757twD, C43312rms c43312rms, android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (imageItem.getUploadState() != UploadState.Failed) {
            Function2<ImageItem, android.graphics.Bitmap, Unit> function2 = c47757twD.AEQbTJ;
            if (function2 != null) {
                function2.invoke(imageItem, bitmap);
            }
            imageItem.setUploadState(UploadState.Uploading);
            c47757twD.EZpvd(imageItem, c43312rms);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ImageItem imageItem, C47757twD c47757twD, C43312rms c43312rms) {
        imageItem.setUploadState(UploadState.Failed);
        c47757twD.EZpvd(imageItem, c43312rms);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C47757twD c47757twD, ImageItem imageItem, android.view.View view) {
        Function1<ImageItem, Unit> function1 = c47757twD.OLrzqt;
        if (function1 != null) {
            function1.invoke(imageItem);
        }
    }

    public static final void copydefault(final ImageItem imageItem, final C47757twD c47757twD, final C43312rms c43312rms, AbstractC46288tOu abstractC46288tOu, android.view.View view) {
        java.lang.String remoteUrl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getNetPathUrl()) && (((remoteUrl = imageItem.getRemoteUrl()) == null || remoteUrl.length() == 0) && Intrinsics.EZpvd(imageItem.isLoadSuccess(), java.lang.Boolean.FALSE))) {
            imageItem.setUploadState(UploadState.Uploading);
            c47757twD.EZpvd(imageItem, c43312rms);
            ShapeableImageView shapeableImageView = abstractC46288tOu.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            c47757twD.KWHzl(imageItem, shapeableImageView, new Function1() { // from class: o.twI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47757twD.AEQbTJ(this.OLrzqt, imageItem, (android.graphics.Bitmap) obj);
                }
            }, new Function0() { // from class: o.twL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47757twD.OLrzqt(imageItem, c47757twD, c43312rms);
                }
            });
            return;
        }
        Function1<ImageItem, Unit> function1 = c47757twD.copydefault;
        if (function1 != null) {
            function1.invoke(imageItem);
        }
    }

    public static final Unit AEQbTJ(C47757twD c47757twD, ImageItem imageItem, android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        Function2<ImageItem, android.graphics.Bitmap, Unit> function2 = c47757twD.AEQbTJ;
        if (function2 != null) {
            function2.invoke(imageItem, bitmap);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ImageItem imageItem, C47757twD c47757twD, C43312rms c43312rms) {
        imageItem.setUploadState(UploadState.Failed);
        c47757twD.EZpvd(imageItem, c43312rms);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C47757twD c47757twD, C43312rms c43312rms, android.view.View view) {
        Function1<java.lang.Integer, Unit> function1 = c47757twD.KWHzl;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(c43312rms.getBindingAdapterPosition()));
        }
    }

    public final void EZpvd(ImageItem imageItem, C43312rms<AbstractC46288tOu> c43312rms) {
        AbstractC46288tOu abstractC46288tOu = (AbstractC46288tOu) c43312rms.OLrzqt();
        int i = Activity.copydefault[imageItem.getUploadState().ordinal()];
        if (i == 1) {
            abstractC46288tOu.KWHzl.setVisibility(8);
            abstractC46288tOu.EZpvd.setVisibility(8);
            abstractC46288tOu.AEQbTJ.setVisibility(8);
            abstractC46288tOu.copydefault.setVisibility(0);
            return;
        }
        if (i == 2) {
            abstractC46288tOu.KWHzl.setVisibility(0);
            abstractC46288tOu.EZpvd.setVisibility(0);
            abstractC46288tOu.AEQbTJ.setVisibility(8);
            abstractC46288tOu.copydefault.setVisibility(8);
            return;
        }
        if (i == 3) {
            abstractC46288tOu.KWHzl.setVisibility(8);
            abstractC46288tOu.EZpvd.setVisibility(8);
            abstractC46288tOu.AEQbTJ.setVisibility(8);
            abstractC46288tOu.copydefault.setVisibility(0);
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        abstractC46288tOu.KWHzl.setVisibility(0);
        abstractC46288tOu.EZpvd.setVisibility(8);
        abstractC46288tOu.AEQbTJ.setVisibility(0);
        abstractC46288tOu.copydefault.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.twD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadImageWithUrl$default(C47757twD c47757twD, ImageItem imageItem, android.widget.ImageView imageView, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImageWithUrl");
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        c47757twD.KWHzl(imageItem, imageView, (Function1<? super android.graphics.Bitmap, Unit>) function1, (Function0<Unit>) function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(ImageItem imageItem, android.widget.ImageView imageView, Function1<? super android.graphics.Bitmap, Unit> function1, Function0<Unit> function0) {
        java.lang.Object localUri = imageItem.getLocalUri();
        if (localUri == null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getBitmapKey())) {
                C48948ufM c48948ufM = C48948ufM.copydefault;
                java.lang.String bitmapKey = imageItem.getBitmapKey();
                Intrinsics.copydefault((java.lang.Object) bitmapKey);
                localUri = c48948ufM.KWHzl(bitmapKey);
                if (localUri == null) {
                    localUri = C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getFilePath()) ? imageItem.getFilePath() : null;
                }
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getFilePath())) {
                java.lang.String filePath = imageItem.getFilePath();
                Intrinsics.copydefault((java.lang.Object) filePath);
                java.io.File file = new java.io.File(filePath);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    localUri = imageItem.getFilePath();
                    Intrinsics.copydefault(localUri);
                }
            }
        }
        if (localUri == null || Glide.KWHzl(imageView).EZpvd().copydefault(localUri).KWHzl(C47501trL.ActionBar.fIwbmz).copydefault(C47501trL.ActionBar.fIwbmz).EZpvd(imageView) == null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) imageItem.getNetPathUrl())) {
                Intrinsics.copydefault(Glide.KWHzl(imageView).EZpvd().copydefault(imageItem.getNetPathUrl()).DbNXlk().copydefault(Integer.MIN_VALUE, Integer.MIN_VALUE).KWHzl(C47501trL.ActionBar.fIwbmz).copydefault(C47501trL.ActionBar.fIwbmz).copydefault((RY) new StateListAnimator(imageItem, function0, function1)).EZpvd(imageView));
            } else {
                imageView.setImageResource(C47501trL.ActionBar.fIwbmz);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.twD$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ ImageItem KWHzl;
        public final /* synthetic */ Function1<android.graphics.Bitmap, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(ImageItem imageItem, Function0<Unit> function0, Function1<? super android.graphics.Bitmap, Unit> function1) {
            this.KWHzl = imageItem;
            this.AEQbTJ = function0;
            this.OLrzqt = function1;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            Function0<Unit> function0;
            this.KWHzl.setLoadSuccess(java.lang.Boolean.FALSE);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl.getNetPathUrl())) {
                return false;
            }
            java.lang.String remoteUrl = this.KWHzl.getRemoteUrl();
            if ((remoteUrl != null && remoteUrl.length() != 0) || (function0 = this.AEQbTJ) == null) {
                return false;
            }
            function0.invoke();
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            this.KWHzl.setLoadSuccess(java.lang.Boolean.TRUE);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl.getNetPathUrl())) {
                return false;
            }
            java.lang.String remoteUrl = this.KWHzl.getRemoteUrl();
            if (remoteUrl != null && remoteUrl.length() != 0) {
                return false;
            }
            pUU.EZpvd("FileUpload", "ImageItemTemplate start upload id=" + this.KWHzl.getId() + "  path =" + this.KWHzl.getNetPathUrl());
            Function1<android.graphics.Bitmap, Unit> function1 = this.OLrzqt;
            if (function1 == null) {
                return false;
            }
            function1.invoke(bitmap);
            return false;
        }
    }
}
