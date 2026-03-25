package com.okinc.wallet.hardware.api.onekey;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C57046yay;
import o.InterfaceC57039yar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyDevice implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OneKeyDevice> CREATOR = new Creator();
    private final String connectId;
    private final String deviceType;
    private final Map<String, EVMAddress> evmAddresses;
    private Features features;
    private final String id;
    private final String name;
    private PassphraseState passphraseState;

    public static final class Creator implements Parcelable.Creator<OneKeyDevice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneKeyDevice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            PassphraseState passphraseStateCreateFromParcel = parcel.readInt() == 0 ? null : PassphraseState.CREATOR.createFromParcel(parcel);
            Features featuresCreateFromParcel = parcel.readInt() != 0 ? Features.CREATOR.createFromParcel(parcel) : null;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), EVMAddress.CREATOR.createFromParcel(parcel));
            }
            return new OneKeyDevice(string, string2, string3, string4, passphraseStateCreateFromParcel, featuresCreateFromParcel, linkedHashMap, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneKeyDevice[] newArray(int i) {
            return new OneKeyDevice[i];
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.hardware.api.onekey.OneKeyDevice$getEvmAddress$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OneKeyDevice.this.getEvmAddress(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.hardware.api.onekey.OneKeyDevice$getFeatures$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17521(Continuation<? super C17521> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OneKeyDevice.this.getFeatures(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.hardware.api.onekey.OneKeyDevice$getPassphraseState$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17531(Continuation<? super C17531> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OneKeyDevice.this.getPassphraseState(null, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 com.okinc.wallet.hardware.api.onekey.PassphraseState)
  (r6v0 com.okinc.wallet.hardware.api.onekey.Features)
  (r7v0 java.util.Map)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.PassphraseState, com.okinc.wallet.hardware.api.onekey.Features, java.util.Map<java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMAddress>):void (m)] call: com.okinc.wallet.hardware.api.onekey.OneKeyDevice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.PassphraseState, com.okinc.wallet.hardware.api.onekey.Features, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OneKeyDevice(String str, String str2, String str3, String str4, PassphraseState passphraseState, Features features, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, passphraseState, features, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConnectId() {
        return this.connectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.connectId);
        parcel.writeString(this.deviceType);
        PassphraseState passphraseState = this.passphraseState;
        if (passphraseState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passphraseState.writeToParcel(parcel, i);
        }
        Features features = this.features;
        if (features == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            features.writeToParcel(parcel, i);
        }
        Map<String, EVMAddress> map = this.evmAddresses;
        parcel.writeInt(map.size());
        for (Map.Entry<String, EVMAddress> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    private OneKeyDevice(String str, String str2, String str3, String str4, PassphraseState passphraseState, Features features, Map<String, EVMAddress> map) {
        this.id = str;
        this.name = str2;
        this.connectId = str3;
        this.deviceType = str4;
        this.passphraseState = passphraseState;
        this.features = features;
        this.evmAddresses = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:com.okinc.wallet.hardware.api.onekey.PassphraseState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.PassphraseState) : (r15v0 com.okinc.wallet.hardware.api.onekey.PassphraseState))
  (wrap:com.okinc.wallet.hardware.api.onekey.Features:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.Features) : (r16v0 com.okinc.wallet.hardware.api.onekey.Features))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:34) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.PassphraseState, com.okinc.wallet.hardware.api.onekey.Features, java.util.Map<java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMAddress>):void (m)] (LINE:27) call: com.okinc.wallet.hardware.api.onekey.OneKeyDevice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.PassphraseState, com.okinc.wallet.hardware.api.onekey.Features, java.util.Map):void type: THIS */
    public /* synthetic */ OneKeyDevice(String str, String str2, String str3, String str4, PassphraseState passphraseState, Features features, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : passphraseState, (i & 32) != 0 ? null : features, (i & 64) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneKeyDevice(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this(str, str2, str3, str4, null, null, new LinkedHashMap());
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPassphraseState(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull Continuation<? super PassphraseState> continuation) throws Throwable {
        C17531 c17531;
        OneKeyDevice oneKeyDevice;
        if (continuation instanceof C17531) {
            c17531 = (C17531) continuation;
            int i = c17531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17531.label = i - Integer.MIN_VALUE;
            } else {
                c17531 = new C17531(continuation);
            }
        }
        Object objKWHzl = c17531.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17531.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            PassphraseState passphraseState = this.passphraseState;
            if (passphraseState != null) {
                return passphraseState;
            }
            String str = this.connectId;
            c17531.L$0 = this;
            c17531.label = 1;
            objKWHzl = interfaceC57039yar.KWHzl(str, c17531);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            oneKeyDevice = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oneKeyDevice = (OneKeyDevice) c17531.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        oneKeyDevice.passphraseState = (PassphraseState) objKWHzl;
        return objKWHzl;
    }

    public static /* synthetic */ Object getFeatures$default(OneKeyDevice oneKeyDevice, InterfaceC57039yar interfaceC57039yar, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return oneKeyDevice.getFeatures(interfaceC57039yar, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFeatures(@NotNull InterfaceC57039yar interfaceC57039yar, boolean z, @NotNull Continuation<? super Features> continuation) throws Throwable {
        C17521 c17521;
        OneKeyDevice oneKeyDevice;
        if (continuation instanceof C17521) {
            c17521 = (C17521) continuation;
            int i = c17521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17521.label = i - Integer.MIN_VALUE;
            } else {
                c17521 = new C17521(continuation);
            }
        }
        Object objCopydefault = c17521.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = c17521.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            Features features = this.features;
            if (features != null && z) {
                return features;
            }
            String str = this.connectId;
            c17521.L$0 = this;
            c17521.label = 1;
            objCopydefault = interfaceC57039yar.copydefault(str, c17521);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            oneKeyDevice = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oneKeyDevice = (OneKeyDevice) c17521.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        oneKeyDevice.features = (Features) objCopydefault;
        return objCopydefault;
    }

    public final void clearCachedResults() {
        this.features = null;
        this.evmAddresses.clear();
    }

    public static /* synthetic */ Object getEvmAddress$default(OneKeyDevice oneKeyDevice, InterfaceC57039yar interfaceC57039yar, String str, EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            commonParams = null;
        }
        return oneKeyDevice.getEvmAddress(interfaceC57039yar, str, eVMGetAddressParams, commonParams, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEvmAddress(@NotNull InterfaceC57039yar interfaceC57039yar, String str, @NotNull EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, @NotNull Continuation<? super EVMAddress> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        OneKeyDevice oneKeyDevice;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objCopydefault = anonymousClass12.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = anonymousClass12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            String path = eVMGetAddressParams.getPath().getPath();
            if (path == null) {
                List<Long> segments = eVMGetAddressParams.getPath().getSegments();
                path = segments != null ? C57046yay.KWHzl(segments) : null;
                if (path == null) {
                    throw new OneKeyException(OneKeySDKError.CallMethodInvalidParameter, "Not a valid path");
                }
            }
            EVMAddress eVMAddress = this.evmAddresses.get(path);
            if (eVMAddress != null) {
                return eVMAddress;
            }
            String str2 = this.connectId;
            if (str == null) {
                str = "";
            }
            anonymousClass12.L$0 = this;
            anonymousClass12.label = 1;
            objCopydefault = interfaceC57039yar.copydefault(str2, str, eVMGetAddressParams, commonParams, anonymousClass12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            oneKeyDevice = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oneKeyDevice = (OneKeyDevice) anonymousClass12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        EVMAddress eVMAddress2 = (EVMAddress) objCopydefault;
        oneKeyDevice.evmAddresses.put(eVMAddress2.OLrzqt(), eVMAddress2);
        return objCopydefault;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(OneKeyDevice.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        OneKeyDevice oneKeyDevice = (OneKeyDevice) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) oneKeyDevice.id) && Intrinsics.EZpvd((Object) this.name, (Object) oneKeyDevice.name) && Intrinsics.EZpvd((Object) this.connectId, (Object) oneKeyDevice.connectId) && Intrinsics.EZpvd((Object) this.deviceType, (Object) oneKeyDevice.deviceType) && Intrinsics.EZpvd(this.passphraseState, oneKeyDevice.passphraseState) && Intrinsics.EZpvd(this.features, oneKeyDevice.features) && Intrinsics.EZpvd(this.evmAddresses, oneKeyDevice.evmAddresses);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.connectId.hashCode();
        int iHashCode4 = this.deviceType.hashCode();
        PassphraseState passphraseState = this.passphraseState;
        int iHashCode5 = passphraseState != null ? passphraseState.hashCode() : 0;
        Features features = this.features;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (features != null ? features.hashCode() : 0)) * 31) + this.evmAddresses.hashCode();
    }

    public String toString() {
        return "OneKeyDevice(id='" + this.id + "', name='" + this.name + "', connectId='" + this.connectId + "', deviceType='" + this.deviceType + "', passphraseState=" + this.passphraseState + ", features=" + this.features + ", evmAddresses=" + this.evmAddresses + ")";
    }
}
