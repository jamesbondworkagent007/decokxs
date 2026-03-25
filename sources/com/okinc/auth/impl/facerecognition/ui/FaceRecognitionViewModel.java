package com.okinc.auth.impl.facerecognition.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC5688aBG;
import o.C32989mnw;
import o.C5729aBv;
import o.C5731aBx;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceRecognitionViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C5729aBv AEQbTJ;
    public final LiveData<C32989mnw<Boolean>> AYXKKw;
    public final SavedStateHandle AhwBna;
    public final MutableLiveData<FaceVerifyCreateSessionResponse> KWHzl;
    public final MutableSharedFlow<AbstractC5688aBG> OLrzqt;
    public final MutableLiveData<C32989mnw<Boolean>> copydefault;
    public final FacialRecognitionRequest djBIcL;
    public final C5731aBx gEmmrt;
    public final SharedFlow<AbstractC5688aBG> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC5688aBG> KWHzl() {
        return this.valueOf;
    }

    @yCM
    public FaceRecognitionViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5729aBv c5729aBv, @NotNull C5731aBx c5731aBx) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5729aBv, "");
        Intrinsics.checkNotNullParameter(c5731aBx, "");
        this.AhwBna = savedStateHandle;
        this.AEQbTJ = c5729aBv;
        this.gEmmrt = c5731aBx;
        this.djBIcL = (FacialRecognitionRequest) savedStateHandle.get("KEY_REQUEST");
        this.KWHzl = new MutableLiveData<>(null);
        MutableSharedFlow<AbstractC5688aBG> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.AYXKKw = mutableLiveData;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FaceRecognitionViewModel$startCreateFaceRecognitionSession$1(this, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FaceRecognitionViewModel$getFaceRecognitionResult$1(this, null), 3, null);
    }
}
