package o;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.ok_kyc_core.camera.OKCompliancePreviewActivity$displayBitmapOnMainThread$1;
import com.okinc.ok_kyc_core.camera.OKCompliancePreviewActivity$loadAndDisplayPdf$1;
import com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean;
import com.okinc.ok_kyc_core.camera.PreviewerMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C32113mPz;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC43724rug extends AbstractActivityC33044moy<AbstractC43753rvI> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ = "";
    public android.net.Uri AYXKKw;
    public TaskDescription EZpvd;
    public RecyclerView KWHzl;
    public android.net.Uri djBIcL;

    /* JADX INFO: renamed from: o.rug$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PreviewerMode.values().length];
            try {
                iArr[PreviewerMode.Camera.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewerMode.Gallery.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PreviewerMode.DirectShow.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C43662rtX.TaskDescription.KWHzl;
    }

    /* JADX INFO: renamed from: o.rug$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rug.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            try {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC43724rug.class);
                kotlin.Pair[] pairArr = (kotlin.Pair[]) C56427yEz.AkhnZx(map).toArray(new kotlin.Pair[0]);
                intent.putExtras(BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length)));
                activityResultLauncher.launch(intent);
            } catch (java.lang.Exception e) {
                pUU.copydefault("NotificationServiceExtension", "launcher error=" + e);
            }
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        AhwBna();
        overridePendingTransition(C32113mPz.Activity.KWHzl, 0);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            AbstractC43753rvI abstractC43753rvIKWHzl = KWHzl();
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                java.lang.String string = extras.getString("PreviewerMode");
                if (string == null) {
                    string = "";
                }
                int i = Activity.OLrzqt[PreviewerMode.valueOf(string).ordinal()];
                if (i == 1) {
                    abstractC43753rvIKWHzl.KWHzl.setVisibility(8);
                    abstractC43753rvIKWHzl.gEmmrt.setVisibility(0);
                    abstractC43753rvIKWHzl.djBIcL.setVisibility(0);
                    abstractC43753rvIKWHzl.AEQbTJ.setVisibility(8);
                    ShapeableImageView shapeableImageView = abstractC43753rvIKWHzl.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                    AEQbTJ(extras, shapeableImageView, true);
                    return;
                }
                if (i == 2) {
                    abstractC43753rvIKWHzl.KWHzl.setVisibility(0);
                    abstractC43753rvIKWHzl.gEmmrt.setVisibility(8);
                    abstractC43753rvIKWHzl.djBIcL.setVisibility(8);
                    abstractC43753rvIKWHzl.AEQbTJ.setVisibility(0);
                    ShapeableImageView shapeableImageView2 = abstractC43753rvIKWHzl.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                    fillImage$default(this, extras, shapeableImageView2, false, 4, null);
                    return;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC43753rvIKWHzl.KWHzl.setVisibility(0);
                abstractC43753rvIKWHzl.copydefault.setVisibility(8);
                abstractC43753rvIKWHzl.OLrzqt.setVisibility(0);
                java.lang.String string2 = extras.getString("FileType");
                if (string2 != null) {
                    int iHashCode = string2.hashCode();
                    if (iHashCode != -1248334925) {
                        if (iHashCode == 1911932022 && string2.equals("image/*")) {
                            ShapeableImageView shapeableImageView3 = abstractC43753rvIKWHzl.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
                            fillImage$default(this, extras, shapeableImageView3, false, 4, null);
                            return;
                        }
                    } else if (string2.equals("application/pdf")) {
                        OLrzqt(extras);
                        return;
                    }
                }
                C55326xho.toast$default("Unsupported file format", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                OLrzqt();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), java.lang.String.valueOf(e));
        }
    }

    private final void copydefault() {
        AbstractC43753rvI abstractC43753rvIKWHzl = KWHzl();
        abstractC43753rvIKWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43724rug.AEQbTJ(this.KWHzl, view);
            }
        });
        abstractC43753rvIKWHzl.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.rul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43724rug.AhwBna(this.OLrzqt, view);
            }
        });
        abstractC43753rvIKWHzl.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.ruo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43724rug.djBIcL(this.AEQbTJ, view);
            }
        });
        abstractC43753rvIKWHzl.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43724rug.gEmmrt(this.AEQbTJ, view);
            }
        });
        this.KWHzl = abstractC43753rvIKWHzl.OLrzqt;
    }

    public static final void AEQbTJ(ActivityC43724rug activityC43724rug, android.view.View view) {
        activityC43724rug.OLrzqt();
    }

    public static final void AhwBna(ActivityC43724rug activityC43724rug, android.view.View view) {
        try {
            android.net.Uri uri = null;
            if (Build.VERSION.SDK_INT >= 29) {
                android.content.ContentResolver contentResolver = activityC43724rug.getContentResolver();
                android.net.Uri uri2 = activityC43724rug.AYXKKw;
                if (uri2 == null) {
                    Intrinsics.gEmmrt("");
                    uri2 = null;
                }
                contentResolver.delete(uri2, null, null);
            } else {
                android.net.Uri uri3 = activityC43724rug.AYXKKw;
                if (uri3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    uri = uri3;
                }
                java.lang.String path = uri.getPath();
                Intrinsics.copydefault((java.lang.Object) path);
                new java.io.File(path).delete();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(activityC43724rug.getTAG(), java.lang.String.valueOf(e));
        }
        activityC43724rug.OLrzqt();
    }

    public static final void djBIcL(ActivityC43724rug activityC43724rug, android.view.View view) {
        activityC43724rug.EZpvd();
        activityC43724rug.OLrzqt();
    }

    public static final void gEmmrt(ActivityC43724rug activityC43724rug, android.view.View view) {
        activityC43724rug.EZpvd();
        activityC43724rug.OLrzqt();
    }

    public final void EZpvd() {
        if (this.AYXKKw == null) {
            Intrinsics.gEmmrt("");
        }
        android.content.Intent intent = new android.content.Intent();
        POACameraGalleryOutputBean[] pOACameraGalleryOutputBeanArr = new POACameraGalleryOutputBean[1];
        android.net.Uri uri = this.AYXKKw;
        if (uri == null) {
            Intrinsics.gEmmrt("");
            uri = null;
        }
        pOACameraGalleryOutputBeanArr[0] = new POACameraGalleryOutputBean(uri, this.AEQbTJ, "image/*");
        intent.putParcelableArrayListExtra(POACameraGalleryOutputBean.KEY, yDY.copydefault(pOACameraGalleryOutputBeanArr));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
    }

    private final void OLrzqt() {
        finish();
        overridePendingTransition(0, C32113mPz.Activity.AEQbTJ);
    }

    public static /* synthetic */ void fillImage$default(ActivityC43724rug activityC43724rug, android.os.Bundle bundle, ShapeableImageView shapeableImageView, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        activityC43724rug.AEQbTJ(bundle, shapeableImageView, z);
    }

    public final void AEQbTJ(android.os.Bundle bundle, ShapeableImageView shapeableImageView, boolean z) {
        try {
            java.lang.String string = bundle.getString("URI");
            Intrinsics.copydefault((java.lang.Object) string);
            this.AYXKKw = android.net.Uri.parse(string);
            this.AEQbTJ = bundle.getString("FileName", "");
            android.net.Uri uri = null;
            if (z) {
                ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.dimensionRatio = "9:16";
                    shapeableImageView.setLayoutParams(layoutParams2);
                    shapeableImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(0, C55298xhM.dp2pxFloat$default(16.0f, null, 1, null)).build());
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault((FragmentActivity) this);
            android.net.Uri uri2 = this.AYXKKw;
            if (uri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                uri = uri2;
            }
            Intrinsics.copydefault(componentCallbacks2C5333NrCopydefault.EZpvd(uri).fetchVPNInfo().KWHzl(C43662rtX.Activity.OBJEWx).EZpvd((android.widget.ImageView) shapeableImageView));
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), java.lang.String.valueOf(e));
        }
    }

    public final void OLrzqt(android.os.Bundle bundle) {
        try {
            java.lang.String string = bundle.getString("URI");
            Intrinsics.copydefault((java.lang.Object) string);
            this.djBIcL = android.net.Uri.parse(string);
            this.AEQbTJ = bundle.getString("FileName", "");
            android.net.Uri uri = this.djBIcL;
            if (uri == null) {
                Intrinsics.gEmmrt("");
                uri = null;
            }
            KWHzl(uri);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), java.lang.String.valueOf(e));
        }
    }

    private final void AhwBna() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        RecyclerView recyclerView = this.KWHzl;
        TaskDescription taskDescription = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        this.EZpvd = new TaskDescription();
        RecyclerView recyclerView2 = this.KWHzl;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        TaskDescription taskDescription2 = this.EZpvd;
        if (taskDescription2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            taskDescription = taskDescription2;
        }
        recyclerView2.setAdapter(taskDescription);
    }

    public final void KWHzl(android.net.Uri uri) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new OKCompliancePreviewActivity$loadAndDisplayPdf$1(this, uri, null), 2, null);
    }

    public final android.graphics.Bitmap OLrzqt(PdfRenderer.Page page) {
        int iApplyDimension = (int) android.util.TypedValue.applyDimension(3, page.getWidth(), getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) android.util.TypedValue.applyDimension(3, page.getHeight(), getResources().getDisplayMetrics());
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = (iApplyDimension2 * i) / iApplyDimension;
        pUU.KWHzl(getTAG(), "Rendered PDF: adjustedWidth = " + i + "\tadjustedHeight = " + i2 + "\twidth = " + iApplyDimension + "\theight = " + iApplyDimension2);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i - C55298xhM.dp2px$default(20.0f, null, 1, null), i2 - C55298xhM.dp2px$default(20.0f, null, 1, null), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        page.render(bitmapCreateBitmap, null, null, 1);
        return bitmapCreateBitmap;
    }

    public final void AEQbTJ(android.graphics.Bitmap bitmap) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new OKCompliancePreviewActivity$displayBitmapOnMainThread$1(this, bitmap, null), 2, null);
    }

    /* JADX INFO: renamed from: o.rug$TaskDescription */
    public static final class TaskDescription extends RecyclerView.Adapter<Application> {
        public final java.util.List<android.graphics.Bitmap> OLrzqt = new java.util.ArrayList();

        public final void KWHzl(@NotNull android.graphics.Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            this.OLrzqt.add(bitmap);
            notifyItemInserted(this.OLrzqt.size() - 1);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C43662rtX.TaskDescription.DaRZkR, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new Application(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.KWHzl(this.OLrzqt.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        /* JADX INFO: renamed from: o.rug$TaskDescription$Application */
        public final class Application extends RecyclerView.ViewHolder {
            public final android.widget.ImageView EZpvd;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C43662rtX.ActionBar.DQzvGNdrmXxudrmXxu);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (android.widget.ImageView) viewFindViewById;
            }

            public final void KWHzl(@NotNull android.graphics.Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "");
                this.EZpvd.setImageBitmap(bitmap);
            }
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
