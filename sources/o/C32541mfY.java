package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.AZL;
import o.AbstractC4327BbX;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32541mfY {
    public static final C32541mfY KWHzl = new C32541mfY();
    public static final MediaType copydefault = MediaType.Companion.get(EIP1271Verifier.mediaTypeString);
    public static final int OLrzqt = 8;

    private C32541mfY() {
    }

    public static /* synthetic */ RequestBody convert$default(C32541mfY c32541mfY, AbstractC4327BbX abstractC4327BbX, InterfaceC4400Bcr interfaceC4400Bcr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC4400Bcr = null;
        }
        return c32541mfY.AEQbTJ(abstractC4327BbX, interfaceC4400Bcr);
    }

    public final RequestBody AEQbTJ(@NotNull AbstractC4327BbX abstractC4327BbX, InterfaceC4400Bcr interfaceC4400Bcr) {
        Intrinsics.checkNotNullParameter(abstractC4327BbX, "");
        int i = 1;
        java.nio.charset.Charset charset = null;
        byte b = 0;
        if (abstractC4327BbX instanceof AbstractC4327BbX.Application) {
            return RequestBody.Companion.create$default(RequestBody.Companion, "", (MediaType) null, 1, (java.lang.Object) null);
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.TaskDescription) {
            return RequestBody.Companion.create$default(RequestBody.Companion, ((AbstractC4327BbX.TaskDescription) abstractC4327BbX).KWHzl(), (MediaType) null, 0, 0, 7, (java.lang.Object) null);
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.Activity) {
            return RequestBody.Companion.create(((AbstractC4327BbX.Activity) abstractC4327BbX).EZpvd(), copydefault);
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.StateListAnimator) {
            FormBody.Builder builder = new FormBody.Builder(charset, i, b == true ? 1 : 0);
            for (C2792AZk c2792AZk : ((AbstractC4327BbX.StateListAnimator) abstractC4327BbX).EZpvd()) {
                builder.add(c2792AZk.OLrzqt(), c2792AZk.KWHzl());
            }
            return builder.build();
        }
        if (!(abstractC4327BbX instanceof AbstractC4327BbX.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        RequestBody requestBodyKWHzl = KWHzl((AbstractC4327BbX.ActionBar) abstractC4327BbX);
        return interfaceC4400Bcr != null ? new TaskDescription(requestBodyKWHzl, interfaceC4400Bcr) : requestBodyKWHzl;
    }

    public final RequestBody KWHzl(AbstractC4327BbX.ActionBar actionBar) {
        MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
        for (AZO azo : actionBar.OLrzqt()) {
            AZL azlKWHzl = azo.KWHzl();
            if (azlKWHzl instanceof AZL.ActionBar) {
                type.addFormDataPart(azo.AEQbTJ(), ((AZL.ActionBar) azlKWHzl).OLrzqt());
            } else if (azlKWHzl instanceof AZL.Application) {
                java.lang.String strEZpvd = azo.EZpvd();
                type.addFormDataPart(azo.AEQbTJ(), azo.copydefault(), RequestBody.Companion.create$default(RequestBody.Companion, ((AZL.Application) azlKWHzl).KWHzl(), strEZpvd != null ? MediaType.Companion.parse(strEZpvd) : null, 0, 0, 6, (java.lang.Object) null));
            } else {
                if (!(azlKWHzl instanceof AZL.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.io.File file = new java.io.File(((AZL.Activity) azlKWHzl).EZpvd());
                java.lang.String strEZpvd2 = azo.EZpvd();
                RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.Companion, yFI.AhwBna(file), strEZpvd2 != null ? MediaType.Companion.parse(strEZpvd2) : null, 0, 0, 6, (java.lang.Object) null);
                java.lang.String strAEQbTJ = azo.AEQbTJ();
                java.lang.String strCopydefault = azo.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = file.getName();
                }
                type.addFormDataPart(strAEQbTJ, strCopydefault, requestBodyCreate$default);
            }
        }
        return type.build();
    }

    /* JADX INFO: renamed from: o.mfY$TaskDescription */
    public static final class TaskDescription extends RequestBody {
        public final RequestBody EZpvd;
        public final InterfaceC4400Bcr KWHzl;

        public TaskDescription(@NotNull RequestBody requestBody, @NotNull InterfaceC4400Bcr interfaceC4400Bcr) {
            Intrinsics.checkNotNullParameter(requestBody, "");
            Intrinsics.checkNotNullParameter(interfaceC4400Bcr, "");
            this.EZpvd = requestBody;
            this.KWHzl = interfaceC4400Bcr;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.EZpvd.contentType();
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.EZpvd.contentLength();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(@NotNull BufferedSink bufferedSink) throws java.io.IOException {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(bufferedSink, "");
            if (bufferedSink instanceof okio.Buffer) {
                this.EZpvd.writeTo(bufferedSink);
                return;
            }
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Long.valueOf(contentLength()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = -1L;
            }
            if (((java.lang.Number) objM7377constructorimpl).longValue() <= 0) {
                objM7377constructorimpl = null;
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(new StateListAnimator(bufferedSink, this, (java.lang.Long) objM7377constructorimpl));
            this.EZpvd.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.flush();
        }

        /* JADX INFO: renamed from: o.mfY$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends ForwardingSink {
            public final /* synthetic */ java.lang.Long EZpvd;
            public final /* synthetic */ TaskDescription KWHzl;
            public long OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(BufferedSink bufferedSink, TaskDescription taskDescription, java.lang.Long l) {
                super(bufferedSink);
                this.KWHzl = taskDescription;
                this.EZpvd = l;
            }

            @Override // okio.ForwardingSink, okio.Sink
            public void write(okio.Buffer buffer, long j) throws java.io.IOException {
                Intrinsics.checkNotNullParameter(buffer, "");
                super.write(buffer, j);
                this.OLrzqt += j;
                InterfaceC4400Bcr interfaceC4400Bcr = this.KWHzl.KWHzl;
                long jCopydefault = C56396yDv.copydefault(this.OLrzqt);
                java.lang.Long l = this.EZpvd;
                interfaceC4400Bcr.OLrzqt(jCopydefault, l != null ? C56396yDv.KWHzl(C56396yDv.copydefault(l.longValue())) : null);
            }
        }
    }
}
