package com.amplifyframework.ui.liveness.camera;

import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LivenessCoordinator$encoder$2 extends FunctionReferenceImpl implements Function2<FaceLivenessDetectionException, Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessCoordinator$encoder$2(Object obj) {
        super(2, obj, LivenessCoordinator.class, "processSessionError", "processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(Lcom/amplifyframework/ui/liveness/model/FaceLivenessDetectionException;Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(FaceLivenessDetectionException faceLivenessDetectionException, Boolean bool) {
        invoke(faceLivenessDetectionException, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FaceLivenessDetectionException faceLivenessDetectionException, boolean z) {
        Intrinsics.checkNotNullParameter(faceLivenessDetectionException, "");
        ((LivenessCoordinator) this.receiver).processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(faceLivenessDetectionException, z);
    }
}
