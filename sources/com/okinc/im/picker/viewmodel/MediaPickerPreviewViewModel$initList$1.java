package com.okinc.im.picker.viewmodel;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44161sFo;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pUU;
import o.sFB;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPickerPreviewViewModel$initList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Uri> $uriList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ MediaPickerPreviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerPreviewViewModel$initList$1(MediaPickerPreviewViewModel mediaPickerPreviewViewModel, List<? extends Uri> list, Continuation<? super MediaPickerPreviewViewModel$initList$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaPickerPreviewViewModel;
        this.$uriList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPickerPreviewViewModel$initList$1(this.this$0, this.$uriList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPickerPreviewViewModel$initList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:19:0x00a5, B:25:0x00c1], limit reached: 32 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:16:0x007c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MediaPickerPreviewViewModel mediaPickerPreviewViewModel;
        Collection arrayList;
        SavedStateHandle savedStateHandle;
        Iterator it;
        String str;
        Parcelable videoItem;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SavedStateHandle savedStateHandle2 = this.this$0.EZpvd;
            List<Uri> list = this.$uriList;
            mediaPickerPreviewViewModel = this.this$0;
            arrayList = new ArrayList();
            savedStateHandle = savedStateHandle2;
            it = list.iterator();
            str = "ARG_MEDIA_ITEMS";
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$5;
            savedStateHandle = (SavedStateHandle) this.L$4;
            Uri uri = (Uri) this.L$3;
            it = (Iterator) this.L$2;
            arrayList = (Collection) this.L$1;
            mediaPickerPreviewViewModel = (MediaPickerPreviewViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = ((C44161sFo) obj).EZpvd();
            pUU.KWHzl(MediaPickerPreviewViewModel.KWHzl, "mediaType: " + strEZpvd + " | uri: " + uri);
            if (strEZpvd != null) {
                if (C59449zhJ.AYXKKw(strEZpvd, "image/", true)) {
                    videoItem = new MediaPickerPreviewViewModel.MediaItem.ImageItem(uri);
                } else if (C59449zhJ.AYXKKw(strEZpvd, "video/", true)) {
                    videoItem = new MediaPickerPreviewViewModel.MediaItem.VideoItem(uri);
                }
                if (videoItem != null) {
                    arrayList.add(videoItem);
                }
                if (!it.hasNext()) {
                    savedStateHandle.set(str, (List) arrayList);
                    MediaPickerPreviewViewModel.TaskDescription.Application application = new MediaPickerPreviewViewModel.TaskDescription.Application(this.this$0.copydefault());
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    if (mutableStateFlow.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                uri = (Uri) it.next();
                Context context = mediaPickerPreviewViewModel.OLrzqt;
                this.L$0 = mediaPickerPreviewViewModel;
                this.L$1 = arrayList;
                this.L$2 = it;
                this.L$3 = uri;
                this.L$4 = savedStateHandle;
                this.L$5 = str;
                this.label = 1;
                obj = sFB.gEmmrt(uri, context, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                String strEZpvd2 = ((C44161sFo) obj).EZpvd();
                pUU.KWHzl(MediaPickerPreviewViewModel.KWHzl, "mediaType: " + strEZpvd2 + " | uri: " + uri);
                if (strEZpvd2 != null) {
                }
            }
            videoItem = null;
            if (videoItem != null) {
            }
            if (!it.hasNext()) {
            }
        }
    }
}
