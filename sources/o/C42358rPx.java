package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean;
import com.okinc.ok_kyc_core.common.ImageTypeDetector;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.views.FilePickerType;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$downLoadAndPreviewPdf$1;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$getOssImageUrl$1;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$upload$2;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$uploadPdf$1;
import com.okinc.ok_kyc_widget.UploadNew;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.rPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42358rPx extends android.widget.FrameLayout {
    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ;
    public final java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> AhwBna;
    public boolean EZpvd;
    public int KWHzl;
    public final java.util.HashSet<java.lang.String> OLrzqt;
    public final AbstractC43851rxA copydefault;
    public final CoroutineScope djBIcL;
    public ViewStatus valueOf;

    /* JADX INFO: renamed from: o.rPx$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC43851rxA OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.valueOf = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42358rPx(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.gkJEwt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43851rxA) viewDataBindingInflate;
        this.KWHzl = 5;
        this.AhwBna = new java.util.ArrayList();
        this.OLrzqt = yEE.djBIcL("jpg", "jpeg", "png");
        this.AEQbTJ = C56424yEw.AYXKKw(C56390yDp.OLrzqt("pdf", "application/pdf"));
        this.djBIcL = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42358rPx(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.valueOf = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.gkJEwt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43851rxA) viewDataBindingInflate;
        this.KWHzl = 5;
        this.AhwBna = new java.util.ArrayList();
        this.OLrzqt = yEE.djBIcL("jpg", "jpeg", "png");
        this.AEQbTJ = C56424yEw.AYXKKw(C56390yDp.OLrzqt("pdf", "application/pdf"));
        this.djBIcL = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42358rPx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.gkJEwt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43851rxA) viewDataBindingInflate;
        this.KWHzl = 5;
        this.AhwBna = new java.util.ArrayList();
        this.OLrzqt = yEE.djBIcL("jpg", "jpeg", "png");
        this.AEQbTJ = C56424yEw.AYXKKw(C56390yDp.OLrzqt("pdf", "application/pdf"));
        this.djBIcL = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
    }

    public final void OLrzqt(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        java.lang.String str;
        NewFileUploaderAppModel newFileUploaderAppModel;
        java.util.ArrayList<POACameraGalleryOutputBean> second;
        final UIComponentAppModel uIComponentAppModel2 = uIComponentAppModel;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel2, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.QfsBiF().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                final NewFileUploaderAppModel newFileUploaderAppModel2 = uIComponentAppModel2 instanceof NewFileUploaderAppModel ? (NewFileUploaderAppModel) uIComponentAppModel2 : null;
                if (newFileUploaderAppModel2 == null || !Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) newFileUploaderAppModel2.getId())) {
                    str = str2;
                } else {
                    rax.setValue(new java.util.ArrayList());
                    NewFileUploaderAppModel newFileUploaderAppModel3 = (NewFileUploaderAppModel) uIComponentAppModel2;
                    java.lang.Boolean boolIsHidden = newFileUploaderAppModel3.isHidden();
                    if (boolIsHidden == null) {
                        boolIsHidden = java.lang.Boolean.FALSE;
                    }
                    newFileUploaderAppModel2.setHidden(boolIsHidden);
                    if (Intrinsics.EZpvd(newFileUploaderAppModel3.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(new java.util.ArrayList());
                    } else {
                        setVisibility(0);
                        java.lang.Boolean required = newFileUploaderAppModel3.getRequired();
                        rax.EZpvd(required != null ? required.booleanValue() : false);
                        rax.setValue(new java.util.ArrayList());
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rPG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.KWHzl(uIComponentAppModel2, this, rax, newFileUploaderAppModel2, (C42156rIk) obj);
                        }
                    }));
                    kotlin.Pair<java.lang.Integer, java.util.ArrayList<POACameraGalleryOutputBean>> pairRcXXUw = rgl.RcXXUw();
                    pUU.KWHzl("File_Upload", "init size=" + ((pairRcXXUw == null || (second = pairRcXXUw.getSecond()) == null) ? null : java.lang.Integer.valueOf(second.size())));
                    final NewFileUploaderAppModel newFileUploaderAppModel4 = newFileUploaderAppModel2;
                    rgl.fFgQHt().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rPE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.OLrzqt(abstractC42074rFj, this, newFileUploaderAppModel4, lifecycleOwner, uIComponentAppModel, rax, (java.lang.Long) obj);
                        }
                    }));
                    C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rPI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.EZpvd(newFileUploaderAppModel2, rax, (java.util.List) obj);
                        }
                    }, new Function1() { // from class: o.rPL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.OLrzqt((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rPH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.AEQbTJ((java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rPJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42358rPx.AEQbTJ();
                        }
                    });
                    this.KWHzl = newFileUploaderAppModel2.getImageType();
                    java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> files = newFileUploaderAppModel2.getFiles();
                    if (files != null && (!files.isEmpty())) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (com.okinc.ok_kyc_core.data.remote.networkmodel.File file : files) {
                            UploadNew.SerializableUploadFileViewModel localUploadNewModel = file.getLocalUploadNewModel();
                            if (localUploadNewModel == null) {
                                SingleFileUploadUseCase.FileType fileType = SingleFileUploadUseCase.FileType.FILE_NOT_SUPPORTED;
                                if (C59449zhJ.endsWith$default(file.getName(), ".pdf", false, 2, null)) {
                                    fileType = SingleFileUploadUseCase.FileType.PDF;
                                }
                                SingleFileUploadUseCase.FileType fileType2 = fileType;
                                for (java.lang.String str3 : this.OLrzqt) {
                                    if (C59449zhJ.endsWith$default(file.getName(), JwtUtilsKt.JWT_DELIMITER + str3, false, 2, null)) {
                                        fileType2 = SingleFileUploadUseCase.FileType.IMAGE;
                                    }
                                }
                                long jNanoTime = java.lang.System.nanoTime();
                                long imageId = file.getImageId();
                                java.lang.String name = file.getName();
                                android.net.Uri uri = android.net.Uri.parse(str2);
                                Intrinsics.checkNotNullExpressionValue(uri, str2);
                                arrayList.add(new UploadNew.UploadFileViewModel(jNanoTime, imageId, name, fileType2, null, uri, UploadNew.Status.URL_LOADING, null, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, null));
                                arrayList2.add(new com.okinc.ok_kyc_core.data.remote.networkmodel.File(file.getImageId(), file.getImageType(), file.getName(), (UploadNew.SerializableUploadFileViewModel) null, 8, (DefaultConstructorMarker) null));
                            } else {
                                arrayList.add(localUploadNewModel.convert());
                                arrayList2.add(new com.okinc.ok_kyc_core.data.remote.networkmodel.File(file.getImageId(), file.getImageType(), file.getName(), localUploadNewModel));
                            }
                        }
                        this.AhwBna.clear();
                        this.AhwBna.addAll(arrayList2);
                        rax.setValue(this.AhwBna);
                        this.copydefault.OLrzqt.copydefault(arrayList);
                        abstractC42074rFj.AuCTel().setValue(java.lang.Boolean.valueOf(this.AhwBna.isEmpty()));
                        if (!this.AhwBna.isEmpty()) {
                            rgl.gasjUx().setValue(new C42156rIk(newFileUploaderAppModel3.getViewIdsToHide(), newFileUploaderAppModel3.getViewIdsToShow()));
                        }
                    }
                    this.copydefault.OLrzqt.setFailedOverSize(newFileUploaderAppModel2.getFileSize());
                    java.lang.Long limit = newFileUploaderAppModel2.getLimit();
                    if (limit != null) {
                        this.copydefault.OLrzqt.setFileNumberLimit((int) limit.longValue());
                    }
                    java.lang.String tipsTitle = newFileUploaderAppModel2.getTipsTitle();
                    if (tipsTitle != null) {
                        this.copydefault.OLrzqt.setFileTips(tipsTitle);
                    }
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    final java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.List<java.lang.String> extensions = newFileUploaderAppModel2.getExtensions();
                    this.copydefault.OLrzqt.setSupportedFileTypes(extensions);
                    for (java.lang.String str4 : extensions) {
                        java.util.HashSet<java.lang.String> hashSet2 = this.OLrzqt;
                        java.lang.String lowerCase = str4.toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, str2);
                        if (!hashSet2.contains(lowerCase)) {
                            booleanRef.element = true;
                            java.lang.String str5 = this.AEQbTJ.get(str4);
                            if (str5 != null) {
                                hashSet.add(str5);
                            }
                        }
                    }
                    this.copydefault.OLrzqt.setRetryCallback(new Function1() { // from class: o.rPK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.copydefault(this.KWHzl, abstractC42074rFj, uIComponentAppModel, rax, (UploadNew.UploadFileViewModel) obj);
                        }
                    });
                    this.copydefault.OLrzqt.setDeleteCallback(new Function1() { // from class: o.rPQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.OLrzqt(this.copydefault, rax, abstractC42074rFj, uIComponentAppModel, (UploadNew.UploadFileViewModel) obj);
                        }
                    });
                    this.copydefault.OLrzqt.setPreviewCallback(new Function1() { // from class: o.rPP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.EZpvd(abstractC42074rFj, this, (UploadNew.UploadFileViewModel) obj);
                        }
                    });
                    this.copydefault.OLrzqt.setDownloadCallback(new Function1() { // from class: o.rPO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.copydefault(this.EZpvd, abstractC42074rFj, (UploadNew.UploadFileViewModel) obj);
                        }
                    });
                    this.copydefault.OLrzqt.setGetUrlCallback(new Function1() { // from class: o.rPC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.AEQbTJ(this.OLrzqt, abstractC42074rFj, (UploadNew.UploadFileViewModel) obj);
                        }
                    });
                    java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> files2 = newFileUploaderAppModel2.getFiles();
                    if ((files2 == null || files2.isEmpty()) && Intrinsics.EZpvd(newFileUploaderAppModel2.getShouldShowOnLoad(), java.lang.Boolean.TRUE)) {
                        newFileUploaderAppModel = newFileUploaderAppModel2;
                        KWHzl(newFileUploaderAppModel2, abstractC42074rFj, this, booleanRef, hashSet, fragmentManager, lifecycleOwner, uIComponentAppModel, rax);
                    } else {
                        newFileUploaderAppModel = newFileUploaderAppModel2;
                    }
                    final NewFileUploaderAppModel newFileUploaderAppModel5 = newFileUploaderAppModel;
                    str = str2;
                    abstractC42074rFj.AuCTel().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rPF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42358rPx.KWHzl(newFileUploaderAppModel5, abstractC42074rFj, this, booleanRef, hashSet, fragmentManager, lifecycleOwner, uIComponentAppModel, rax, (java.lang.Boolean) obj);
                        }
                    }));
                    final NewFileUploaderAppModel newFileUploaderAppModel6 = newFileUploaderAppModel;
                    this.copydefault.OLrzqt.setUploadClick(new View.OnClickListener() { // from class: o.rPD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C42358rPx.AEQbTJ(this.KWHzl, newFileUploaderAppModel6, abstractC42074rFj, booleanRef, hashSet, fragmentManager, lifecycleOwner, uIComponentAppModel, rax, view);
                        }
                    });
                }
                uIComponentAppModel2 = uIComponentAppModel;
                str2 = str;
            }
        }
    }

    public static final Unit KWHzl(UIComponentAppModel uIComponentAppModel, C42358rPx c42358rPx, rAX rax, NewFileUploaderAppModel newFileUploaderAppModel, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            NewFileUploaderAppModel newFileUploaderAppModel2 = (NewFileUploaderAppModel) uIComponentAppModel;
            if (listCopydefault.contains(newFileUploaderAppModel2.getId()) && c42358rPx.getVisibility() == 8) {
                c42358rPx.setVisibility(0);
                java.lang.Boolean required = newFileUploaderAppModel2.getRequired();
                rax.EZpvd(required != null ? required.booleanValue() : false);
                rax.setValue(c42358rPx.AhwBna);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                newFileUploaderAppModel2.setHidden(bool);
                newFileUploaderAppModel.setHidden(bool);
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            NewFileUploaderAppModel newFileUploaderAppModel3 = (NewFileUploaderAppModel) uIComponentAppModel;
            if (listKWHzl.contains(newFileUploaderAppModel3.getId()) && c42358rPx.getVisibility() == 0) {
                c42358rPx.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(c42358rPx.AhwBna);
                c42358rPx.copydefault.OLrzqt.AEQbTJ();
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                newFileUploaderAppModel3.setHidden(bool2);
                newFileUploaderAppModel.setHidden(bool2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void observe$lambda$32$lambda$31$uploadPdfOperation$default(LifecycleOwner lifecycleOwner, C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, rAX rax, android.net.Uri uri, boolean z, int i, java.lang.Object obj) {
        if ((i & 64) != 0) {
            z = true;
        }
        KWHzl(lifecycleOwner, c42358rPx, abstractC42074rFj, uIComponentAppModel, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, uri, z);
    }

    public static final void KWHzl(LifecycleOwner lifecycleOwner, C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, android.net.Uri uri, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1(java.lang.System.nanoTime() + ".pdf", uri, c42358rPx, abstractC42074rFj, uIComponentAppModel, "application/pdf", rax, lifecycleOwner, z, null), 3, null);
    }

    public static /* synthetic */ void observe$lambda$32$lambda$31$uploadImgOperation$default(C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, rAX rax, android.net.Uri uri, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        KWHzl(c42358rPx, abstractC42074rFj, uIComponentAppModel, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, uri, z);
    }

    public static final void KWHzl(final C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, final rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, android.net.Uri uri, final boolean z) {
        java.lang.String str = java.lang.System.nanoTime() + JwtUtilsKt.JWT_DELIMITER + new ImageTypeDetector().KWHzl(uri).getTypeName();
        java.lang.String str2 = "image/" + new ImageTypeDetector().KWHzl(uri).getTypeName();
        long jNanoTime = java.lang.System.nanoTime();
        SingleFileUploadUseCase.FileType fileType = SingleFileUploadUseCase.FileType.IMAGE;
        final UploadNew.UploadFileViewModel uploadFileViewModel = new UploadNew.UploadFileViewModel(jNanoTime, 0L, str, fileType, null, uri, null, null, 208, null);
        NewFileUploaderAppModel newFileUploaderAppModel = (NewFileUploaderAppModel) uIComponentAppModel;
        upload$default(c42358rPx, (rGL) abstractC42074rFj, uIComponentAppModel, str, str2, uri, rax, newFileUploaderAppModel.getFileSize(), fileType, newFileUploaderAppModel.getShouldCallOcr(), null, jNanoTime, new Function1() { // from class: o.rPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42358rPx.EZpvd(this.AEQbTJ, uploadFileViewModel, z, rax, (java.io.File) obj);
            }
        }, 512, null);
    }

    public static final Unit EZpvd(C42358rPx c42358rPx, UploadNew.UploadFileViewModel uploadFileViewModel, boolean z, rAX rax, java.io.File file) {
        c42358rPx.copydefault.OLrzqt.OLrzqt(uploadFileViewModel, z);
        c42358rPx.AEQbTJ(rax, c42358rPx.copydefault.OLrzqt.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, C42358rPx c42358rPx, NewFileUploaderAppModel newFileUploaderAppModel, LifecycleOwner lifecycleOwner, UIComponentAppModel uIComponentAppModel, rAX rax, java.lang.Long l) {
        java.util.ArrayList<POACameraGalleryOutputBean> second;
        rGL rgl = (rGL) abstractC42074rFj;
        kotlin.Pair<java.lang.Integer, java.util.ArrayList<POACameraGalleryOutputBean>> pairRcXXUw = rgl.RcXXUw();
        pUU.KWHzl("File_Upload", "okComplianceCameraResultLivedata timestamp=" + l + " | size=" + ((pairRcXXUw == null || (second = pairRcXXUw.getSecond()) == null) ? null : java.lang.Integer.valueOf(second.size())));
        kotlin.Pair<java.lang.Integer, java.util.ArrayList<POACameraGalleryOutputBean>> pairRcXXUw2 = rgl.RcXXUw();
        rgl.copydefault((kotlin.Pair<java.lang.Integer, ? extends java.util.ArrayList<POACameraGalleryOutputBean>>) null);
        if (pairRcXXUw2 != null && pairRcXXUw2.getFirst().intValue() == -1) {
            java.util.ArrayList<POACameraGalleryOutputBean> second2 = pairRcXXUw2.getSecond();
            int iCopydefault = c42358rPx.copydefault.OLrzqt.copydefault();
            if (second2 != null) {
                int i = 0;
                int i2 = 0;
                for (java.lang.Object obj : second2) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    POACameraGalleryOutputBean pOACameraGalleryOutputBean = (POACameraGalleryOutputBean) obj;
                    if (i < iCopydefault) {
                        int i3 = i + 1;
                        pUU.KWHzl("File_Upload", "fileType=" + pOACameraGalleryOutputBean.getFileType());
                        if (Intrinsics.EZpvd((java.lang.Object) pOACameraGalleryOutputBean.getFileType(), (java.lang.Object) "application/pdf")) {
                            KWHzl(lifecycleOwner, c42358rPx, abstractC42074rFj, uIComponentAppModel, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, pOACameraGalleryOutputBean.getUri(), i2 == yDY.AuCTel(second2) || i3 >= iCopydefault);
                        } else {
                            KWHzl(c42358rPx, abstractC42074rFj, uIComponentAppModel, (rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>) rax, pOACameraGalleryOutputBean.getUri(), i2 == yDY.AuCTel(second2) || i3 >= iCopydefault);
                        }
                        i = i3;
                    } else {
                        pUU.KWHzl("File_Upload", "listImage = " + second2.size() + " limit=" + newFileUploaderAppModel.getLimit());
                    }
                    i2++;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(NewFileUploaderAppModel newFileUploaderAppModel, rAX rax, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        newFileUploaderAppModel.setFiles((java.util.List) rax.getValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, rAX rax, UploadNew.UploadFileViewModel uploadFileViewModel) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        java.io.File file = null;
        if (uploadFileViewModel.getFileType() == SingleFileUploadUseCase.FileType.PDF) {
            java.lang.String decryptFilePath = uploadFileViewModel.getDecryptFilePath();
            str = "application/pdf";
            if (decryptFilePath != null) {
                file = new java.io.File(decryptFilePath);
            }
        } else {
            str = "image/" + new ImageTypeDetector().KWHzl(uploadFileViewModel.getUri()).getTypeName();
        }
        c42358rPx.copydefault.OLrzqt.KWHzl(uploadFileViewModel.getLocalUploadId());
        NewFileUploaderAppModel newFileUploaderAppModel = (NewFileUploaderAppModel) uIComponentAppModel;
        upload$default(c42358rPx, (rGL) abstractC42074rFj, uIComponentAppModel, uploadFileViewModel.getFileName(), str, uploadFileViewModel.getUri(), rax, newFileUploaderAppModel.getFileSize(), uploadFileViewModel.getFileType(), newFileUploaderAppModel.getShouldCallOcr(), file, uploadFileViewModel.getLocalUploadId(), null, 2048, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C42358rPx c42358rPx, final rAX rax, final AbstractC42074rFj abstractC42074rFj, final UIComponentAppModel uIComponentAppModel, final UploadNew.UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        c42358rPx.copydefault(new Function0() { // from class: o.rPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42358rPx.AEQbTJ(this.copydefault, uploadFileViewModel, rax, abstractC42074rFj, uIComponentAppModel);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C42358rPx c42358rPx, UploadNew.UploadFileViewModel uploadFileViewModel, rAX rax, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel) {
        c42358rPx.copydefault.OLrzqt.EZpvd(uploadFileViewModel.getLocalUploadId());
        c42358rPx.AEQbTJ(rax, c42358rPx.copydefault.OLrzqt.OLrzqt());
        NewFileUploaderAppModel newFileUploaderAppModel = (NewFileUploaderAppModel) uIComponentAppModel;
        ((rGL) abstractC42074rFj).gasjUx().setValue(new C42156rIk(newFileUploaderAppModel.getViewIdsToHide(), newFileUploaderAppModel.getViewIdsToShow()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC42074rFj abstractC42074rFj, C42358rPx c42358rPx, UploadNew.UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        if (uploadFileViewModel.getFileType() == SingleFileUploadUseCase.FileType.PDF) {
            android.content.Context context = c42358rPx.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String string = uploadFileViewModel.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            ((rGL) abstractC42074rFj).EZpvd(context, "application/pdf", string);
        } else {
            android.content.Context context2 = c42358rPx.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            java.lang.String string2 = uploadFileViewModel.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            ((rGL) abstractC42074rFj).EZpvd(context2, "image/*", string2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UploadNew.UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        c42358rPx.EZpvd((rGL) abstractC42074rFj, uploadFileViewModel.getUrl(), uploadFileViewModel.getFileName(), uploadFileViewModel.getLocalUploadId());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UploadNew.UploadFileViewModel uploadFileViewModel) {
        Intrinsics.checkNotNullParameter(uploadFileViewModel, "");
        c42358rPx.EZpvd((rGL) abstractC42074rFj, uploadFileViewModel.getImageId(), uploadFileViewModel.getLocalUploadId());
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final NewFileUploaderAppModel newFileUploaderAppModel, final AbstractC42074rFj abstractC42074rFj, final C42358rPx c42358rPx, Ref.BooleanRef booleanRef, java.util.HashSet<java.lang.String> hashSet, androidx.fragment.app.FragmentManager fragmentManager, final LifecycleOwner lifecycleOwner, final UIComponentAppModel uIComponentAppModel, final rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax) {
        if (newFileUploaderAppModel.getExtensions().size() == 1 && C59449zhJ.gEmmrt(newFileUploaderAppModel.getExtensions().get(0), "pdf", true)) {
            Function1<? super android.net.Uri, Unit> function1 = new Function1() { // from class: o.rPT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42358rPx.KWHzl(lifecycleOwner, c42358rPx, abstractC42074rFj, uIComponentAppModel, rax, (android.net.Uri) obj);
                }
            };
            InterfaceC55124xdy interfaceC55124xdyDvKsVJ = ((rGL) abstractC42074rFj).dvKsVJ();
            android.content.Context context = c42358rPx.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            interfaceC55124xdyDvKsVJ.EZpvd(context, new java.lang.String[]{"application/pdf"}, function1);
            return;
        }
        if (Intrinsics.EZpvd(newFileUploaderAppModel.isShowCamera(), java.lang.Boolean.TRUE)) {
            android.content.Context context2 = c42358rPx.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = c42358rPx.copydefault.OLrzqt.copydefault();
            boolean z = booleanRef.element;
            ((rGL) abstractC42074rFj).OLrzqt(context2, iCopydefault, z ? 1 : 0, (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
            return;
        }
        rLK.OLrzqt.OLrzqt(fragmentManager, booleanRef.element, new Function2() { // from class: o.rPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C42358rPx.copydefault(newFileUploaderAppModel, abstractC42074rFj, lifecycleOwner, c42358rPx, uIComponentAppModel, rax, (FilePickerType) obj, (android.net.Uri) obj2);
            }
        });
    }

    public static final Unit KWHzl(LifecycleOwner lifecycleOwner, C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, rAX rax, android.net.Uri uri) {
        if (uri != null) {
            observe$lambda$32$lambda$31$uploadPdfOperation$default(lifecycleOwner, c42358rPx, abstractC42074rFj, uIComponentAppModel, rax, uri, false, 64, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(NewFileUploaderAppModel newFileUploaderAppModel, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, C42358rPx c42358rPx, UIComponentAppModel uIComponentAppModel, rAX rax, FilePickerType filePickerType, android.net.Uri uri) {
        if (uri != null) {
            POACameraGalleryOutputBean[] pOACameraGalleryOutputBeanArr = new POACameraGalleryOutputBean[1];
            FilePickerType filePickerType2 = FilePickerType.FILE;
            pOACameraGalleryOutputBeanArr[0] = new POACameraGalleryOutputBean(uri, "", filePickerType == filePickerType2 ? "application/pdf" : "image/*");
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(pOACameraGalleryOutputBeanArr);
            pUU.KWHzl("File_Upload", "okComplianceCameraLauncher listImage=" + arrayListCopydefault);
            if (filePickerType == filePickerType2) {
                observe$lambda$32$lambda$31$uploadPdfOperation$default(lifecycleOwner, c42358rPx, abstractC42074rFj, uIComponentAppModel, rax, uri, false, 64, null);
            } else {
                rGL rgl = (rGL) abstractC42074rFj;
                rgl.copydefault(new kotlin.Pair<>(-1, arrayListCopydefault));
                rgl.fFgQHt().setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            rGL rgl2 = (rGL) abstractC42074rFj;
            rgl2.copydefault(new kotlin.Pair<>(0, null));
            rgl2.fFgQHt().setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(NewFileUploaderAppModel newFileUploaderAppModel, AbstractC42074rFj abstractC42074rFj, C42358rPx c42358rPx, Ref.BooleanRef booleanRef, java.util.HashSet hashSet, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, UIComponentAppModel uIComponentAppModel, rAX rax, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            KWHzl(newFileUploaderAppModel, abstractC42074rFj, c42358rPx, booleanRef, hashSet, fragmentManager, lifecycleOwner, uIComponentAppModel, rax);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C42358rPx c42358rPx, final NewFileUploaderAppModel newFileUploaderAppModel, final AbstractC42074rFj abstractC42074rFj, Ref.BooleanRef booleanRef, java.util.HashSet hashSet, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, UIComponentAppModel uIComponentAppModel, rAX rax, android.view.View view) {
        if (c42358rPx.copydefault.OLrzqt.copydefault() <= 0) {
            return;
        }
        C32866mlf.onEvent$default("KYC_Upload_File_Click", (TrackChannel[]) null, new Function1() { // from class: o.rPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42358rPx.OLrzqt(newFileUploaderAppModel, abstractC42074rFj, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        KWHzl(newFileUploaderAppModel, abstractC42074rFj, c42358rPx, booleanRef, hashSet, fragmentManager, lifecycleOwner, uIComponentAppModel, rax);
    }

    public static final Unit OLrzqt(NewFileUploaderAppModel newFileUploaderAppModel, AbstractC42074rFj abstractC42074rFj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "view_id", newFileUploaderAppModel.getId(), false, 4, null);
        java.lang.String id = ((rGL) abstractC42074rFj).finit().getId();
        EventParamsList.put$default(eventParamsList, "screen", id == null ? "" : id, false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] KWHzl(android.content.Context context, android.net.Uri uri) {
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

    public final void copydefault(final Function0<Unit> function0) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(viewOnClickListenerC54939xaY.getContext(), C52761wXj.Activity.gsvlRV));
        viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.djSkpj));
        viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.QfsBiF));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.rPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C42358rPx.OLrzqt(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.wlaJM);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, string2, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(int i) {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.RcXXUw));
        android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        pTD.KWHzl(context2, C43662rtX.Dialog.djBIcL, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("fileSize", java.lang.Integer.valueOf(i))));
        android.content.Context context3 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        viewOnClickListenerC54939xaY.EZpvd(pTD.KWHzl(context3, C43662rtX.Dialog.aKErDB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("fileSize", java.lang.Integer.valueOf(i)))));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C43662rtX.Dialog.zsXlph);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.rPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C42358rPx.EZpvd(this.EZpvd, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(C42358rPx c42358rPx, android.content.DialogInterface dialogInterface) {
        c42358rPx.EZpvd = false;
    }

    public static final Unit AEQbTJ(java.io.File file) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.rPx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void upload$default(C42358rPx c42358rPx, rGL rgl, UIComponentAppModel uIComponentAppModel, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.io.File file, long j, Function1 function1, int i2, java.lang.Object obj) {
        c42358rPx.OLrzqt(rgl, uIComponentAppModel, str, str2, uri, rax, i, fileType, z, (i2 & 512) != 0 ? null : file, (i2 & 1024) != 0 ? 0L : j, (i2 & 2048) != 0 ? new Function1() { // from class: o.rPB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C42358rPx.AEQbTJ((java.io.File) obj2);
            }
        } : function1);
    }

    public final void OLrzqt(rGL rgl, UIComponentAppModel uIComponentAppModel, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.io.File file, long j, Function1<? super java.io.File, Unit> function1) {
        C33478mxH c33478mxH = C33478mxH.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.io.File fileEZpvd = c33478mxH.EZpvd(context);
        java.io.File fileEZpvd2 = file == null ? C43699ruH.KWHzl.EZpvd(uri, fileEZpvd, str) : file;
        if (fileEZpvd2.length() >= 1048576 * i) {
            EZpvd(i);
        } else {
            function1.invoke(file);
            BuildersKt__Builders_commonKt.launch$default(this.djBIcL, Dispatchers.getMain(), null, new NewFileUploaderItemView$upload$2(fileEZpvd, this, uri, rgl, fileEZpvd2, str2, fileType, z, uIComponentAppModel, j, rax, file, null), 2, null);
        }
    }

    public final void EZpvd(rGL rgl, long j, long j2) {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, Dispatchers.getMain(), null, new NewFileUploaderItemView$getOssImageUrl$1(this, j2, rgl, j, null), 2, null);
    }

    public final void EZpvd(rGL rgl, java.lang.String str, java.lang.String str2, long j) {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, Dispatchers.getMain(), null, new NewFileUploaderItemView$downLoadAndPreviewPdf$1(this, str2, j, rgl, str, null), 2, null);
    }

    public final java.lang.Object EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        new C33143mqr(context, str, str2, null, new StateListAnimator(c56434yFf)).EZpvd();
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    /* JADX INFO: renamed from: o.rPx$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC33145mqt {
        public final /* synthetic */ Continuation<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd;

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
            this.EZpvd = continuation;
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Continuation<kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new kotlin.Pair(java.lang.Boolean.FALSE, str)));
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Continuation<kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new kotlin.Pair(java.lang.Boolean.TRUE, "")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(rGL rgl, UIComponentAppModel uIComponentAppModel, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, LifecycleOwner lifecycleOwner, long j, Function1<? super java.io.File, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NewFileUploaderItemView$uploadPdf$1 newFileUploaderItemView$uploadPdf$1;
        boolean z2;
        C42358rPx c42358rPx;
        boolean z3;
        final long j2;
        java.lang.String str3;
        rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax2;
        SingleFileUploadUseCase.FileType fileType2;
        LifecycleOwner lifecycleOwner2;
        final Function1<? super java.io.File, Unit> function12;
        int i2;
        java.lang.String str4;
        java.lang.Boolean bool;
        android.net.Uri uri2;
        rGL rgl2;
        UIComponentAppModel uIComponentAppModel2;
        java.lang.String str5;
        rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax3;
        SingleFileUploadUseCase.FileType fileType3;
        long j3;
        Function1<? super java.io.File, Unit> function13;
        int i3;
        android.net.Uri uri3;
        java.lang.Object obj;
        boolean z4;
        if (continuation instanceof NewFileUploaderItemView$uploadPdf$1) {
            newFileUploaderItemView$uploadPdf$1 = (NewFileUploaderItemView$uploadPdf$1) continuation;
            int i4 = newFileUploaderItemView$uploadPdf$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                newFileUploaderItemView$uploadPdf$1.label = i4 - Integer.MIN_VALUE;
            } else {
                newFileUploaderItemView$uploadPdf$1 = new NewFileUploaderItemView$uploadPdf$1(this, continuation);
            }
        }
        java.lang.Object obj2 = newFileUploaderItemView$uploadPdf$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = newFileUploaderItemView$uploadPdf$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj2);
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if (rtu == null) {
                z2 = true;
                c42358rPx = this;
                z3 = z;
                j2 = j;
                str3 = str2;
                rax2 = rax;
                fileType2 = fileType;
                lifecycleOwner2 = lifecycleOwner;
                function12 = function1;
                i2 = i;
                str4 = str;
                bool = null;
                uri2 = uri;
                rgl2 = rgl;
                uIComponentAppModel2 = uIComponentAppModel;
                if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(z2))) {
                    C43693ruB.OLrzqt("KYC_Select_Encrypt_Pdf");
                    C33478mxH c33478mxH = C33478mxH.KWHzl;
                    android.content.Context context = c42358rPx.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.io.File fileEZpvd = c33478mxH.EZpvd(context);
                    if (fileEZpvd == null) {
                        rQZ rqz = rQZ.KWHzl;
                        android.content.Context context2 = c42358rPx.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        rqz.EZpvd(context2);
                        return Unit.INSTANCE;
                    }
                    final java.lang.String str6 = fileEZpvd.getPath() + java.io.File.separator + str4;
                    pUU.copydefault("File_Upload", "outputPath=" + str6);
                    rQZ rqz2 = rQZ.KWHzl;
                    android.content.Context context3 = c42358rPx.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    final C42358rPx c42358rPx2 = c42358rPx;
                    final rGL rgl3 = rgl2;
                    final UIComponentAppModel uIComponentAppModel3 = uIComponentAppModel2;
                    final java.lang.String str7 = str4;
                    final java.lang.String str8 = str3;
                    final android.net.Uri uri4 = uri2;
                    final rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax4 = rax2;
                    final int i6 = i2;
                    final SingleFileUploadUseCase.FileType fileType4 = fileType2;
                    final boolean z5 = z3;
                    rqz2.KWHzl(context3, uri2, str6, lifecycleOwner2, new Function0() { // from class: o.rQa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42358rPx.copydefault();
                        }
                    }, new Function0() { // from class: o.rPY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42358rPx.KWHzl(this.AEQbTJ, rgl3, uIComponentAppModel3, str7, str8, uri4, rax4, i6, fileType4, z5, str6, j2, function12);
                        }
                    });
                } else {
                    if (bool == null) {
                        C43693ruB.OLrzqt("KYC_Pdf_Fd_Error");
                    }
                    upload$default(c42358rPx, rgl2, uIComponentAppModel2, str4, str3, uri2, rax2, i2, fileType2, z3, null, j2, function12, 512, null);
                }
                return Unit.INSTANCE;
            }
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            newFileUploaderItemView$uploadPdf$1.L$0 = this;
            newFileUploaderItemView$uploadPdf$1.L$1 = rgl;
            newFileUploaderItemView$uploadPdf$1.L$2 = uIComponentAppModel;
            newFileUploaderItemView$uploadPdf$1.L$3 = str;
            str5 = str2;
            newFileUploaderItemView$uploadPdf$1.L$4 = str5;
            newFileUploaderItemView$uploadPdf$1.L$5 = uri;
            rax3 = rax;
            newFileUploaderItemView$uploadPdf$1.L$6 = rax3;
            fileType3 = fileType;
            newFileUploaderItemView$uploadPdf$1.L$7 = fileType3;
            newFileUploaderItemView$uploadPdf$1.L$8 = lifecycleOwner;
            newFileUploaderItemView$uploadPdf$1.L$9 = function1;
            newFileUploaderItemView$uploadPdf$1.I$0 = i;
            newFileUploaderItemView$uploadPdf$1.Z$0 = z;
            newFileUploaderItemView$uploadPdf$1.J$0 = j;
            z2 = true;
            newFileUploaderItemView$uploadPdf$1.label = 1;
            java.lang.Object objKWHzl = rtu.KWHzl(context4, uri, newFileUploaderItemView$uploadPdf$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c42358rPx = this;
            j3 = j;
            lifecycleOwner2 = lifecycleOwner;
            function13 = function1;
            i3 = i;
            str4 = str;
            uri3 = uri;
            obj = objKWHzl;
            rgl2 = rgl;
            uIComponentAppModel2 = uIComponentAppModel;
            z4 = z;
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = newFileUploaderItemView$uploadPdf$1.J$0;
            boolean z6 = newFileUploaderItemView$uploadPdf$1.Z$0;
            i3 = newFileUploaderItemView$uploadPdf$1.I$0;
            function13 = (Function1) newFileUploaderItemView$uploadPdf$1.L$9;
            LifecycleOwner lifecycleOwner3 = (LifecycleOwner) newFileUploaderItemView$uploadPdf$1.L$8;
            SingleFileUploadUseCase.FileType fileType5 = (SingleFileUploadUseCase.FileType) newFileUploaderItemView$uploadPdf$1.L$7;
            rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax5 = (rAX) newFileUploaderItemView$uploadPdf$1.L$6;
            uri3 = (android.net.Uri) newFileUploaderItemView$uploadPdf$1.L$5;
            java.lang.String str9 = (java.lang.String) newFileUploaderItemView$uploadPdf$1.L$4;
            str4 = (java.lang.String) newFileUploaderItemView$uploadPdf$1.L$3;
            uIComponentAppModel2 = (UIComponentAppModel) newFileUploaderItemView$uploadPdf$1.L$2;
            rgl2 = (rGL) newFileUploaderItemView$uploadPdf$1.L$1;
            C42358rPx c42358rPx3 = (C42358rPx) newFileUploaderItemView$uploadPdf$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            c42358rPx = c42358rPx3;
            lifecycleOwner2 = lifecycleOwner3;
            str5 = str9;
            z2 = true;
            obj = obj2;
            z4 = z6;
            fileType3 = fileType5;
            rax3 = rax5;
        }
        bool = (java.lang.Boolean) obj;
        z3 = z4;
        j2 = j3;
        i2 = i3;
        function12 = function13;
        str3 = str5;
        rax2 = rax3;
        fileType2 = fileType3;
        uri2 = uri3;
        if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(z2))) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.io.File file) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        C55326xho.toastWithFailedIcon$default(C43662rtX.Dialog.dNCPSb, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C42358rPx c42358rPx, rGL rgl, UIComponentAppModel uIComponentAppModel, java.lang.String str, java.lang.String str2, android.net.Uri uri, rAX rax, int i, SingleFileUploadUseCase.FileType fileType, boolean z, java.lang.String str3, long j, Function1 function1) {
        c42358rPx.OLrzqt(rgl, uIComponentAppModel, str, str2, uri, rax, i, fileType, z, new java.io.File(str3), j, function1);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, java.util.ArrayList<java.lang.Object> arrayList) {
        this.AhwBna.clear();
        for (java.lang.Object obj : arrayList) {
            UploadNew.UploadFileViewModel uploadFileViewModel = obj instanceof UploadNew.UploadFileViewModel ? (UploadNew.UploadFileViewModel) obj : null;
            if (uploadFileViewModel != null) {
                this.AhwBna.add(new com.okinc.ok_kyc_core.data.remote.networkmodel.File(uploadFileViewModel.getImageId(), this.KWHzl, uploadFileViewModel.getFileName(), ((UploadNew.UploadFileViewModel) obj).convert()));
            }
        }
        rax.setValue(this.AhwBna);
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.valueOf, uIComponentAppModel.getBottomMargin()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        CoroutineScopeKt.cancel$default(this.djBIcL, null, 1, null);
        super.onDetachedFromWindow();
    }
}
