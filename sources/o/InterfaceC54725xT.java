package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> {
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Output>> continuation);

    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
    java.lang.Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Output>> continuation);

    java.lang.Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX, @NotNull Continuation<? super ProtocolResponse> continuation);

    java.lang.Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation);

    java.lang.Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<Input> interfaceC56995ya, @NotNull Continuation<? super Input> continuation);

    java.lang.Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation);

    java.lang.Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation);

    void readAfterAttempt(@NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY);

    void readAfterDeserialization(@NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY);

    void readAfterExecution(@NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY);

    void readAfterSerialization(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ);

    void readAfterSigning(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ);

    void readAfterTransmit(@NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX);

    void readBeforeAttempt(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ);

    void readBeforeDeserialization(@NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX);

    void readBeforeExecution(@NotNull InterfaceC56995ya<Input> interfaceC56995ya);

    void readBeforeSerialization(@NotNull InterfaceC56995ya<Input> interfaceC56995ya);

    void readBeforeSigning(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ);

    void readBeforeTransmit(@NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ);

    /* JADX INFO: renamed from: o.xT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void AEQbTJ(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ) {
            Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void EZpvd(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX) {
            Intrinsics.checkNotNullParameter(interfaceC54833xX, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void EZpvd(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY) {
            Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void EZpvd(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ) {
            Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void KWHzl(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ) {
            Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void KWHzl(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC56995ya<Input> interfaceC56995ya) {
            Intrinsics.checkNotNullParameter(interfaceC56995ya, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY) {
            Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ) {
            Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC56995ya<Input> interfaceC56995ya) {
            Intrinsics.checkNotNullParameter(interfaceC56995ya, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void copydefault(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX) {
            Intrinsics.checkNotNullParameter(interfaceC54833xX, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void copydefault(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY) {
            Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <Input, Output, ProtocolRequest, ProtocolResponse> void copydefault(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ) {
            Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC56995ya<Input> interfaceC56995ya, @NotNull Continuation<? super Input> continuation) {
            return interfaceC56995ya.OLrzqt();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation) {
            return interfaceC54887xZ.AEQbTJ();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object KWHzl(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation) {
            return interfaceC54887xZ.AEQbTJ();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object copydefault(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54887xZ<Input, ProtocolRequest> interfaceC54887xZ, @NotNull Continuation<? super ProtocolRequest> continuation) {
            return interfaceC54887xZ.AEQbTJ();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54833xX<Input, ProtocolRequest, ProtocolResponse> interfaceC54833xX, @NotNull Continuation<? super ProtocolResponse> continuation) {
            return interfaceC54833xX.EZpvd();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object KWHzl(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Output>> continuation) {
            return interfaceC54860xY.copydefault();
        }

        public static <Input, Output, ProtocolRequest, ProtocolResponse> java.lang.Object OLrzqt(@NotNull InterfaceC54725xT<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54725xT, @NotNull InterfaceC54860xY<Input, Output, ProtocolRequest, ProtocolResponse> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Output>> continuation) {
            return interfaceC54860xY.copydefault();
        }
    }
}
