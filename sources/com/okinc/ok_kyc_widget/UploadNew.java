package com.okinc.ok_kyc_widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_widget.UploadNew;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC5360Os;
import o.AbstractC5454Si;
import o.AbstractC59533zio;
import o.C33070mpX;
import o.C41934rAe;
import o.C43662rtX;
import o.C52761wXj;
import o.C5448Sc;
import o.C55113xdn;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.C59534zip;
import o.InterfaceC5460So;
import o.InterfaceC56445yFq;
import o.RX;
import o.pTD;
import o.pUU;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadNew extends ConstraintLayout {
    public Function1<? super UploadFileViewModel, Unit> AEQbTJ;
    public Function1<? super UploadFileViewModel, Unit> AYXKKw;
    public Function1<? super UploadFileViewModel, Unit> AhwBna;
    public List<String> AkhnZx;
    public boolean DbNXlk;
    public int EZpvd;
    public ArrayList<Object> KWHzl;
    public Function1<? super UploadFileViewModel, Unit> OLrzqt;
    public Function1<? super UploadFileViewModel, Unit> copydefault;
    public int djBIcL;
    public Set<? extends Status> fetchVPNInfo;
    public View.OnClickListener gEmmrt;
    public final C59534zip valueOf;
    public C41934rAe values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadNew(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadNew(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Object> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteCallback(@NotNull Function1<? super UploadFileViewModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownloadCallback(@NotNull Function1<? super UploadFileViewModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailedOverSize(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewCallback(@NotNull Function1<? super UploadFileViewModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRetryCallback(@NotNull Function1<? super UploadFileViewModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:55) call: com.okinc.ok_kyc_widget.UploadNew.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ UploadNew(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status UPLOAD = new Status("UPLOAD", 0);
        public static final Status UPLOADING = new Status("UPLOADING", 1);
        public static final Status UPLOAD_FAILED = new Status("UPLOAD_FAILED", 2);
        public static final Status URL_LOADING = new Status("URL_LOADING", 3);
        public static final Status URL_LOAD_FAILED = new Status("URL_LOAD_FAILED", 4);
        public static final Status URL_LOAD_SUCCESS = new Status("URL_LOAD_SUCCESS", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{UPLOAD, UPLOADING, UPLOAD_FAILED, URL_LOADING, URL_LOAD_FAILED, URL_LOAD_SUCCESS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadNew(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = yDY.gEmmrt("PNG", "JPEG");
        this.EZpvd = 1;
        this.djBIcL = 5;
        this.fetchVPNInfo = yEE.AhwBna(Status.UPLOAD, Status.URL_LOADING, Status.URL_LOAD_FAILED, Status.URL_LOAD_SUCCESS);
        C59534zip c59534zip = new C59534zip();
        this.valueOf = c59534zip;
        this.KWHzl = new ArrayList<>();
        this.values = C41934rAe.copydefault(LayoutInflater.from(context), this, true);
        c59534zip.register(UploadFileViewModel.class, new Application(context, new Function1() { // from class: o.rVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.djBIcL(this.AEQbTJ, (UploadNew.UploadFileViewModel) obj);
            }
        }, new Function1() { // from class: o.rVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.AYXKKw(this.EZpvd, (UploadNew.UploadFileViewModel) obj);
            }
        }, new Function1() { // from class: o.rVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.AhwBna(this.copydefault, (UploadNew.UploadFileViewModel) obj);
            }
        }, new Function1() { // from class: o.rVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.valueOf(this.OLrzqt, (UploadNew.UploadFileViewModel) obj);
            }
        }, new Function1() { // from class: o.rVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.gEmmrt(this.EZpvd, (UploadNew.UploadFileViewModel) obj);
            }
        }));
        this.values.AYXKKw.setAdapter(c59534zip);
        this.values.AYXKKw.addItemDecoration(new Activity(3, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null)));
        this.values.AYXKKw.setLayoutManager(new GridLayoutManager(context, 3));
        c59534zip.setItems(this.KWHzl);
        KWHzl();
        this.AhwBna = new Function1() { // from class: o.rVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.valueOf((UploadNew.UploadFileViewModel) obj);
            }
        };
        this.copydefault = new Function1() { // from class: o.rVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.gEmmrt((UploadNew.UploadFileViewModel) obj);
            }
        };
        this.AYXKKw = new Function1() { // from class: o.rVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.AYXKKw((UploadNew.UploadFileViewModel) obj);
            }
        };
        this.AEQbTJ = new Function1() { // from class: o.rVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.AhwBna((UploadNew.UploadFileViewModel) obj);
            }
        };
        this.OLrzqt = new Function1() { // from class: o.rVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UploadNew.djBIcL((UploadNew.UploadFileViewModel) obj);
            }
        };
    }

    public static final Unit djBIcL(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        uploadNew.AhwBna.invoke(uploadFileViewModel);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        uploadNew.copydefault.invoke(uploadFileViewModel);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        uploadNew.AYXKKw.invoke(uploadFileViewModel);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        uploadNew.AEQbTJ.invoke(uploadFileViewModel);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        uploadNew.OLrzqt.invoke(uploadFileViewModel);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        if (this.KWHzl.size() <= 0) {
            this.values.EZpvd.setVisibility(0);
            this.values.djBIcL.setVisibility(this.DbNXlk ? 0 : 8);
            this.values.copydefault.setVisibility(8);
            this.values.AYXKKw.setVisibility(8);
            return;
        }
        if (this.KWHzl.size() < this.EZpvd) {
            this.values.EZpvd.setVisibility(8);
            this.values.djBIcL.setVisibility(8);
            this.values.copydefault.setVisibility(0);
            this.values.AEQbTJ.setBackground(ContextCompat.getDrawable(getContext(), C43662rtX.Activity.values));
            int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl);
            this.values.KWHzl.setImageTintList(ColorStateList.valueOf(color));
            this.values.AhwBna.setTextColor(color);
            this.values.AYXKKw.setVisibility(0);
            return;
        }
        this.values.EZpvd.setVisibility(8);
        this.values.djBIcL.setVisibility(8);
        this.values.copydefault.setVisibility(0);
        this.values.AEQbTJ.setBackground(ContextCompat.getDrawable(getContext(), C43662rtX.Activity.fetchVPNInfo));
        int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe);
        this.values.KWHzl.setImageTintList(ColorStateList.valueOf(color2));
        this.values.AhwBna.setTextColor(color2);
        this.values.AYXKKw.setVisibility(0);
    }

    public final void setUploadClick(View.OnClickListener onClickListener) {
        this.gEmmrt = onClickListener;
        this.values.EZpvd.setOnClickListener(onClickListener);
        this.values.AEQbTJ.setOnClickListener(this.gEmmrt);
    }

    public final void copydefault(@NotNull List<UploadFileViewModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = this.KWHzl.size();
        this.KWHzl.addAll(list);
        EZpvd();
        KWHzl();
        this.valueOf.notifyItemRangeInserted(size, list.size());
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application extends AbstractC59533zio<UploadFileViewModel, StateListAnimator> {
        public Function1<? super UploadFileViewModel, Unit> AEQbTJ;
        public Function1<? super UploadFileViewModel, Unit> AhwBna;
        public Function1<? super UploadFileViewModel, Unit> EZpvd;
        public Function1<? super UploadFileViewModel, Unit> KWHzl;
        public final Context OLrzqt;
        public Function1<? super UploadFileViewModel, Unit> copydefault;

        /* JADX INFO: loaded from: classes23.dex */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SingleFileUploadUseCase.FileType.values().length];
                try {
                    iArr[SingleFileUploadUseCase.FileType.IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SingleFileUploadUseCase.FileType.PDF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit> */
        public final Function1<UploadFileViewModel, Unit> EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit> */
        public final Function1<UploadFileViewModel, Unit> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.ok_kyc_widget.UploadNew$UploadFileViewModel, kotlin.Unit> */
        public final Function1<UploadFileViewModel, Unit> copydefault() {
            return this.KWHzl;
        }

        /* JADX INFO: renamed from: com.okinc.ok_kyc_widget.UploadNew$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0529Application implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ UploadFileViewModel EZpvd;
            public final /* synthetic */ Application KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0529Application(View view, long j, UploadFileViewModel uploadFileViewModel, Application application) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.EZpvd = uploadFileViewModel;
                this.KWHzl = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    if (this.EZpvd.getStatus() == Status.URL_LOAD_FAILED) {
                        this.KWHzl.copydefault().invoke(this.EZpvd);
                    } else {
                        this.KWHzl.EZpvd().invoke(this.EZpvd);
                    }
                }
            }
        }

        public static final class Fragment implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ Application KWHzl;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ UploadFileViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Fragment(View view, long j, Application application, UploadFileViewModel uploadFileViewModel) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.KWHzl = application;
                this.copydefault = uploadFileViewModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.KWHzl.OLrzqt().invoke(this.copydefault);
                }
            }
        }

        public static final class FragmentManager implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ Application KWHzl;
            public final /* synthetic */ UploadFileViewModel OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FragmentManager(View view, long j, Application application, UploadFileViewModel uploadFileViewModel) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.KWHzl = application;
                this.OLrzqt = uploadFileViewModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.KWHzl.KWHzl(this.OLrzqt);
                }
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ UploadFileViewModel OLrzqt;
            public final /* synthetic */ Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, Application application, UploadFileViewModel uploadFileViewModel) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.copydefault = application;
                this.OLrzqt = uploadFileViewModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.copydefault.KWHzl(this.OLrzqt);
                }
            }
        }

        public Application(@NotNull Context context, @NotNull Function1<? super UploadFileViewModel, Unit> function1, @NotNull Function1<? super UploadFileViewModel, Unit> function12, @NotNull Function1<? super UploadFileViewModel, Unit> function13, @NotNull Function1<? super UploadFileViewModel, Unit> function14, @NotNull Function1<? super UploadFileViewModel, Unit> function15) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            Intrinsics.checkNotNullParameter(function15, "");
            this.OLrzqt = context;
            this.AhwBna = function1;
            this.EZpvd = function12;
            this.AEQbTJ = function13;
            this.copydefault = function14;
            this.KWHzl = function15;
        }

        public final boolean EZpvd(Context context) {
            if (context == null) {
                return false;
            }
            if (!(context instanceof android.app.Activity)) {
                return true;
            }
            android.app.Activity activity = (android.app.Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }

        public final void copydefault(ImageView imageView, Uri uri, Function1<? super Boolean, Unit> function1) {
            if (EZpvd(imageView.getContext())) {
                Intrinsics.copydefault(Glide.AEQbTJ(imageView.getContext()).EZpvd(uri).OLrzqt((RX<?>) new C5448Sc().copydefault(AbstractC5360Os.copydefault).copydefault(false)).OLrzqt(new Activity(function1, imageView)));
            } else {
                function1.invoke(Boolean.FALSE);
                pUU.KWHzl("File_UPLOAD", "isValidContextForGlide failed");
            }
        }

        public static final class Activity extends AbstractC5454Si<Drawable> {
            public final /* synthetic */ Function1<Boolean, Unit> AEQbTJ;
            public final /* synthetic */ ImageView KWHzl;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(Function1<? super Boolean, Unit> function1, ImageView imageView) {
                this.AEQbTJ = function1;
                this.KWHzl = imageView;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                this.KWHzl.setImageDrawable(drawable);
                this.AEQbTJ.invoke(Boolean.TRUE);
            }

            @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
            public void AEQbTJ(Drawable drawable) {
                super.AEQbTJ(drawable);
                pUU.KWHzl("File_UPLOAD", "onLoadFailed");
                this.AEQbTJ.invoke(Boolean.FALSE);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.fFgQHt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final StateListAnimator stateListAnimator, @NotNull UploadFileViewModel uploadFileViewModel) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
            ShapeableImageView shapeableImageViewAEQbTJ = stateListAnimator.AEQbTJ();
            shapeableImageViewAEQbTJ.setOnClickListener(new TaskDescription(shapeableImageViewAEQbTJ, 1000L, this, uploadFileViewModel));
            ImageView imageViewOLrzqt = stateListAnimator.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new ViewOnClickListenerC0529Application(imageViewOLrzqt, 1000L, uploadFileViewModel, this));
            ImageView imageViewEZpvd = stateListAnimator.EZpvd();
            imageViewEZpvd.setOnClickListener(new Fragment(imageViewEZpvd, 1000L, this, uploadFileViewModel));
            ImageView imageViewCopydefault = stateListAnimator.copydefault();
            imageViewCopydefault.setOnClickListener(new FragmentManager(imageViewCopydefault, 1000L, this, uploadFileViewModel));
            stateListAnimator.gEmmrt().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
            stateListAnimator.gEmmrt().setText(uploadFileViewModel.getFileName());
            stateListAnimator.gEmmrt().setEllipsize(TextUtils.TruncateAt.MIDDLE);
            Glide.AEQbTJ(this.OLrzqt).AEQbTJ(stateListAnimator.AEQbTJ());
            stateListAnimator.AEQbTJ().setImageDrawable(null);
            stateListAnimator.KWHzl().setVisibility(8);
            stateListAnimator.OLrzqt().setVisibility(8);
            stateListAnimator.EZpvd().setVisibility(8);
            if (uploadFileViewModel.getStatus() == Status.UPLOADING || uploadFileViewModel.getStatus() == Status.URL_LOADING) {
                stateListAnimator.djBIcL().setAutoMirrored(true);
                stateListAnimator.djBIcL().setVisibility(0);
                if (stateListAnimator.djBIcL().isAnimating()) {
                    return;
                }
                stateListAnimator.djBIcL().KWHzl(0L);
                return;
            }
            stateListAnimator.djBIcL().cancelAnimation();
            stateListAnimator.djBIcL().setVisibility(8);
            stateListAnimator.EZpvd().setVisibility(0);
            if (uploadFileViewModel.getStatus() == Status.UPLOAD || uploadFileViewModel.getStatus() == Status.URL_LOAD_SUCCESS) {
                int i = ActionBar.OLrzqt[uploadFileViewModel.getFileType().ordinal()];
                if (i == 1) {
                    stateListAnimator.AEQbTJ().setVisibility(0);
                    copydefault(stateListAnimator.AEQbTJ(), uploadFileViewModel.getUri(), new Function1() { // from class: o.rVJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return UploadNew.Application.copydefault(this.KWHzl, stateListAnimator, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                } else if (i == 2) {
                    Uri uri = uploadFileViewModel.getUri();
                    stateListAnimator.AEQbTJ().setVisibility(0);
                    AEQbTJ(this.OLrzqt, uri, stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl());
                }
            }
            Status status = uploadFileViewModel.getStatus();
            Status status2 = Status.UPLOAD_FAILED;
            if (status == status2 || uploadFileViewModel.getStatus() == Status.URL_LOAD_FAILED) {
                stateListAnimator.OLrzqt().setVisibility(0);
                stateListAnimator.gEmmrt().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
                stateListAnimator.gEmmrt().setText(uploadFileViewModel.getStatus() == status2 ? C33070mpX.AYXKKw(C43662rtX.Dialog.OJuSTm) : C33070mpX.AYXKKw(C43662rtX.Dialog.zuBGHE));
                stateListAnimator.gEmmrt().setEllipsize(TextUtils.TruncateAt.END);
            }
        }

        public static final Unit copydefault(Application application, StateListAnimator stateListAnimator, boolean z) {
            if (!z) {
                application.AEQbTJ(false, stateListAnimator.KWHzl());
            }
            return Unit.INSTANCE;
        }

        public final void KWHzl(UploadFileViewModel uploadFileViewModel) {
            if (uploadFileViewModel.getStatus() == Status.UPLOAD) {
                this.AEQbTJ.invoke(uploadFileViewModel);
            }
            if (uploadFileViewModel.getStatus() == Status.URL_LOAD_SUCCESS) {
                if (uploadFileViewModel.getFileType() == SingleFileUploadUseCase.FileType.IMAGE) {
                    this.AEQbTJ.invoke(uploadFileViewModel);
                } else if (uploadFileViewModel.getFileType() == SingleFileUploadUseCase.FileType.PDF) {
                    this.copydefault.invoke(uploadFileViewModel);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: android.content.Context */
        /* JADX WARN: Multi-variable type inference failed */
        public final void AEQbTJ(Context context, Uri uri, ImageView imageView, ImageView imageView2) {
            LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
            LifecycleCoroutineScope lifecycleScope = lifecycleOwner != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner) : null;
            if (lifecycleScope != null) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getIO(), null, new UploadNew$UploadItemViewBinder$renderPdfPage$1(context, uri, lifecycleScope, imageView, this, imageView2, null), 2, null);
            }
        }

        public final void AEQbTJ(boolean z, ImageView imageView) {
            if (z) {
                imageView.setImageResource(C52761wXj.TaskDescription.aRClCA);
            } else {
                imageView.setImageResource(C52761wXj.TaskDescription.doTurnConnection);
            }
            imageView.setVisibility(0);
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public final ImageView AEQbTJ;
            public final C55113xdn AhwBna;
            public final ImageView EZpvd;
            public final ShapeableImageView KWHzl;
            public final ImageView OLrzqt;
            public final ImageView copydefault;
            public final TextView valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ShapeableImageView AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageView EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageView KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageView OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageView copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C55113xdn djBIcL() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TextView gEmmrt() {
                return this.valueOf;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                View viewFindViewById = view.findViewById(C43662rtX.ActionBar.DcMfJKfNUfqk);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.valueOf = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C43662rtX.ActionBar.DrqXHJ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.OLrzqt = (ImageView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(C43662rtX.ActionBar.zSsVtY);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.EZpvd = (ImageView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(C43662rtX.ActionBar.hrjNmC);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.KWHzl = (ShapeableImageView) viewFindViewById4;
                View viewFindViewById5 = view.findViewById(C43662rtX.ActionBar.gtdfxv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                this.AEQbTJ = (ImageView) viewFindViewById5;
                View viewFindViewById6 = view.findViewById(C43662rtX.ActionBar.apAOXX);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
                this.AhwBna = (C55113xdn) viewFindViewById6;
                View viewFindViewById7 = view.findViewById(C43662rtX.ActionBar.DUUtXg);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
                this.copydefault = (ImageView) viewFindViewById7;
            }
        }
    }

    public final void AEQbTJ() {
        int size = this.KWHzl.size();
        if (size > 0) {
            this.KWHzl.clear();
            EZpvd();
            KWHzl();
            this.valueOf.notifyItemRangeRemoved(0, size);
        }
    }

    public static /* synthetic */ void addFile$default(UploadNew uploadNew, UploadFileViewModel uploadFileViewModel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        uploadNew.OLrzqt(uploadFileViewModel, z);
    }

    public final void OLrzqt(@NotNull UploadFileViewModel uploadFileViewModel, boolean z) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        int size = this.KWHzl.size();
        this.KWHzl.add(uploadFileViewModel);
        EZpvd();
        this.valueOf.notifyItemInserted(size);
    }

    public final void setFileNumberLimit(int i) {
        this.EZpvd = i;
        EZpvd();
    }

    public final void setFileTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = true;
        this.values.djBIcL.setText(str);
        EZpvd();
    }

    public final int copydefault() {
        return this.EZpvd - this.KWHzl.size();
    }

    public final void setSupportedFileTypes(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            this.AkhnZx = list;
        }
    }

    public static final Unit valueOf(UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class UploadFileViewModel implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UploadFileViewModel> CREATOR = new Creator();
        private String decryptFilePath;
        private final String fileName;
        private final SingleFileUploadUseCase.FileType fileType;
        private long imageId;
        private final long localUploadId;
        private Status status;
        private Uri uri;
        private String url;

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<UploadFileViewModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadFileViewModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UploadFileViewModel(parcel.readLong(), parcel.readLong(), parcel.readString(), SingleFileUploadUseCase.FileType.valueOf(parcel.readString()), parcel.readString(), (Uri) parcel.readParcelable(UploadFileViewModel.class.getClassLoader()), Status.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadFileViewModel[] newArray(int i) {
                return new UploadFileViewModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.localUploadId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SingleFileUploadUseCase.FileType component4() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Uri component6() {
            return this.uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status component7() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.decryptFilePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadFileViewModel copy(long j, long j2, @NotNull String str, @NotNull SingleFileUploadUseCase.FileType fileType, @NotNull String str2, @NotNull Uri uri, @NotNull Status status, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fileType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(status, "");
            return new UploadFileViewModel(j, j2, str, fileType, str2, uri, status, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadFileViewModel)) {
                return false;
            }
            UploadFileViewModel uploadFileViewModel = (UploadFileViewModel) obj;
            return this.localUploadId == uploadFileViewModel.localUploadId && this.imageId == uploadFileViewModel.imageId && Intrinsics.EZpvd((Object) this.fileName, (Object) uploadFileViewModel.fileName) && this.fileType == uploadFileViewModel.fileType && Intrinsics.EZpvd((Object) this.url, (Object) uploadFileViewModel.url) && Intrinsics.EZpvd(this.uri, uploadFileViewModel.uri) && this.status == uploadFileViewModel.status && Intrinsics.EZpvd((Object) this.decryptFilePath, (Object) uploadFileViewModel.decryptFilePath);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDecryptFilePath() {
            return this.decryptFilePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SingleFileUploadUseCase.FileType getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getLocalUploadId() {
            return this.localUploadId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.localUploadId);
            int iHashCode2 = Long.hashCode(this.imageId);
            int iHashCode3 = this.fileName.hashCode();
            int iHashCode4 = this.fileType.hashCode();
            int iHashCode5 = this.url.hashCode();
            int iHashCode6 = this.uri.hashCode();
            int iHashCode7 = this.status.hashCode();
            String str = this.decryptFilePath;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDecryptFilePath(String str) {
            this.decryptFilePath = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setImageId(long j) {
            this.imageId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStatus(@NotNull Status status) {
            Intrinsics.checkNotNullParameter(status, "");
            this.status = status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUri(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            this.uri = uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadFileViewModel(localUploadId=" + this.localUploadId + ", imageId=" + this.imageId + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ", url=" + this.url + ", uri=" + this.uri + ", status=" + this.status + ", decryptFilePath=" + this.decryptFilePath + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.localUploadId);
            parcel.writeLong(this.imageId);
            parcel.writeString(this.fileName);
            parcel.writeString(this.fileType.name());
            parcel.writeString(this.url);
            parcel.writeParcelable(this.uri, i);
            parcel.writeString(this.status.name());
            parcel.writeString(this.decryptFilePath);
        }

        public UploadFileViewModel(long j, long j2, @NotNull String str, @NotNull SingleFileUploadUseCase.FileType fileType, @NotNull String str2, @NotNull Uri uri, @NotNull Status status, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fileType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(status, "");
            this.localUploadId = j;
            this.imageId = j2;
            this.fileName = str;
            this.fileType = fileType;
            this.url = str2;
            this.uri = uri;
            this.status = status;
            this.decryptFilePath = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (r17v0 long)
  (r19v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:382) com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType) : (r20v0 com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 android.net.Uri)
  (wrap:com.okinc.ok_kyc_widget.UploadNew$Status:?: TERNARY null = ((wrap:int:0x001f: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] (LINE:385) com.okinc.ok_kyc_widget.UploadNew.Status.UPLOADING com.okinc.ok_kyc_widget.UploadNew$Status) : (r23v0 com.okinc.ok_kyc_widget.UploadNew$Status))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
 A[MD:(long, long, java.lang.String, com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType, java.lang.String, android.net.Uri, com.okinc.ok_kyc_widget.UploadNew$Status, java.lang.String):void (m)] (LINE:378) call: com.okinc.ok_kyc_widget.UploadNew.UploadFileViewModel.<init>(long, long, java.lang.String, com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType, java.lang.String, android.net.Uri, com.okinc.ok_kyc_widget.UploadNew$Status, java.lang.String):void type: THIS */
        public /* synthetic */ UploadFileViewModel(long j, long j2, String str, SingleFileUploadUseCase.FileType fileType, String str2, Uri uri, Status status, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, j2, str, (i & 8) != 0 ? SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED : fileType, (i & 16) != 0 ? "" : str2, uri, (i & 64) != 0 ? Status.UPLOADING : status, (i & 128) != 0 ? null : str3);
        }

        public final SerializableUploadFileViewModel convert() {
            long j = this.localUploadId;
            long j2 = this.imageId;
            String str = this.fileName;
            SingleFileUploadUseCase.FileType fileType = this.fileType;
            String str2 = this.url;
            String string = this.uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new SerializableUploadFileViewModel(j, j2, str, fileType, str2, string, this.status);
        }
    }

    @Serializable
    public static final class SerializableUploadFileViewModel implements Parcelable {
        private final String fileName;
        private final SingleFileUploadUseCase.FileType fileType;
        private long imageId;
        private final long localUploadId;
        private Status status;
        private String uri;
        private String url;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SerializableUploadFileViewModel> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.FileType", SingleFileUploadUseCase.FileType.values()), null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_widget.UploadNew.Status", Status.values())};

        public static final class Creator implements Parcelable.Creator<SerializableUploadFileViewModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SerializableUploadFileViewModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SerializableUploadFileViewModel(parcel.readLong(), parcel.readLong(), parcel.readString(), SingleFileUploadUseCase.FileType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Status.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SerializableUploadFileViewModel[] newArray(int i) {
                return new SerializableUploadFileViewModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.localUploadId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SingleFileUploadUseCase.FileType component4() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status component7() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SerializableUploadFileViewModel copy(long j, long j2, @NotNull String str, @NotNull SingleFileUploadUseCase.FileType fileType, @NotNull String str2, @NotNull String str3, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fileType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(status, "");
            return new SerializableUploadFileViewModel(j, j2, str, fileType, str2, str3, status);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableUploadFileViewModel)) {
                return false;
            }
            SerializableUploadFileViewModel serializableUploadFileViewModel = (SerializableUploadFileViewModel) obj;
            return this.localUploadId == serializableUploadFileViewModel.localUploadId && this.imageId == serializableUploadFileViewModel.imageId && Intrinsics.EZpvd((Object) this.fileName, (Object) serializableUploadFileViewModel.fileName) && this.fileType == serializableUploadFileViewModel.fileType && Intrinsics.EZpvd((Object) this.url, (Object) serializableUploadFileViewModel.url) && Intrinsics.EZpvd((Object) this.uri, (Object) serializableUploadFileViewModel.uri) && this.status == serializableUploadFileViewModel.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SingleFileUploadUseCase.FileType getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getLocalUploadId() {
            return this.localUploadId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUri() {
            return this.uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((Long.hashCode(this.localUploadId) * 31) + Long.hashCode(this.imageId)) * 31) + this.fileName.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.url.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.status.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setImageId(long j) {
            this.imageId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStatus(@NotNull Status status) {
            Intrinsics.checkNotNullParameter(status, "");
            this.status = status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUri(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uri = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SerializableUploadFileViewModel(localUploadId=" + this.localUploadId + ", imageId=" + this.imageId + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ", url=" + this.url + ", uri=" + this.uri + ", status=" + this.status + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.localUploadId);
            parcel.writeLong(this.imageId);
            parcel.writeString(this.fileName);
            parcel.writeString(this.fileType.name());
            parcel.writeString(this.url);
            parcel.writeString(this.uri);
            parcel.writeString(this.status.name());
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_widget.UploadNew.SerializableUploadFileViewModel.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SerializableUploadFileViewModel> serializer() {
                return UploadNew$SerializableUploadFileViewModel$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SerializableUploadFileViewModel(int i, long j, long j2, String str, SingleFileUploadUseCase.FileType fileType, String str2, String str3, Status status, SerializationConstructorMarker serializationConstructorMarker) {
            if (38 != (i & 38)) {
                PluginExceptionsKt.throwMissingFieldException(i, 38, UploadNew$SerializableUploadFileViewModel$$serializer.INSTANCE.getDescriptor());
            }
            this.localUploadId = (i & 1) == 0 ? 0L : j;
            this.imageId = j2;
            this.fileName = str;
            if ((i & 8) == 0) {
                this.fileType = SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED;
            } else {
                this.fileType = fileType;
            }
            if ((i & 16) == 0) {
                this.url = "";
            } else {
                this.url = str2;
            }
            this.uri = str3;
            if ((i & 64) == 0) {
                this.status = Status.UPLOADING;
            } else {
                this.status = status;
            }
        }

        public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SerializableUploadFileViewModel serializableUploadFileViewModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || serializableUploadFileViewModel.localUploadId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 0, serializableUploadFileViewModel.localUploadId);
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 1, serializableUploadFileViewModel.imageId);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, serializableUploadFileViewModel.fileName);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || serializableUploadFileViewModel.fileType != SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], serializableUploadFileViewModel.fileType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) serializableUploadFileViewModel.url, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, serializableUploadFileViewModel.url);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 5, serializableUploadFileViewModel.uri);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && serializableUploadFileViewModel.status == Status.UPLOADING) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], serializableUploadFileViewModel.status);
        }

        public SerializableUploadFileViewModel(long j, long j2, @NotNull String str, @NotNull SingleFileUploadUseCase.FileType fileType, @NotNull String str2, @NotNull String str3, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fileType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(status, "");
            this.localUploadId = j;
            this.imageId = j2;
            this.fileName = str;
            this.fileType = fileType;
            this.url = str2;
            this.uri = str3;
            this.status = status;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (r15v0 long)
  (r17v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType:?: TERNARY null = ((wrap:int:0x0009: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:408) com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType) : (r18v0 com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_widget.UploadNew$Status:?: TERNARY null = ((wrap:int:0x001d: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] (LINE:411) com.okinc.ok_kyc_widget.UploadNew.Status.UPLOADING com.okinc.ok_kyc_widget.UploadNew$Status) : (r21v0 com.okinc.ok_kyc_widget.UploadNew$Status))
 A[MD:(long, long, java.lang.String, com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType, java.lang.String, java.lang.String, com.okinc.ok_kyc_widget.UploadNew$Status):void (m)] (LINE:404) call: com.okinc.ok_kyc_widget.UploadNew.SerializableUploadFileViewModel.<init>(long, long, java.lang.String, com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase$FileType, java.lang.String, java.lang.String, com.okinc.ok_kyc_widget.UploadNew$Status):void type: THIS */
        public /* synthetic */ SerializableUploadFileViewModel(long j, long j2, String str, SingleFileUploadUseCase.FileType fileType, String str2, String str3, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, j2, str, (i & 8) != 0 ? SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED : fileType, (i & 16) != 0 ? "" : str2, str3, (i & 64) != 0 ? Status.UPLOADING : status);
        }

        public final UploadFileViewModel convert() {
            long j = this.localUploadId;
            long j2 = this.imageId;
            String str = this.fileName;
            SingleFileUploadUseCase.FileType fileType = this.fileType;
            String str2 = this.url;
            Uri uri = Uri.parse(this.uri);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            return new UploadFileViewModel(j, j2, str, fileType, str2, uri, this.status, null, 128, null);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends RecyclerView.ItemDecoration {
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;

        public Activity(int i, int i2, int i3) {
            this.KWHzl = i;
            this.EZpvd = i2;
            this.OLrzqt = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.KWHzl;
            int i2 = childAdapterPosition % i;
            int i3 = childAdapterPosition / i;
            if (i2 == 0) {
                rect.right = (this.EZpvd / 3) * 2;
            } else if (i2 == 1) {
                int i4 = this.EZpvd / 3;
                rect.left = i4;
                rect.right = i4;
            } else if (i2 == 2) {
                rect.left = (this.EZpvd / 3) * 2;
            }
            if (i3 > 0) {
                rect.top = this.OLrzqt;
            }
        }
    }

    public final void KWHzl() {
        int i = 0;
        for (Object obj : this.KWHzl) {
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && this.fetchVPNInfo.contains(uploadFileViewModel.getStatus())) {
                i++;
            }
        }
        TextView textView = this.values.gEmmrt;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(pTD.EZpvd(context, C43662rtX.Fragment.copydefault, i, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, Integer.valueOf(i)))));
    }

    public final void OLrzqt(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setStatus(Status.UPLOAD);
                uploadFileViewModel.setImageId(j2);
                uploadFileViewModel.setUrl(str);
                i2 = i;
            }
            i++;
        }
        KWHzl();
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void copydefault(long j) {
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setStatus(Status.UPLOAD_FAILED);
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void KWHzl(long j) {
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setStatus(Status.UPLOADING);
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void copydefault(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setStatus(Status.URL_LOAD_SUCCESS);
                uploadFileViewModel.setUrl(str);
                if (uploadFileViewModel.getFileType() == SingleFileUploadUseCase.FileType.IMAGE) {
                    try {
                        uploadFileViewModel.setUri(Uri.parse(str));
                    } catch (Exception e) {
                        pUU.KWHzl("File_UPLOAD", "imagePath=" + str + ", uri error=" + e);
                    }
                }
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void OLrzqt(long j) {
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setStatus(Status.URL_LOAD_FAILED);
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void AEQbTJ(long j, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        int i = 0;
        int i2 = -1;
        for (Object obj : this.KWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getLocalUploadId() == j) {
                uploadFileViewModel.setUri(uri);
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            this.valueOf.notifyItemChanged(i2);
        }
    }

    public final void EZpvd(long j) {
        int i = -1;
        int i2 = 0;
        UploadFileViewModel uploadFileViewModel = null;
        for (Object obj : this.KWHzl) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            UploadFileViewModel uploadFileViewModel2 = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel2 != null && uploadFileViewModel2.getLocalUploadId() == j) {
                i = i2;
                uploadFileViewModel = uploadFileViewModel2;
            }
            i2++;
        }
        if (uploadFileViewModel != null) {
            this.KWHzl.remove(uploadFileViewModel);
            EZpvd();
            KWHzl();
            if (this.KWHzl.size() <= 0) {
                this.valueOf.notifyDataSetChanged();
            } else {
                this.valueOf.notifyItemRemoved(i);
            }
        }
    }

    public final void setGetUrlCallback(@NotNull Function1<? super UploadFileViewModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        for (Object obj : this.KWHzl) {
            UploadFileViewModel uploadFileViewModel = obj instanceof UploadFileViewModel ? (UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null && uploadFileViewModel.getStatus() == Status.URL_LOADING) {
                this.OLrzqt.invoke(obj);
            }
        }
    }
}
