package com.amplifyframework.api.aws.auth;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.sigv4.AWS4Signer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C5043Cn;
import o.C58617zJ;
import o.DL;
import o.DM;
import o.InterfaceC5037Ch;
import o.InterfaceC52805wZ;
import o.InterfaceC58536zG;
import o.InterfaceC58725zN;
import o.zP;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public class IamRequestDecorator implements RequestDecorator {
    private static final String DEFAULT_CONTENT_TYPE = "application/json";
    private final InterfaceC52805wZ credentialsProvider;
    private final String serviceName;
    private final AWS4Signer v4Signer;

    public IamRequestDecorator(AWS4Signer aWS4Signer, InterfaceC52805wZ interfaceC52805wZ, String str) {
        this.v4Signer = aWS4Signer;
        this.credentialsProvider = interfaceC52805wZ;
        this.serviceName = str;
    }

    @Override // com.amplifyframework.api.aws.auth.RequestDecorator
    public final Request decorate(final Request request) throws ApiException.ApiAuthException {
        byte[] bytes = getBytes(request.body());
        InterfaceC5037Ch interfaceC5037ChAEQbTJ = this.v4Signer.signBlocking(C5043Cn.copydefault(HttpMethod.Companion.OLrzqt(request.method()), DL.AEQbTJ.EZpvd(request.url().uri().toString(), DM.KWHzl.copydefault()), InterfaceC58725zN.AEQbTJ.copydefault(new Function1() { // from class: com.amplifyframework.api.aws.auth.IamRequestDecorator$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IamRequestDecorator.lambda$decorate$0(request, (C58617zJ) obj);
            }
        }), zP.EZpvd.OLrzqt(bytes), InterfaceC58536zG.copydefault.OLrzqt()), this.credentialsProvider, this.serviceName).AEQbTJ();
        Request.Builder builder = new Request.Builder();
        String str = DEFAULT_CONTENT_TYPE;
        for (Map.Entry<String, List<String>> entry : interfaceC5037ChAEQbTJ.EZpvd().AEQbTJ()) {
            String key = entry.getKey();
            String str2 = entry.getValue().get(0);
            builder.addHeader(key, str2);
            if ("content-type".equalsIgnoreCase(key)) {
                str = str2;
            }
        }
        MediaType mediaType = MediaType.parse(str);
        if (mediaType == null) {
            mediaType = MediaType.parse(DEFAULT_CONTENT_TYPE);
        }
        builder.url(request.url());
        builder.method(request.method(), request.body() == null ? null : RequestBody.create(bytes, mediaType));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$decorate$0(Request request, C58617zJ c58617zJ) {
        for (String str : request.headers().names()) {
            c58617zJ.EZpvd(str, request.header(str));
        }
        c58617zJ.EZpvd("Host", request.url().url().getHost());
        return null;
    }

    private byte[] getBytes(RequestBody requestBody) throws ApiException.ApiAuthException {
        ByteArrayOutputStream byteArrayOutputStream;
        Buffer buffer;
        byte[] bArr;
        if (requestBody == null) {
            return "".getBytes();
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                buffer = new Buffer();
                requestBody.writeTo(buffer);
                bArr = new byte[4096];
            } finally {
            }
        } catch (IOException e) {
            throw new ApiException.ApiAuthException("Unable to calculate SigV4 signature for the request", e, "Check your application logs for details.");
        }
        while (true) {
            int i = buffer.inputStream().read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            throw new ApiException.ApiAuthException("Unable to calculate SigV4 signature for the request", e, "Check your application logs for details.");
        }
    }
}
