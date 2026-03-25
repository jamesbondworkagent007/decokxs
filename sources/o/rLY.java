package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.ImageTypeDetector;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.views.FilePickerType;
import com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1;
import com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$upload$1;
import com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$uploadPdf$1;
import com.okinc.ok_kyc_widget.Upload;
import com.okinc.ok_kyc_widget.UploadNew;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rLY extends android.widget.FrameLayout {
    public int AEQbTJ;
    public ViewStatus EZpvd;
    public boolean KWHzl;
    public final AbstractC43852rxB OLrzqt;
    public Job copydefault;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC43852rxB KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUploadJob(Job job) {
        this.copydefault = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rLY(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hUfVAv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43852rxB) viewDataBindingInflate;
        this.AEQbTJ = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rLY(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hUfVAv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43852rxB) viewDataBindingInflate;
        this.AEQbTJ = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rLY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hUfVAv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43852rxB) viewDataBindingInflate;
        this.AEQbTJ = 5;
    }

    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        rGL rgl;
        java.util.List<rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>> listQfsBiF;
        UIComponentAppModel uIComponentAppModel2 = uIComponentAppModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel2, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
        if (!(abstractC42074rFj instanceof rGL) || (listQfsBiF = (rgl = (rGL) abstractC42074rFj).QfsBiF()) == null) {
            return;
        }
        java.util.Iterator<T> it = listQfsBiF.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            final FileUploaderAppModel fileUploaderAppModel = uIComponentAppModel2 instanceof FileUploaderAppModel ? (FileUploaderAppModel) uIComponentAppModel2 : null;
            if (fileUploaderAppModel != null && Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) fileUploaderAppModel.getId())) {
                rax.setValue(new java.util.ArrayList());
                FileUploaderAppModel fileUploaderAppModel2 = (FileUploaderAppModel) uIComponentAppModel2;
                java.lang.Boolean boolIsHidden = fileUploaderAppModel2.isHidden();
                if (boolIsHidden == null) {
                    boolIsHidden = java.lang.Boolean.FALSE;
                }
                fileUploaderAppModel.setHidden(boolIsHidden);
                if (Intrinsics.EZpvd(fileUploaderAppModel2.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    rax.setValue(new java.util.ArrayList());
                } else {
                    setVisibility(0);
                    java.lang.Boolean required = fileUploaderAppModel2.getRequired();
                    rax.EZpvd(required != null ? required.booleanValue() : false);
                    rax.setValue(new java.util.ArrayList());
                }
                rgl.gasjUx().observe(lifecycleOwner2, new Application(new Function1() { // from class: o.rMb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLY.OLrzqt(uIComponentAppModel, this, rax, abstractC42074rFj, fileUploaderAppModel, (C42156rIk) obj);
                    }
                }));
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rMc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLY.OLrzqt(fileUploaderAppModel, rax, (java.util.List) obj);
                    }
                }, new Function1() { // from class: o.rMg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLY.AEQbTJ((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rMh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLY.EZpvd((java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rMi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rLY.OLrzqt();
                    }
                });
                this.AEQbTJ = fileUploaderAppModel.getImageType();
                java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> files = fileUploaderAppModel.getFiles();
                if (files != null && (!files.isEmpty())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.okinc.ok_kyc_core.data.remote.networkmodel.File file : files) {
                        arrayList.add(new Upload.TaskDescription(null, file.getImageId(), file.getName(), 1, null));
                        arrayList2.add(new com.okinc.ok_kyc_core.data.remote.networkmodel.File(file.getImageId(), file.getImageType(), file.getName(), (UploadNew.SerializableUploadFileViewModel) null, 8, (DefaultConstructorMarker) null));
                    }
                    rgl.flVtFt().clear();
                    rgl.flVtFt().addAll(arrayList2);
                    rax.setValue(rgl.flVtFt());
                    this.OLrzqt.OLrzqt.EZpvd(arrayList);
                }
                this.OLrzqt.OLrzqt.copydefault(fileUploaderAppModel.getFileSize());
                java.lang.Long limit = fileUploaderAppModel.getLimit();
                if (limit != null) {
                    this.OLrzqt.OLrzqt.setFileNumberLimit((int) limit.longValue());
                }
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                java.util.List<java.lang.String> extensions = fileUploaderAppModel.getExtensions();
                this.OLrzqt.OLrzqt.setSupportedFileTypes(extensions);
                java.util.Iterator<T> it2 = extensions.iterator();
                while (it2.hasNext()) {
                    java.lang.String lowerCase = ((java.lang.String) it2.next()).toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "pdf")) {
                        booleanRef.element = true;
                    }
                }
                this.OLrzqt.OLrzqt.setUpload(new View.OnClickListener() { // from class: o.rMe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        rLY.copydefault(booleanRef, fileUploaderAppModel, abstractC42074rFj, this, fragmentManager, lifecycleOwner, rax, uIComponentAppModel, view);
                    }
                });
                this.OLrzqt.OLrzqt.setOnFileDeleteIconClickedListener(new StateListAnimator(abstractC42074rFj, rax));
            }
            uIComponentAppModel2 = uIComponentAppModel;
            lifecycleOwner2 = lifecycleOwner;
        }
    }

    public static final Unit OLrzqt(UIComponentAppModel uIComponentAppModel, rLY rly, rAX rax, AbstractC42074rFj abstractC42074rFj, FileUploaderAppModel fileUploaderAppModel, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            FileUploaderAppModel fileUploaderAppModel2 = (FileUploaderAppModel) uIComponentAppModel;
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), fileUploaderAppModel2 != null ? fileUploaderAppModel2.getId() : null) && rly.getVisibility() == 8) {
                rly.setVisibility(0);
                Job job = rly.copydefault;
                if (job != null) {
                    JobKt__JobKt.cancelChildren$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                rax.EZpvd((fileUploaderAppModel2 == null || (required = fileUploaderAppModel2.getRequired()) == null) ? false : required.booleanValue());
                rGL rgl = (rGL) abstractC42074rFj;
                rgl.flVtFt().clear();
                rax.setValue(rgl.flVtFt());
                rly.OLrzqt.OLrzqt.copydefault(new java.util.ArrayList());
                rly.OLrzqt.OLrzqt.setUpload();
                if (fileUploaderAppModel2 != null) {
                    fileUploaderAppModel2.setHidden(java.lang.Boolean.FALSE);
                }
                fileUploaderAppModel.setHidden(java.lang.Boolean.FALSE);
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            FileUploaderAppModel fileUploaderAppModel3 = (FileUploaderAppModel) uIComponentAppModel;
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), fileUploaderAppModel3 != null ? fileUploaderAppModel3.getId() : null) && rly.getVisibility() == 0) {
                rly.setVisibility(8);
                rax.EZpvd(false);
                Job job2 = rly.copydefault;
                if (job2 != null) {
                    JobKt__JobKt.cancelChildren$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                }
                rGL rgl2 = (rGL) abstractC42074rFj;
                rgl2.flVtFt().clear();
                rax.setValue(rgl2.flVtFt());
                rly.OLrzqt.OLrzqt.copydefault(new java.util.ArrayList());
                rly.OLrzqt.OLrzqt.setUpload();
                if (fileUploaderAppModel3 != null) {
                    fileUploaderAppModel3.setHidden(java.lang.Boolean.TRUE);
                }
                fileUploaderAppModel.setHidden(java.lang.Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FileUploaderAppModel fileUploaderAppModel, rAX rax, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        fileUploaderAppModel.setFiles((java.util.List) rax.getValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.BooleanRef booleanRef, final FileUploaderAppModel fileUploaderAppModel, final AbstractC42074rFj abstractC42074rFj, final rLY rly, androidx.fragment.app.FragmentManager fragmentManager, final LifecycleOwner lifecycleOwner, final rAX rax, final UIComponentAppModel uIComponentAppModel, android.view.View view) {
        C32866mlf.onEvent$default("KYC_Upload_File_Click", (TrackChannel[]) null, new Function1() { // from class: o.rLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLY.copydefault(fileUploaderAppModel, abstractC42074rFj, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        final Function1<? super android.net.Uri, Unit> function1 = new Function1() { // from class: o.rMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rLY.EZpvd(lifecycleOwner, rly, abstractC42074rFj, rax, uIComponentAppModel, (android.net.Uri) obj);
            }
        };
        if (booleanRef.element && fileUploaderAppModel.getExtensions().size() == 1) {
            InterfaceC55124xdy interfaceC55124xdyDvKsVJ = ((rGL) abstractC42074rFj).dvKsVJ();
            android.content.Context context = rly.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            interfaceC55124xdyDvKsVJ.EZpvd(context, new java.lang.String[]{"application/pdf"}, function1);
            return;
        }
        rLK.OLrzqt.OLrzqt(fragmentManager, booleanRef.element, new Function2() { // from class: o.rMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return rLY.EZpvd(function1, rly, abstractC42074rFj, rax, uIComponentAppModel, (FilePickerType) obj, (android.net.Uri) obj2);
            }
        });
    }

    public static final Unit copydefault(FileUploaderAppModel fileUploaderAppModel, AbstractC42074rFj abstractC42074rFj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "view_id", fileUploaderAppModel.getId(), false, 4, null);
        java.lang.String id = ((rGL) abstractC42074rFj).finit().getId();
        EventParamsList.put$default(eventParamsList, "screen", id == null ? "" : id, false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(LifecycleOwner lifecycleOwner, rLY rly, AbstractC42074rFj abstractC42074rFj, rAX rax, UIComponentAppModel uIComponentAppModel, android.net.Uri uri) {
        if (uri != null) {
            java.lang.String str = java.lang.System.currentTimeMillis() + ".pdf";
            if (C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_pdf_decrypt_android", null, 2, null), "treatment", false, 2, null)) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1(rly, abstractC42074rFj, str, "application/pdf", uri, rax, uIComponentAppModel, lifecycleOwner, null), 3, null);
            } else {
                FileUploaderAppModel fileUploaderAppModel = (FileUploaderAppModel) uIComponentAppModel;
                upload$default(rly, (rGL) abstractC42074rFj, str, "application/pdf", uri, rax, fileUploaderAppModel.getFileSize(), SingleFileUploadUseCase.FileType.PDF, fileUploaderAppModel.getShouldCallOcr(), null, 256, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, rLY rly, AbstractC42074rFj abstractC42074rFj, rAX rax, UIComponentAppModel uIComponentAppModel, FilePickerType filePickerType, android.net.Uri uri) {
        if (uri != null) {
            if (filePickerType == FilePickerType.FILE) {
                function1.invoke(uri);
            } else {
                FileUploaderAppModel fileUploaderAppModel = (FileUploaderAppModel) uIComponentAppModel;
                upload$default(rly, (rGL) abstractC42074rFj, java.lang.System.currentTimeMillis() + JwtUtilsKt.JWT_DELIMITER + new ImageTypeDetector().KWHzl(uri).getTypeName(), "image/" + new ImageTypeDetector().KWHzl(uri).getTypeName(), uri, rax, fileUploaderAppModel.getFileSize(), SingleFileUploadUseCase.FileType.IMAGE, fileUploaderAppModel.getShouldCallOcr(), null, 256, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements Upload.Application {
        public final /* synthetic */ rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> AEQbTJ;
        public final /* synthetic */ AbstractC42074rFj copydefault;

        public StateListAnimator(AbstractC42074rFj abstractC42074rFj, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax) {
            this.copydefault = abstractC42074rFj;
            this.AEQbTJ = rax;
        }

        @Override // com.okinc.ok_kyc_widget.Upload.Application
        public void copydefault(Upload.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            long jCopydefault = taskDescription.copydefault();
            rLY rly = rLY.this;
            AbstractC42074rFj abstractC42074rFj = this.copydefault;
            rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax = this.AEQbTJ;
            rly.KWHzl().OLrzqt.KWHzl(jCopydefault);
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<com.okinc.ok_kyc_core.data.remote.networkmodel.File> it = rgl.flVtFt().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.okinc.ok_kyc_core.data.remote.networkmodel.File next = it.next();
                if (next.getImageId() == jCopydefault) {
                    rgl.flVtFt().remove(next);
                    break;
                }
            }
            rax.setValue(rgl.flVtFt());
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final byte[] EZpvd(android.content.Context context, android.net.Uri uri) {
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                byte[] bArrKWHzl = yFB.KWHzl(inputStreamOpenInputStream);
                yFA.copydefault(inputStreamOpenInputStream, null);
                return bArrKWHzl;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    yFA.copydefault(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void upload$default(rLY rly, rGL rgl, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.io.File file, int i2, java.lang.Object obj) {
        rly.copydefault(rgl, str, str2, uri, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, i, fileType, z, (i2 & 256) != 0 ? null : file);
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public final void copydefault(rGL rgl, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.io.File file) {
        C33478mxH c33478mxH = C33478mxH.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.io.File fileEZpvd = c33478mxH.EZpvd(context);
        ?? EZpvd = file == null ? C43699ruH.KWHzl.EZpvd(uri, fileEZpvd, str) : file;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = EZpvd;
        if (EZpvd.length() < 1048576 * i) {
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null))), Dispatchers.getMain(), null, new FileUploaderItemView$upload$1(this, fileEZpvd, uri, rgl, objectRef, str2, fileType, z, rax, EZpvd, null), 2, null);
        } else {
            this.OLrzqt.OLrzqt.setFailedOverSize(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(rGL rgl, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FileUploaderItemView$uploadPdf$1 fileUploaderItemView$uploadPdf$1;
        java.lang.String str3;
        rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax2;
        rLY rly;
        java.lang.Boolean bool;
        final SingleFileUploadUseCase.FileType fileType2;
        LifecycleOwner lifecycleOwner2;
        final boolean z2;
        android.net.Uri uri2;
        rGL rgl2;
        final java.lang.String str4;
        final int i2;
        rGL rgl3;
        java.lang.String str5;
        SingleFileUploadUseCase.FileType fileType3;
        int i3;
        boolean z3;
        rLY rly2;
        android.net.Uri uri3 = uri;
        if (continuation instanceof FileUploaderItemView$uploadPdf$1) {
            fileUploaderItemView$uploadPdf$1 = (FileUploaderItemView$uploadPdf$1) continuation;
            int i4 = fileUploaderItemView$uploadPdf$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fileUploaderItemView$uploadPdf$1.label = i4 - Integer.MIN_VALUE;
            } else {
                fileUploaderItemView$uploadPdf$1 = new FileUploaderItemView$uploadPdf$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fileUploaderItemView$uploadPdf$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = fileUploaderItemView$uploadPdf$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if (rtu == null) {
                str3 = str;
                rax2 = rax;
                rly = this;
                bool = null;
                fileType2 = fileType;
                lifecycleOwner2 = lifecycleOwner;
                z2 = z;
                uri2 = uri3;
                rgl2 = rgl;
                str4 = str2;
                i2 = i;
                final rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax3 = rax2;
                final java.lang.String str6 = str3;
                if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
                    C43693ruB.OLrzqt("KYC_Select_Encrypt_Pdf");
                    C33478mxH c33478mxH = C33478mxH.KWHzl;
                    android.content.Context context = rly.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.io.File fileEZpvd = c33478mxH.EZpvd(context);
                    if (fileEZpvd == null) {
                        rQZ rqz = rQZ.KWHzl;
                        android.content.Context context2 = rly.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        rqz.EZpvd(context2);
                        return Unit.INSTANCE;
                    }
                    final java.lang.String str7 = fileEZpvd.getPath() + java.io.File.separator + str6;
                    pUU.copydefault("FileUpload", "outputPath=" + str7);
                    rQZ rqz2 = rQZ.KWHzl;
                    android.content.Context context3 = rly.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    final rLY rly3 = rly;
                    final rGL rgl4 = rgl2;
                    final android.net.Uri uri4 = uri2;
                    rQZ.showPdfDialog$default(rqz2, context3, uri2, str7, lifecycleOwner2, null, new Function0() { // from class: o.rLZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rLY.EZpvd(this.EZpvd, rgl4, str6, str4, uri4, rax3, i2, fileType2, z2, str7);
                        }
                    }, 16, null);
                } else {
                    if (bool == null) {
                        C43693ruB.OLrzqt("KYC_Pdf_Fd_Error");
                    }
                    upload$default(rly, rgl2, str6, str4, uri2, rax3, i2, fileType2, z2, null, 256, null);
                }
                return Unit.INSTANCE;
            }
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            fileUploaderItemView$uploadPdf$1.L$0 = this;
            rgl3 = rgl;
            fileUploaderItemView$uploadPdf$1.L$1 = rgl3;
            str3 = str;
            fileUploaderItemView$uploadPdf$1.L$2 = str3;
            str5 = str2;
            fileUploaderItemView$uploadPdf$1.L$3 = str5;
            fileUploaderItemView$uploadPdf$1.L$4 = uri3;
            rax2 = rax;
            fileUploaderItemView$uploadPdf$1.L$5 = rax2;
            fileType3 = fileType;
            fileUploaderItemView$uploadPdf$1.L$6 = fileType3;
            fileUploaderItemView$uploadPdf$1.L$7 = lifecycleOwner;
            i3 = i;
            fileUploaderItemView$uploadPdf$1.I$0 = i3;
            z3 = z;
            fileUploaderItemView$uploadPdf$1.Z$0 = z3;
            fileUploaderItemView$uploadPdf$1.label = 1;
            objKWHzl = rtu.KWHzl(context4, uri3, fileUploaderItemView$uploadPdf$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            rly2 = this;
            lifecycleOwner2 = lifecycleOwner;
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = fileUploaderItemView$uploadPdf$1.Z$0;
            int i6 = fileUploaderItemView$uploadPdf$1.I$0;
            lifecycleOwner2 = (LifecycleOwner) fileUploaderItemView$uploadPdf$1.L$7;
            SingleFileUploadUseCase.FileType fileType4 = (SingleFileUploadUseCase.FileType) fileUploaderItemView$uploadPdf$1.L$6;
            rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax4 = (rAX) fileUploaderItemView$uploadPdf$1.L$5;
            android.net.Uri uri5 = (android.net.Uri) fileUploaderItemView$uploadPdf$1.L$4;
            java.lang.String str8 = (java.lang.String) fileUploaderItemView$uploadPdf$1.L$3;
            java.lang.String str9 = (java.lang.String) fileUploaderItemView$uploadPdf$1.L$2;
            rGL rgl5 = (rGL) fileUploaderItemView$uploadPdf$1.L$1;
            rly2 = (rLY) fileUploaderItemView$uploadPdf$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            z3 = z4;
            i3 = i6;
            uri3 = uri5;
            str5 = str8;
            rax2 = rax4;
            str3 = str9;
            fileType3 = fileType4;
            rgl3 = rgl5;
        }
        rly = rly2;
        fileType2 = fileType3;
        z2 = z3;
        bool = (java.lang.Boolean) objKWHzl;
        str4 = str5;
        i2 = i3;
        uri2 = uri3;
        rgl2 = rgl3;
        final rAX rax32 = rax2;
        final java.lang.String str62 = str3;
        if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(rLY rly, rGL rgl, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.lang.String str3) {
        rly.copydefault(rgl, str, str2, uri, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, i, fileType, z, new java.io.File(str3));
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
    }
}
