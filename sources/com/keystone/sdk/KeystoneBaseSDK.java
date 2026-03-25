package com.keystone.sdk;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.keystone.module.DecodeResult;
import com.keystone.module.KeystoneError;
import com.keystone.module.NativeUR;
import com.sparrowwallet.hummingbird.ResultType;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.URDecoder;
import com.sparrowwallet.hummingbird.UREncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import o.C56403yEb;
import o.C59454zhO;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class KeystoneBaseSDK {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private final KeystoneNativeSDK f75native = new KeystoneNativeSDK();
    private URDecoder urDecoder = new URDecoder();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ResultType.values().length];
            iArr[ResultType.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneNativeSDK getNative$library_release() {
        return this.f75native;
    }

    public final byte[] decodeHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("HexString must have an even length".toString());
        }
        List listAYXKKw = C59454zhO.AYXKKw((CharSequence) str, 2);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        Iterator it = listAYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
        }
        return CollectionsKt___CollectionsKt.DbNXlk(arrayList);
    }

    public final String toHexString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return yDV.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.keystone.sdk.KeystoneBaseSDK.toHexString.1
            public final CharSequence invoke(byte b) {
                String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
    }

    public final <T> T handleError(@NotNull String str, T t) throws Exception {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            KeystoneError keystoneError = (KeystoneError) new Gson().fromJson(str, (Class) KeystoneError.class);
            if (keystoneError.getError() != null) {
                throw new Exception(keystoneError.getError());
            }
        } catch (JsonSyntaxException unused) {
        }
        return t;
    }

    public final UREncoder encodeQR(@NotNull NativeUR nativeUR) {
        Intrinsics.checkNotNullParameter(nativeUR, "");
        return new UREncoder(new UR(nativeUR.getType(), decodeHex(nativeUR.getCbor())), KeystoneSDK.Companion.getMaxFragmentLen(), 10, 0L);
    }

    public final DecodeResult decodeQR(@NotNull String str) throws Exception {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zReceivePart = this.urDecoder.receivePart(str);
        if (this.urDecoder.getResult() == null) {
            if (zReceivePart) {
                return new DecodeResult((int) (this.urDecoder.getEstimatedPercentComplete() * ((double) 100)), null, 2, 0 == true ? 1 : 0);
            }
            resetQRDecoder();
            throw new Exception("Unexpected QR code");
        }
        ResultType resultType = this.urDecoder.getResult().type;
        if (resultType != null && WhenMappings.$EnumSwitchMapping$0[resultType.ordinal()] == 1) {
            return new DecodeResult(100, this.urDecoder.getResult().ur);
        }
        resetQRDecoder();
        throw new Exception("Invalid QR code");
    }

    public final void resetQRDecoder() {
        this.urDecoder = new URDecoder();
    }

    public static /* synthetic */ String toJson$default(KeystoneBaseSDK keystoneBaseSDK, Object obj, FieldNamingPolicy fieldNamingPolicy, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toJson");
        }
        if ((i & 2) != 0) {
            fieldNamingPolicy = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
        }
        return keystoneBaseSDK.toJson(obj, fieldNamingPolicy);
    }

    public final String toJson(@NotNull Object obj, @NotNull FieldNamingPolicy fieldNamingPolicy) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(fieldNamingPolicy, "");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(fieldNamingPolicy);
        String json = gsonBuilder.create().toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public static /* synthetic */ Object fromJson$default(KeystoneBaseSDK keystoneBaseSDK, String str, Class cls, FieldNamingPolicy fieldNamingPolicy, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromJson");
        }
        if ((i & 4) != 0) {
            fieldNamingPolicy = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
        }
        return keystoneBaseSDK.fromJson(str, cls, fieldNamingPolicy);
    }

    public final <T> T fromJson(@NotNull String str, @NotNull Class<T> cls, @NotNull FieldNamingPolicy fieldNamingPolicy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(fieldNamingPolicy, "");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(fieldNamingPolicy);
        return (T) gsonBuilder.create().fromJson(str, (Class) cls);
    }

    public final long getTimestamp() {
        return System.currentTimeMillis();
    }
}
