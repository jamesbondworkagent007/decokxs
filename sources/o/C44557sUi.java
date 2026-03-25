package o;

import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import com.okinc.oklive.app.domain.usecase.GetRecordedStreamsUseCase$execute$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44557sUi {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final sTP copydefault;

    @yCM
    public C44557sUi(@NotNull sTP stp) {
        Intrinsics.checkNotNullParameter(stp, "");
        this.copydefault = stp;
    }

    /* JADX INFO: renamed from: o.sUi$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: execute-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8709executeBWLJW6A$default(C44557sUi c44557sUi, long j, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 10;
        }
        return c44557sUi.AEQbTJ(j, i4, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, int i, int i2, @NotNull Continuation<? super Result<RecordedStreamsResponse>> continuation) {
        GetRecordedStreamsUseCase$execute$1 getRecordedStreamsUseCase$execute$1;
        if (continuation instanceof GetRecordedStreamsUseCase$execute$1) {
            getRecordedStreamsUseCase$execute$1 = (GetRecordedStreamsUseCase$execute$1) continuation;
            int i3 = getRecordedStreamsUseCase$execute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getRecordedStreamsUseCase$execute$1.label = i3 - Integer.MIN_VALUE;
            } else {
                getRecordedStreamsUseCase$execute$1 = new GetRecordedStreamsUseCase$execute$1(this, continuation);
            }
        }
        GetRecordedStreamsUseCase$execute$1 getRecordedStreamsUseCase$execute$12 = getRecordedStreamsUseCase$execute$1;
        java.lang.Object objAEQbTJ = getRecordedStreamsUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = getRecordedStreamsUseCase$execute$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                pUU.EZpvd("GetRecordedStreamsUseCase", "Fetching recorded streams - uid: " + j + ", page: " + i);
                sTP stp = this.copydefault;
                getRecordedStreamsUseCase$execute$12.label = 1;
                objAEQbTJ = stp.AEQbTJ(j, i, i2, getRecordedStreamsUseCase$execute$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            RecordedStreamsResponse recordedStreamsResponse = (RecordedStreamsResponse) objAEQbTJ;
            if (recordedStreamsResponse != null) {
                java.util.List<RecordingInfoResponse> items = recordedStreamsResponse.getItems();
                int size = items != null ? items.size() : 0;
                pUU.EZpvd("GetRecordedStreamsUseCase", "Fetched " + size + " recordings, total: " + recordedStreamsResponse.getTotalItemCount());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(recordedStreamsResponse);
            }
            pUU.copydefault("GetRecordedStreamsUseCase", "Failed to fetch recorded streams");
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Failed to fetch recorded streams")));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("GetRecordedStreamsUseCase", "Exception fetching recorded streams", e);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }
}
