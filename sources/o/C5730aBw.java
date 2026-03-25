package o;

import com.okinc.auth.impl.facerecognition.data.FaceRecognitionApiService;

/* JADX INFO: renamed from: o.aBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5730aBw implements InterfaceC58162ywA<FaceRecognitionApiService> {
    public final FaceRecognitionApiService.FaceRecognitionApiServiceHiltModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public FaceRecognitionApiService get() {
        return KWHzl(this.KWHzl);
    }

    public static FaceRecognitionApiService KWHzl(FaceRecognitionApiService.FaceRecognitionApiServiceHiltModule faceRecognitionApiServiceHiltModule) {
        return (FaceRecognitionApiService) C58165ywD.KWHzl(faceRecognitionApiServiceHiltModule.EZpvd());
    }
}
