package com.okinc.business.defi.biz.rpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.rpc.RPCManager;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC58185ywX;
import o.C12764ctD;
import o.C13927dbn;
import o.C13933dbt;
import o.C33527myD;
import o.C43393roT;
import o.C43423rox;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes4.dex */
public final class RPCManager {
    public static final RPCManager EZpvd = new RPCManager();

    private RPCManager() {
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(@NotNull final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(ActionBar.Companion.OLrzqt().EZpvd("FIRST_CACHE", RemoteMessageConst.DEFAULT_TTL), null, 1, null)), (Function1) null, 1, (Object) null);
        final Function1 function13 = new Function1() { // from class: o.dbI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RPCManager.EZpvd(function12, str, function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                RPCManager.copydefault(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dbN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RPCManager.EZpvd(function12, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                RPCManager.gEmmrt(function14, obj);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, String str, Function1 function12, List list) {
        Intrinsics.copydefault(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RpcUrlObj rpcUrlObj = (RpcUrlObj) it.next();
            if (Intrinsics.EZpvd((Object) rpcUrlObj.getChainId(), (Object) str)) {
                if (function12 != null) {
                    function12.invoke(rpcUrlObj.getRpcSendPath());
                }
                return Unit.INSTANCE;
            }
        }
        if (function1 != null) {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, Throwable th) {
        if (function1 != null) {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.defi.biz.rpc.RPCManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUpdateRpcUrlLoader$default(RPCManager rPCManager, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        rPCManager.copydefault((Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12);
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(ActionBar.Companion.OLrzqt().EZpvd("FIRST_NETWORK", RemoteMessageConst.DEFAULT_TTL), null, 1, null)), (Function1) null, 1, (Object) null);
        final Function1 function13 = new Function1() { // from class: o.dbL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RPCManager.AEQbTJ(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                RPCManager.valueOf(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dbP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RPCManager.copydefault(function12, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dbQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                RPCManager.djBIcL(function14, obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function1 function1, List list) {
        String strAEQbTJ = C12764ctD.OLrzqt.AEQbTJ(new ArrayList(list));
        if (strAEQbTJ != null && function1 != null) {
            function1.invoke(strAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null && function1 != null) {
            function1.invoke(localizedMessage);
        }
        return Unit.INSTANCE;
    }

    public interface ActionBar {
        public static final C0248ActionBar Companion = C0248ActionBar.OLrzqt;

        @GET("/priapi/v1/wallet/rpc/url")
        AbstractC58185ywX<ResponseData<List<RpcUrlObj>>> EZpvd(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

        /* JADX INFO: renamed from: com.okinc.business.defi.biz.rpc.RPCManager$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0248ActionBar {
            public static final /* synthetic */ C0248ActionBar OLrzqt = new C0248ActionBar();
            public static final InterfaceC56387yDm<C13927dbn> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dbT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return RPCManager.ActionBar.C0248ActionBar.AEQbTJ();
                }
            });

            private C0248ActionBar() {
            }

            public static final C13927dbn AEQbTJ() {
                return new C13927dbn();
            }

            public final C13927dbn KWHzl() {
                return AEQbTJ.getValue();
            }

            public final ActionBar OLrzqt() {
                return (ActionBar) C43393roT.EZpvd(C56524yIo.AEQbTJ(ActionBar.class), KWHzl());
            }
        }
    }

    @Serializable
    public static final class RpcUrlObj implements Parcelable {
        private String chainId;
        private String rpcSendPath;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<RpcUrlObj> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<RpcUrlObj> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RpcUrlObj createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RpcUrlObj(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RpcUrlObj[] newArray(int i) {
                return new RpcUrlObj[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RpcUrlObj() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RpcUrlObj copy$default(RpcUrlObj rpcUrlObj, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rpcUrlObj.chainId;
            }
            if ((i & 2) != 0) {
                str2 = rpcUrlObj.rpcSendPath;
            }
            return rpcUrlObj.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.rpcSendPath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RpcUrlObj copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new RpcUrlObj(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RpcUrlObj)) {
                return false;
            }
            RpcUrlObj rpcUrlObj = (RpcUrlObj) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) rpcUrlObj.chainId) && Intrinsics.EZpvd((Object) this.rpcSendPath, (Object) rpcUrlObj.rpcSendPath);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRpcSendPath() {
            return this.rpcSendPath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.chainId.hashCode() * 31) + this.rpcSendPath.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChainId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.chainId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRpcSendPath(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.rpcSendPath = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RpcUrlObj(chainId=" + this.chainId + ", rpcSendPath=" + this.rpcSendPath + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.chainId);
            parcel.writeString(this.rpcSendPath);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.rpc.RPCManager.RpcUrlObj.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RpcUrlObj> serializer() {
                return RPCManager$RpcUrlObj$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ RpcUrlObj(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.chainId = "";
            } else {
                this.chainId = str;
            }
            if ((i & 2) == 0) {
                this.rpcSendPath = "";
            } else {
                this.rpcSendPath = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RpcUrlObj rpcUrlObj, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rpcUrlObj.chainId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, rpcUrlObj.chainId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) rpcUrlObj.rpcSendPath, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rpcUrlObj.rpcSendPath);
        }

        public RpcUrlObj(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.chainId = str;
            this.rpcSendPath = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:76) call: com.okinc.business.defi.biz.rpc.RPCManager.RpcUrlObj.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ RpcUrlObj(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }
}
