package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.hardware.api.onekey.BTCAddress;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.BleFirmwareRelease;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.EVMAddress;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMGetMultipleAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignTypedDataParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignedTx;
import com.okinc.wallet.hardware.api.onekey.EthereumMessageSignature;
import com.okinc.wallet.hardware.api.onekey.Features;
import com.okinc.wallet.hardware.api.onekey.FirmwareRelease;
import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import com.okinc.wallet.hardware.api.onekey.PassphraseState;
import com.okinc.wallet.hardware.api.onekey.SignedTransaction;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$checkBLEFirmwareRelease$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$checkFirmwareRelease$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$connect$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$downloadJSBundle$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$ensureDeviceReady$2;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getBTCAddress$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getEVMAddress$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getFeatures$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getMultipleBTCAddresses$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getMultipleEVMAddresses$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$getPassphraseState$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signBTCTransaction$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMEIP712Message$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMMessage$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMTransaction$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1;
import com.okinc.wallet.hardware.impl.onekey.OneKeyManagerImpl$signEVMTypedData$1;
import com.okinc.wallet.hardware.impl.onekey.data.CheckBLEFirmwareRelease;
import com.okinc.wallet.hardware.impl.onekey.data.CheckFirmwareRelease;
import com.okinc.wallet.hardware.impl.onekey.data.GetBTCAddress;
import com.okinc.wallet.hardware.impl.onekey.data.GetEVMAddress;
import com.okinc.wallet.hardware.impl.onekey.data.GetFeatures;
import com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses;
import com.okinc.wallet.hardware.impl.onekey.data.GetMultipleEVMAddresses;
import com.okinc.wallet.hardware.impl.onekey.data.GetPassphraseState;
import com.okinc.wallet.hardware.impl.onekey.data.Response;
import com.okinc.wallet.hardware.impl.onekey.data.SignBTCTransaction;
import com.okinc.wallet.hardware.impl.onekey.data.SignEVMEIP712Message;
import com.okinc.wallet.hardware.impl.onekey.data.SignEVMMessage;
import com.okinc.wallet.hardware.impl.onekey.data.SignEVMTransaction;
import com.okinc.wallet.hardware.impl.onekey.data.SignEVMTypedData;
import com.okinc.wallet.hardware.impl.onekey.data.Success;
import com.okinc.wallet.hardware.impl.onekey.data.Unsuccessful;
import com.okinc.wallet.hardware.impl.onekey.handler.PromptUIRequestHandler;
import com.okinc.wallet.hardware.impl.onekey.handler.SendHandler;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$nativeCall$2;
import com.welie.blessed.WriteType;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC48864udi;
import o.C57003yaH;
import o.C57149ycv;
import o.InterfaceC57039yar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57138yck implements InterfaceC57039yar, C57003yaH.Application {
    public final android.content.Context AEQbTJ;
    public final C57003yaH AYXKKw;
    public final C57026yae AhwBna;
    public final java.util.List<OneKeyDevice> AkhnZx;
    public final Json AuCTel;
    public final CopyOnWriteArraySet<TaskDescription> DbNXlk;
    public final CopyOnWriteArraySet<StateListAnimator> djBIcL;
    public final android.os.Handler ejfBZ;
    public boolean fARcdN;
    public final CopyOnWriteArraySet<InterfaceC57039yar.TaskDescription> fIwbmz;
    public long fJNWhG;
    public final C57149ycv fetchVPNInfo;
    public final CopyOnWriteArraySet<InterfaceC57039yar.ActionBar> gEmmrt;
    public final java.lang.Runnable getFieldNames;
    public final C48872udq isConnected;
    public final CopyOnWriteArraySet<InterfaceC57025yad> valueOf;
    public final CopyOnWriteArraySet<InterfaceC57039yar.Application> values;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final UUID OLrzqt = UUID.fromString("00000003-0000-1000-8000-00805f9b34fb");
    public static final UUID copydefault = UUID.fromString("00000002-0000-1000-8000-00805f9b34fb");
    public static final UUID KWHzl = UUID.fromString("00000001-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: o.yck$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(@NotNull C58160yvz c58160yvz);

        void OLrzqt(@NotNull C58160yvz c58160yvz);
    }

    /* JADX INFO: renamed from: o.yck$TaskDescription */
    public interface TaskDescription {
        void EZpvd(@NotNull java.lang.String str);

        void KWHzl(@NotNull java.lang.String str);

        void OLrzqt(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57039yar
    public java.util.List<OneKeyDevice> OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57149ycv djBIcL() {
        return this.fetchVPNInfo;
    }

    public C57138yck(@NotNull android.content.Context context, @NotNull C57003yaH c57003yaH, @NotNull C48872udq c48872udq, @NotNull C57026yae c57026yae, @NotNull Json json, @NotNull android.os.Handler handler) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c57003yaH, "");
        Intrinsics.checkNotNullParameter(c48872udq, "");
        Intrinsics.checkNotNullParameter(c57026yae, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(handler, "");
        this.AEQbTJ = context;
        this.AYXKKw = c57003yaH;
        this.isConnected = c48872udq;
        this.AhwBna = c57026yae;
        this.AuCTel = json;
        this.ejfBZ = handler;
        c57003yaH.AEQbTJ(this);
        java.util.List listGEmmrt = yDY.gEmmrt(new SendHandler(this), new PromptUIRequestHandler(this));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listGEmmrt, 10)), 16));
        for (java.lang.Object obj : listGEmmrt) {
            linkedHashMap.put(((AbstractC57148ycu) obj).OLrzqt(), obj);
        }
        this.fetchVPNInfo = new C57149ycv(context, linkedHashMap, null, null, null, 28, null);
        this.fIwbmz = new CopyOnWriteArraySet<>();
        this.valueOf = new CopyOnWriteArraySet<>();
        this.djBIcL = new CopyOnWriteArraySet<>();
        this.DbNXlk = new CopyOnWriteArraySet<>();
        this.gEmmrt = new CopyOnWriteArraySet<>();
        this.values = new CopyOnWriteArraySet<>();
        this.getFieldNames = new java.lang.Runnable() { // from class: o.ycp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57138yck.copydefault(this.KWHzl);
            }
        };
        this.AkhnZx = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.yck$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yck.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final UUID AEQbTJ() {
            return C57138yck.OLrzqt;
        }

        public final UUID OLrzqt() {
            return C57138yck.copydefault;
        }

        public final UUID KWHzl() {
            return C57138yck.KWHzl;
        }
    }

    public static final void copydefault(C57138yck c57138yck) {
        c57138yck.fARcdN = false;
        c57138yck.AYXKKw.AEQbTJ();
    }

    @Override // o.InterfaceC57039yar
    public void KWHzl(@NotNull InterfaceC57039yar.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.fIwbmz.add(taskDescription);
    }

    @Override // o.InterfaceC57039yar
    public void OLrzqt(@NotNull InterfaceC57039yar.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.fIwbmz.remove(taskDescription);
    }

    @Override // o.InterfaceC57039yar
    public void copydefault(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        this.valueOf.add(interfaceC57025yad);
    }

    @Override // o.InterfaceC57039yar
    public void AEQbTJ(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        this.valueOf.remove(interfaceC57025yad);
    }

    @Override // o.InterfaceC57039yar
    public void AEQbTJ(@NotNull InterfaceC57039yar.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.values.add(application);
    }

    @Override // o.InterfaceC57039yar
    public void KWHzl(@NotNull InterfaceC57039yar.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.values.remove(application);
    }

    public final void AEQbTJ(StateListAnimator stateListAnimator) {
        this.djBIcL.add(stateListAnimator);
    }

    public final void KWHzl(StateListAnimator stateListAnimator) {
        this.djBIcL.remove(stateListAnimator);
    }

    public final void copydefault(TaskDescription taskDescription) {
        this.DbNXlk.add(taskDescription);
    }

    public final void OLrzqt(TaskDescription taskDescription) {
        this.DbNXlk.remove(taskDescription);
    }

    @Override // o.InterfaceC57039yar
    public void AEQbTJ(@NotNull InterfaceC57039yar.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.gEmmrt.add(actionBar);
    }

    @Override // o.InterfaceC57039yar
    public void EZpvd(@NotNull InterfaceC57039yar.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.gEmmrt.remove(actionBar);
    }

    @Override // o.InterfaceC57039yar
    public void KWHzl(@NotNull OneKeyDevice oneKeyDevice) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        this.AYXKKw.EZpvd(new BluetoothDeviceModel(oneKeyDevice.getName(), oneKeyDevice.getConnectId(), ""));
    }

    @Override // o.InterfaceC57039yar
    public OneKeyDevice OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BluetoothDeviceModel bluetoothDeviceModelCopydefault = this.AYXKKw.copydefault(str);
        java.lang.String name = bluetoothDeviceModelCopydefault.getName();
        return EZpvd(name != null ? name : "", bluetoothDeviceModelCopydefault.getAddress());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [221=4] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[LOOP:1: B:39:0x00b0->B:41:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$downloadJSBundle$1 oneKeyManagerImpl$downloadJSBundle$1;
        C57138yck c57138yck;
        java.util.Iterator<T> it;
        if (continuation instanceof OneKeyManagerImpl$downloadJSBundle$1) {
            oneKeyManagerImpl$downloadJSBundle$1 = (OneKeyManagerImpl$downloadJSBundle$1) continuation;
            int i = oneKeyManagerImpl$downloadJSBundle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$downloadJSBundle$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$downloadJSBundle$1 = new OneKeyManagerImpl$downloadJSBundle$1(this, continuation);
            }
        }
        java.lang.Object result = oneKeyManagerImpl$downloadJSBundle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$downloadJSBundle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(result);
            try {
                java.util.Iterator<T> it2 = this.values.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC57039yar.Application) it2.next()).OLrzqt();
                }
                oneKeyManagerImpl$downloadJSBundle$1.L$0 = this;
                oneKeyManagerImpl$downloadJSBundle$1.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$downloadJSBundle$1), 1);
                cancellableContinuationImpl.initCancellability();
                pUU.KWHzl("OneKeyManager", "downloadJSBundle start");
                this.isConnected.OLrzqt("file_wallet_hardware_oneKey_js", new Fragment(cancellableContinuationImpl));
                result = cancellableContinuationImpl.getResult();
                if (result == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(oneKeyManagerImpl$downloadJSBundle$1);
                }
                if (result == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c57138yck = this;
                it = c57138yck.values.iterator();
                while (it.hasNext()) {
                    ((InterfaceC57039yar.Application) it.next()).KWHzl();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c57138yck = (C57138yck) oneKeyManagerImpl$downloadJSBundle$1.L$0;
            try {
                C56391yDq.AEQbTJ(result);
            } catch (java.lang.Throwable th2) {
                th = th2;
                it = c57138yck.values.iterator();
                while (it.hasNext()) {
                }
                throw th;
            }
        }
        boolean zBooleanValue = ((java.lang.Boolean) result).booleanValue();
        java.util.Iterator<T> it3 = c57138yck.values.iterator();
        while (it3.hasNext()) {
            ((InterfaceC57039yar.Application) it3.next()).KWHzl();
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX INFO: renamed from: o.yck$Fragment */
    public static final class Fragment implements AbstractC48864udi.ActionBar {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void AEQbTJ(long j, long j2) {
            AbstractC48864udi.ActionBar.C0977ActionBar.OLrzqt(this, j, j2);
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C57138yck.this.djBIcL().KWHzl(new java.io.File(str, "onekey_sdk.js"));
            if (this.copydefault.isActive()) {
                CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
            }
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            java.lang.String strAEQbTJ = C57138yck.this.isConnected.AEQbTJ("file_wallet_hardware_oneKey_js");
            if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
                C57138yck.this.djBIcL().KWHzl(new java.io.File(strAEQbTJ, "onekey_sdk.js"));
                if (this.copydefault.isActive()) {
                    CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.copydefault;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
                    return;
                }
                return;
            }
            if (this.copydefault.isActive()) {
                CancellableContinuation<java.lang.Boolean> cancellableContinuation2 = this.copydefault;
                Result.Application application2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.FALSE));
            }
        }
    }

    public boolean valueOf() {
        return this.isConnected.AEQbTJ("file_wallet_hardware_oneKey_js") != null;
    }

    @Override // o.InterfaceC57039yar
    public java.lang.Object copydefault(@NotNull OneKeyDevice oneKeyDevice, @NotNull Continuation<? super OneKeyDevice> continuation) throws OneKeyException {
        if (!this.AhwBna.EZpvd(this.AEQbTJ)) {
            throw new OneKeyException(OneKeySDKError.BluetoothError, null, 2, null);
        }
        return SupervisorKt.supervisorScope(new OneKeyManagerImpl$ensureDeviceReady$2(this, oneKeyDevice, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Features> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getFeatures$1 oneKeyManagerImpl$getFeatures$1;
        InterfaceC57144ycq getFeatures;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str2;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str3;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str4;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getFeatures$1) {
            oneKeyManagerImpl$getFeatures$1 = (OneKeyManagerImpl$getFeatures$1) continuation;
            int i = oneKeyManagerImpl$getFeatures$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getFeatures$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getFeatures$1 = new OneKeyManagerImpl$getFeatures$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getFeatures$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getFeatures$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getFeatures = new GetFeatures(str);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str2 = "getFeatures";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getFeatures$1.L$0 = this;
                oneKeyManagerImpl$getFeatures$1.L$1 = "getFeatures";
                oneKeyManagerImpl$getFeatures$1.L$2 = getFeatures;
                oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv;
                oneKeyManagerImpl$getFeatures$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$getFeatures$1.label = 1;
                if (job.join(oneKeyManagerImpl$getFeatures$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=getFeatures, params=" + getFeatures);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getFeatures$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getFeatures$1.L$3;
            getFeatures = (InterfaceC57144ycq) oneKeyManagerImpl$getFeatures$1.L$2;
            str2 = (java.lang.String) oneKeyManagerImpl$getFeatures$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$getFeatures$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getFeatures$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getFeatures$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getFeatures$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getFeatures$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getFeatures$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1 oneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1 = new OneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getFeatures$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getFeatures$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$getFeatures$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1, oneKeyManagerImpl$getFeatures$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str5 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getFeatures$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getFeatures$1.L$5 = webView;
            oneKeyManagerImpl$getFeatures$1.L$6 = str5;
            oneKeyManagerImpl$getFeatures$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getFeatures$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str6 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str3 + "\", " + str5 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str6);
            webView.evaluateJavascript(str6, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = null;
            oneKeyManagerImpl$getFeatures$1.L$3 = null;
            oneKeyManagerImpl$getFeatures$1.L$4 = null;
            oneKeyManagerImpl$getFeatures$1.L$5 = null;
            oneKeyManagerImpl$getFeatures$1.L$6 = null;
            oneKeyManagerImpl$getFeatures$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getFeatures$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getFeatures$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getFeatures$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getFeatures$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getFeatures$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getFeatures$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getFeatures$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str52 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getFeatures$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getFeatures$1.L$5 = webView;
            oneKeyManagerImpl$getFeatures$1.L$6 = str52;
            oneKeyManagerImpl$getFeatures$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getFeatures$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str62 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str3 + "\", " + str52 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str62);
            webView.evaluateJavascript(str62, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getFeatures$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = null;
            oneKeyManagerImpl$getFeatures$1.L$3 = null;
            oneKeyManagerImpl$getFeatures$1.L$4 = null;
            oneKeyManagerImpl$getFeatures$1.L$5 = null;
            oneKeyManagerImpl$getFeatures$1.L$6 = null;
            oneKeyManagerImpl$getFeatures$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getFeatures$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) oneKeyManagerImpl$getFeatures$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$getFeatures$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str4 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (Features) json.decodeFromJsonElement(Features.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str4 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str4 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getFeatures$1.L$3;
            java.lang.String str7 = (java.lang.String) oneKeyManagerImpl$getFeatures$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$getFeatures$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str3 = str7;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getFeatures$1.L$1 = str3;
            oneKeyManagerImpl$getFeatures$1.L$2 = null;
            oneKeyManagerImpl$getFeatures$1.L$3 = null;
            oneKeyManagerImpl$getFeatures$1.L$4 = null;
            oneKeyManagerImpl$getFeatures$1.L$5 = null;
            oneKeyManagerImpl$getFeatures$1.L$6 = null;
            oneKeyManagerImpl$getFeatures$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getFeatures$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str4 = str3;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getFeatures.getConnectId();
        oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck;
        oneKeyManagerImpl$getFeatures$1.L$1 = str2;
        oneKeyManagerImpl$getFeatures$1.L$2 = getFeatures;
        oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv;
        oneKeyManagerImpl$getFeatures$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getFeatures$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getFeatures$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getFeatures;
        str3 = str2;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1 oneKeyManagerImpl$getFeatures$$inlined$callJavaScript$12 = new OneKeyManagerImpl$getFeatures$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getFeatures$1.L$0 = c57138yck2;
        oneKeyManagerImpl$getFeatures$1.L$1 = str3;
        oneKeyManagerImpl$getFeatures$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$getFeatures$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getFeatures$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$getFeatures$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$getFeatures$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getFeatures$$inlined$callJavaScript$12, oneKeyManagerImpl$getFeatures$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super PassphraseState> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getPassphraseState$1 oneKeyManagerImpl$getPassphraseState$1;
        InterfaceC57144ycq getPassphraseState;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str2;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str3;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str4;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getPassphraseState$1) {
            oneKeyManagerImpl$getPassphraseState$1 = (OneKeyManagerImpl$getPassphraseState$1) continuation;
            int i = oneKeyManagerImpl$getPassphraseState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getPassphraseState$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getPassphraseState$1 = new OneKeyManagerImpl$getPassphraseState$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getPassphraseState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getPassphraseState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getPassphraseState = new GetPassphraseState(str);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str2 = "getPassphraseState";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getPassphraseState$1.L$0 = "getPassphraseState";
                oneKeyManagerImpl$getPassphraseState$1.L$1 = getPassphraseState;
                oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv;
                oneKeyManagerImpl$getPassphraseState$1.L$3 = webViewCopydefault;
                oneKeyManagerImpl$getPassphraseState$1.label = 1;
                if (job.join(oneKeyManagerImpl$getPassphraseState$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=getPassphraseState, params=" + getPassphraseState);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getPassphraseState$1.L$3;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getPassphraseState$1.L$2;
            getPassphraseState = (InterfaceC57144ycq) oneKeyManagerImpl$getPassphraseState$1.L$1;
            str2 = (java.lang.String) oneKeyManagerImpl$getPassphraseState$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getPassphraseState$1.L$3;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getPassphraseState$1.L$2;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getPassphraseState$1.L$1;
            str3 = (java.lang.String) oneKeyManagerImpl$getPassphraseState$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1 oneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1 = new OneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = interfaceC57144ycq;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv2;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = webViewCopydefault;
            oneKeyManagerImpl$getPassphraseState$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1, oneKeyManagerImpl$getPassphraseState$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str5 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = interfaceC57144ycq;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv3;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = webView;
            oneKeyManagerImpl$getPassphraseState$1.L$5 = str5;
            oneKeyManagerImpl$getPassphraseState$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getPassphraseState$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str6 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str3 + "\", " + str5 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str6);
            webView.evaluateJavascript(str6, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$5 = null;
            oneKeyManagerImpl$getPassphraseState$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getPassphraseState$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getPassphraseState$1.L$4;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getPassphraseState$1.L$3;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getPassphraseState$1.L$2;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getPassphraseState$1.L$1;
            str3 = (java.lang.String) oneKeyManagerImpl$getPassphraseState$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str52 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = interfaceC57144ycq;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv3;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = webView;
            oneKeyManagerImpl$getPassphraseState$1.L$5 = str52;
            oneKeyManagerImpl$getPassphraseState$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getPassphraseState$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str62 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str3 + "\", " + str52 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str62);
            webView.evaluateJavascript(str62, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getPassphraseState$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$5 = null;
            oneKeyManagerImpl$getPassphraseState$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getPassphraseState$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) oneKeyManagerImpl$getPassphraseState$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str4 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        JsonPrimitive jsonPrimitive = payload instanceof JsonPrimitive ? (JsonPrimitive) payload : null;
                        return new PassphraseState(jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null);
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str4 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str4 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getPassphraseState$1.L$2;
            java.lang.String str7 = (java.lang.String) oneKeyManagerImpl$getPassphraseState$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str3 = str7;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
            oneKeyManagerImpl$getPassphraseState$1.L$1 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$2 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$3 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$4 = null;
            oneKeyManagerImpl$getPassphraseState$1.L$5 = null;
            oneKeyManagerImpl$getPassphraseState$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getPassphraseState$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str4 = str3;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getPassphraseState.getConnectId();
        oneKeyManagerImpl$getPassphraseState$1.L$0 = str2;
        oneKeyManagerImpl$getPassphraseState$1.L$1 = getPassphraseState;
        oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv;
        oneKeyManagerImpl$getPassphraseState$1.L$3 = webViewCopydefault;
        oneKeyManagerImpl$getPassphraseState$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getPassphraseState$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getPassphraseState;
        str3 = str2;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1 oneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$12 = new OneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getPassphraseState$1.L$0 = str3;
        oneKeyManagerImpl$getPassphraseState$1.L$1 = interfaceC57144ycq;
        oneKeyManagerImpl$getPassphraseState$1.L$2 = c57149ycv2;
        oneKeyManagerImpl$getPassphraseState$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getPassphraseState$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getPassphraseState$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getPassphraseState$$inlined$callJavaScriptWithNullablePayload$12, oneKeyManagerImpl$getPassphraseState$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super BleFirmwareRelease> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$checkBLEFirmwareRelease$1 oneKeyManagerImpl$checkBLEFirmwareRelease$1;
        InterfaceC57144ycq checkBLEFirmwareRelease;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str2;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str3;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str4;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$checkBLEFirmwareRelease$1) {
            oneKeyManagerImpl$checkBLEFirmwareRelease$1 = (OneKeyManagerImpl$checkBLEFirmwareRelease$1) continuation;
            int i = oneKeyManagerImpl$checkBLEFirmwareRelease$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$checkBLEFirmwareRelease$1 = new OneKeyManagerImpl$checkBLEFirmwareRelease$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$checkBLEFirmwareRelease$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$checkBLEFirmwareRelease$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            checkBLEFirmwareRelease = new CheckBLEFirmwareRelease(str);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str2 = "checkBLEFirmwareRelease";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = this;
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = "checkBLEFirmwareRelease";
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = checkBLEFirmwareRelease;
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv;
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 1;
                if (job.join(oneKeyManagerImpl$checkBLEFirmwareRelease$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=checkBLEFirmwareRelease, params=" + checkBLEFirmwareRelease);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3;
            checkBLEFirmwareRelease = (InterfaceC57144ycq) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2;
            str2 = (java.lang.String) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1 oneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1 = new OneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1, oneKeyManagerImpl$checkBLEFirmwareRelease$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str5 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = webView;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$6 = str5;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$checkBLEFirmwareRelease$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str6 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str3 + "\", " + str5 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str6);
            webView.evaluateJavascript(str6, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$checkBLEFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str52 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = webView;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$6 = str52;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$checkBLEFirmwareRelease$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str62 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str3 + "\", " + str52 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str62);
            webView.evaluateJavascript(str62, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$checkBLEFirmwareRelease$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$checkBLEFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str4 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (BleFirmwareRelease) json.decodeFromJsonElement(BleFirmwareRelease.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str4 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str4 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3;
            java.lang.String str7 = (java.lang.String) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str3 = str7;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$checkBLEFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str4 = str3;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = checkBLEFirmwareRelease.getConnectId();
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str2;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = checkBLEFirmwareRelease;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$checkBLEFirmwareRelease$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = checkBLEFirmwareRelease;
        str3 = str2;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1 oneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$12 = new OneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$0 = c57138yck2;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$1 = str3;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$checkBLEFirmwareRelease$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$checkBLEFirmwareRelease$$inlined$callJavaScript$12, oneKeyManagerImpl$checkBLEFirmwareRelease$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super FirmwareRelease> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$checkFirmwareRelease$1 oneKeyManagerImpl$checkFirmwareRelease$1;
        InterfaceC57144ycq checkFirmwareRelease;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str2;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str3;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str4;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$checkFirmwareRelease$1) {
            oneKeyManagerImpl$checkFirmwareRelease$1 = (OneKeyManagerImpl$checkFirmwareRelease$1) continuation;
            int i = oneKeyManagerImpl$checkFirmwareRelease$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$checkFirmwareRelease$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$checkFirmwareRelease$1 = new OneKeyManagerImpl$checkFirmwareRelease$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$checkFirmwareRelease$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$checkFirmwareRelease$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            checkFirmwareRelease = new CheckFirmwareRelease(str);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str2 = "checkFirmwareRelease";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = this;
                oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = "checkFirmwareRelease";
                oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = checkFirmwareRelease;
                oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv;
                oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$checkFirmwareRelease$1.label = 1;
                if (job.join(oneKeyManagerImpl$checkFirmwareRelease$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=checkFirmwareRelease, params=" + checkFirmwareRelease);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$checkFirmwareRelease$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$checkFirmwareRelease$1.L$3;
            checkFirmwareRelease = (InterfaceC57144ycq) oneKeyManagerImpl$checkFirmwareRelease$1.L$2;
            str2 = (java.lang.String) oneKeyManagerImpl$checkFirmwareRelease$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$checkFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$checkFirmwareRelease$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$checkFirmwareRelease$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$checkFirmwareRelease$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$checkFirmwareRelease$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$checkFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1 oneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1 = new OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1, oneKeyManagerImpl$checkFirmwareRelease$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str5 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = webView;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$6 = str5;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$checkFirmwareRelease$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str6 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str3 + "\", " + str5 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str6);
            webView.evaluateJavascript(str6, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$checkFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$checkFirmwareRelease$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$checkFirmwareRelease$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$checkFirmwareRelease$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$checkFirmwareRelease$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$checkFirmwareRelease$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$checkFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str52 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = webView;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$6 = str52;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$checkFirmwareRelease$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str62 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str3 + "\", " + str52 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str62);
            webView.evaluateJavascript(str62, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$checkFirmwareRelease$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$checkFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) oneKeyManagerImpl$checkFirmwareRelease$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$checkFirmwareRelease$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str4 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (FirmwareRelease) json.decodeFromJsonElement(FirmwareRelease.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str4 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str4 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$checkFirmwareRelease$1.L$3;
            java.lang.String str7 = (java.lang.String) oneKeyManagerImpl$checkFirmwareRelease$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$checkFirmwareRelease$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str3 = str7;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.L$6 = null;
            oneKeyManagerImpl$checkFirmwareRelease$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$checkFirmwareRelease$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str4 = str3;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = checkFirmwareRelease.getConnectId();
        oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str2;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = checkFirmwareRelease;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$checkFirmwareRelease$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$checkFirmwareRelease$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = checkFirmwareRelease;
        str3 = str2;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1 oneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$12 = new OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$checkFirmwareRelease$1.L$0 = c57138yck2;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$1 = str3;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$checkFirmwareRelease$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$checkFirmwareRelease$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$12, oneKeyManagerImpl$checkFirmwareRelease$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BTCGetAddressParams bTCGetAddressParams, CommonParams commonParams, @NotNull Continuation<? super BTCAddress> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getBTCAddress$1 oneKeyManagerImpl$getBTCAddress$1;
        InterfaceC57144ycq getBTCAddress;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getBTCAddress$1) {
            oneKeyManagerImpl$getBTCAddress$1 = (OneKeyManagerImpl$getBTCAddress$1) continuation;
            int i = oneKeyManagerImpl$getBTCAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getBTCAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getBTCAddress$1 = new OneKeyManagerImpl$getBTCAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getBTCAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getBTCAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getBTCAddress = new GetBTCAddress(str, str2, bTCGetAddressParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "btcGetAddress";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getBTCAddress$1.L$0 = this;
                oneKeyManagerImpl$getBTCAddress$1.L$1 = "btcGetAddress";
                oneKeyManagerImpl$getBTCAddress$1.L$2 = getBTCAddress;
                oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv;
                oneKeyManagerImpl$getBTCAddress$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$getBTCAddress$1.label = 1;
                if (job.join(oneKeyManagerImpl$getBTCAddress$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=btcGetAddress, params=" + getBTCAddress);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getBTCAddress$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getBTCAddress$1.L$3;
            getBTCAddress = (InterfaceC57144ycq) oneKeyManagerImpl$getBTCAddress$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getBTCAddress$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$getBTCAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getBTCAddress$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getBTCAddress$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getBTCAddress$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getBTCAddress$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getBTCAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1 oneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1 = new OneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$getBTCAddress$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1, oneKeyManagerImpl$getBTCAddress$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = webView;
            oneKeyManagerImpl$getBTCAddress$1.L$6 = str6;
            oneKeyManagerImpl$getBTCAddress$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getBTCAddress$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$6 = null;
            oneKeyManagerImpl$getBTCAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getBTCAddress$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getBTCAddress$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getBTCAddress$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getBTCAddress$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getBTCAddress$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getBTCAddress$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getBTCAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = webView;
            oneKeyManagerImpl$getBTCAddress$1.L$6 = str62;
            oneKeyManagerImpl$getBTCAddress$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getBTCAddress$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getBTCAddress$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$6 = null;
            oneKeyManagerImpl$getBTCAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getBTCAddress$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$getBTCAddress$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$getBTCAddress$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            if (payload instanceof JsonArray) {
                                Json json = c57138yck3.AuCTel;
                                json.getSerializersModule();
                                return (BTCAddress) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) json.decodeFromJsonElement(new ArrayListSerializer(BTCAddress.Companion.serializer()), payload));
                            }
                            Json json2 = c57138yck3.AuCTel;
                            json2.getSerializersModule();
                            return (BTCAddress) json2.decodeFromJsonElement(BTCAddress.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getBTCAddress$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$getBTCAddress$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$getBTCAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
            oneKeyManagerImpl$getBTCAddress$1.L$2 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$3 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$4 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$5 = null;
            oneKeyManagerImpl$getBTCAddress$1.L$6 = null;
            oneKeyManagerImpl$getBTCAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getBTCAddress$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getBTCAddress.getConnectId();
        oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck;
        oneKeyManagerImpl$getBTCAddress$1.L$1 = str3;
        oneKeyManagerImpl$getBTCAddress$1.L$2 = getBTCAddress;
        oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv;
        oneKeyManagerImpl$getBTCAddress$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getBTCAddress$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getBTCAddress$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getBTCAddress;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1 oneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$12 = new OneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getBTCAddress$1.L$0 = c57138yck2;
        oneKeyManagerImpl$getBTCAddress$1.L$1 = str4;
        oneKeyManagerImpl$getBTCAddress$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$getBTCAddress$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getBTCAddress$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$getBTCAddress$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$getBTCAddress$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getBTCAddress$$inlined$callJavaScript$12, oneKeyManagerImpl$getBTCAddress$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<BTCGetAddressParams> list, CommonParams commonParams, @NotNull Continuation<? super java.util.List<BTCAddress>> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getMultipleBTCAddresses$1 oneKeyManagerImpl$getMultipleBTCAddresses$1;
        InterfaceC57144ycq getMultipleBTCAddresses;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getMultipleBTCAddresses$1) {
            oneKeyManagerImpl$getMultipleBTCAddresses$1 = (OneKeyManagerImpl$getMultipleBTCAddresses$1) continuation;
            int i = oneKeyManagerImpl$getMultipleBTCAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getMultipleBTCAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getMultipleBTCAddresses$1 = new OneKeyManagerImpl$getMultipleBTCAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getMultipleBTCAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getMultipleBTCAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getMultipleBTCAddresses = new GetMultipleBTCAddresses(str, str2, new GetMultipleBTCAddresses.Params(list), commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "btcGetMultipleAddresses";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = this;
                oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = "btcGetMultipleAddresses";
                oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = getMultipleBTCAddresses;
                oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv;
                oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 1;
                if (job.join(oneKeyManagerImpl$getMultipleBTCAddresses$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=btcGetMultipleAddresses, params=" + getMultipleBTCAddresses);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3;
            getMultipleBTCAddresses = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1 oneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1 = new OneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1, oneKeyManagerImpl$getMultipleBTCAddresses$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = webView;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$6 = str6;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getMultipleBTCAddresses$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getMultipleBTCAddresses$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = webView;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$6 = str62;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getMultipleBTCAddresses$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getMultipleBTCAddresses$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getMultipleBTCAddresses$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (java.util.List) json.decodeFromJsonElement(new ArrayListSerializer(BTCAddress.Companion.serializer()), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getMultipleBTCAddresses$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getMultipleBTCAddresses.getConnectId();
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str3;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = getMultipleBTCAddresses;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getMultipleBTCAddresses$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getMultipleBTCAddresses;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1 oneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$12 = new OneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$0 = c57138yck2;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$1 = str4;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$getMultipleBTCAddresses$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getMultipleBTCAddresses$$inlined$callJavaScript$12, oneKeyManagerImpl$getMultipleBTCAddresses$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams, @NotNull Continuation<? super SignedTransaction> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$signBTCTransaction$1 oneKeyManagerImpl$signBTCTransaction$1;
        InterfaceC57144ycq signBTCTransaction;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$signBTCTransaction$1) {
            oneKeyManagerImpl$signBTCTransaction$1 = (OneKeyManagerImpl$signBTCTransaction$1) continuation;
            int i = oneKeyManagerImpl$signBTCTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$signBTCTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$signBTCTransaction$1 = new OneKeyManagerImpl$signBTCTransaction$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$signBTCTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$signBTCTransaction$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            signBTCTransaction = new SignBTCTransaction(str, str2, bTCSignTransactionParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "btcSignTransaction";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$signBTCTransaction$1.L$0 = this;
                oneKeyManagerImpl$signBTCTransaction$1.L$1 = "btcSignTransaction";
                oneKeyManagerImpl$signBTCTransaction$1.L$2 = signBTCTransaction;
                oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv;
                oneKeyManagerImpl$signBTCTransaction$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$signBTCTransaction$1.label = 1;
                if (job.join(oneKeyManagerImpl$signBTCTransaction$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=btcSignTransaction, params=" + signBTCTransaction);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signBTCTransaction$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$signBTCTransaction$1.L$3;
            signBTCTransaction = (InterfaceC57144ycq) oneKeyManagerImpl$signBTCTransaction$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$signBTCTransaction$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$signBTCTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signBTCTransaction$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$signBTCTransaction$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signBTCTransaction$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signBTCTransaction$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signBTCTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1 oneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1 = new OneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$signBTCTransaction$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1, oneKeyManagerImpl$signBTCTransaction$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = webView;
            oneKeyManagerImpl$signBTCTransaction$1.L$6 = str6;
            oneKeyManagerImpl$signBTCTransaction$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signBTCTransaction$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$6 = null;
            oneKeyManagerImpl$signBTCTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$signBTCTransaction$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$signBTCTransaction$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$signBTCTransaction$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$signBTCTransaction$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signBTCTransaction$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signBTCTransaction$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signBTCTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = webView;
            oneKeyManagerImpl$signBTCTransaction$1.L$6 = str62;
            oneKeyManagerImpl$signBTCTransaction$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signBTCTransaction$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$signBTCTransaction$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$6 = null;
            oneKeyManagerImpl$signBTCTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$signBTCTransaction$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$signBTCTransaction$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$signBTCTransaction$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (SignedTransaction) json.decodeFromJsonElement(SignedTransaction.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$signBTCTransaction$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$signBTCTransaction$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$signBTCTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signBTCTransaction$1.L$2 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$3 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$4 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$5 = null;
            oneKeyManagerImpl$signBTCTransaction$1.L$6 = null;
            oneKeyManagerImpl$signBTCTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$signBTCTransaction$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = signBTCTransaction.getConnectId();
        oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck;
        oneKeyManagerImpl$signBTCTransaction$1.L$1 = str3;
        oneKeyManagerImpl$signBTCTransaction$1.L$2 = signBTCTransaction;
        oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv;
        oneKeyManagerImpl$signBTCTransaction$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$signBTCTransaction$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$signBTCTransaction$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = signBTCTransaction;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1 oneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$12 = new OneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$signBTCTransaction$1.L$0 = c57138yck2;
        oneKeyManagerImpl$signBTCTransaction$1.L$1 = str4;
        oneKeyManagerImpl$signBTCTransaction$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$signBTCTransaction$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$signBTCTransaction$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$signBTCTransaction$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$signBTCTransaction$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$signBTCTransaction$$inlined$callJavaScript$12, oneKeyManagerImpl$signBTCTransaction$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, @NotNull Continuation<? super EVMAddress> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getEVMAddress$1 oneKeyManagerImpl$getEVMAddress$1;
        InterfaceC57144ycq getEVMAddress;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getEVMAddress$1) {
            oneKeyManagerImpl$getEVMAddress$1 = (OneKeyManagerImpl$getEVMAddress$1) continuation;
            int i = oneKeyManagerImpl$getEVMAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getEVMAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getEVMAddress$1 = new OneKeyManagerImpl$getEVMAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getEVMAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getEVMAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getEVMAddress = new GetEVMAddress(str, str2, eVMGetAddressParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmGetAddress";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getEVMAddress$1.L$0 = this;
                oneKeyManagerImpl$getEVMAddress$1.L$1 = "evmGetAddress";
                oneKeyManagerImpl$getEVMAddress$1.L$2 = getEVMAddress;
                oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv;
                oneKeyManagerImpl$getEVMAddress$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$getEVMAddress$1.label = 1;
                if (job.join(oneKeyManagerImpl$getEVMAddress$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmGetAddress, params=" + getEVMAddress);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getEVMAddress$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getEVMAddress$1.L$3;
            getEVMAddress = (InterfaceC57144ycq) oneKeyManagerImpl$getEVMAddress$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getEVMAddress$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$getEVMAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getEVMAddress$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getEVMAddress$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getEVMAddress$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getEVMAddress$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getEVMAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1 oneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1 = new OneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$getEVMAddress$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1, oneKeyManagerImpl$getEVMAddress$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = webView;
            oneKeyManagerImpl$getEVMAddress$1.L$6 = str6;
            oneKeyManagerImpl$getEVMAddress$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getEVMAddress$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$6 = null;
            oneKeyManagerImpl$getEVMAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getEVMAddress$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getEVMAddress$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getEVMAddress$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getEVMAddress$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getEVMAddress$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getEVMAddress$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getEVMAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = webView;
            oneKeyManagerImpl$getEVMAddress$1.L$6 = str62;
            oneKeyManagerImpl$getEVMAddress$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getEVMAddress$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getEVMAddress$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$6 = null;
            oneKeyManagerImpl$getEVMAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getEVMAddress$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$getEVMAddress$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$getEVMAddress$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            if (payload instanceof JsonArray) {
                                Json json = c57138yck3.AuCTel;
                                json.getSerializersModule();
                                return (EVMAddress) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) json.decodeFromJsonElement(new ArrayListSerializer(EVMAddress.Companion.serializer()), payload));
                            }
                            Json json2 = c57138yck3.AuCTel;
                            json2.getSerializersModule();
                            return (EVMAddress) json2.decodeFromJsonElement(EVMAddress.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getEVMAddress$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$getEVMAddress$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$getEVMAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
            oneKeyManagerImpl$getEVMAddress$1.L$2 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$3 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$4 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$5 = null;
            oneKeyManagerImpl$getEVMAddress$1.L$6 = null;
            oneKeyManagerImpl$getEVMAddress$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getEVMAddress$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getEVMAddress.getConnectId();
        oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck;
        oneKeyManagerImpl$getEVMAddress$1.L$1 = str3;
        oneKeyManagerImpl$getEVMAddress$1.L$2 = getEVMAddress;
        oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv;
        oneKeyManagerImpl$getEVMAddress$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getEVMAddress$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getEVMAddress$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getEVMAddress;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1 oneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$12 = new OneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getEVMAddress$1.L$0 = c57138yck2;
        oneKeyManagerImpl$getEVMAddress$1.L$1 = str4;
        oneKeyManagerImpl$getEVMAddress$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$getEVMAddress$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getEVMAddress$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$getEVMAddress$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$getEVMAddress$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getEVMAddress$$inlined$callJavaScript$12, oneKeyManagerImpl$getEVMAddress$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMGetMultipleAddressParams eVMGetMultipleAddressParams, CommonParams commonParams, @NotNull Continuation<? super java.util.List<EVMAddress>> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$getMultipleEVMAddresses$1 oneKeyManagerImpl$getMultipleEVMAddresses$1;
        InterfaceC57144ycq getMultipleEVMAddresses;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$getMultipleEVMAddresses$1) {
            oneKeyManagerImpl$getMultipleEVMAddresses$1 = (OneKeyManagerImpl$getMultipleEVMAddresses$1) continuation;
            int i = oneKeyManagerImpl$getMultipleEVMAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$getMultipleEVMAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$getMultipleEVMAddresses$1 = new OneKeyManagerImpl$getMultipleEVMAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$getMultipleEVMAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$getMultipleEVMAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            getMultipleEVMAddresses = new GetMultipleEVMAddresses(str, str2, eVMGetMultipleAddressParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmGetMultipleAddresses";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = this;
                oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = "evmGetMultipleAddresses";
                oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = getMultipleEVMAddresses;
                oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv;
                oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 1;
                if (job.join(oneKeyManagerImpl$getMultipleEVMAddresses$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmGetMultipleAddresses, params=" + getMultipleEVMAddresses);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3;
            getMultipleEVMAddresses = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1 oneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1 = new OneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1, oneKeyManagerImpl$getMultipleEVMAddresses$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = webView;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$6 = str6;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getMultipleEVMAddresses$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$getMultipleEVMAddresses$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = webView;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$6 = str62;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$getMultipleEVMAddresses$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$getMultipleEVMAddresses$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$getMultipleEVMAddresses$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (java.util.List) json.decodeFromJsonElement(new ArrayListSerializer(EVMAddress.Companion.serializer()), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.L$6 = null;
            oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$getMultipleEVMAddresses$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = getMultipleEVMAddresses.getConnectId();
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str3;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = getMultipleEVMAddresses;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$getMultipleEVMAddresses$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = getMultipleEVMAddresses;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1 oneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$12 = new OneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$0 = c57138yck2;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$1 = str4;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$getMultipleEVMAddresses$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$getMultipleEVMAddresses$$inlined$callJavaScript$12, oneKeyManagerImpl$getMultipleEVMAddresses$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignMessageParams eVMSignMessageParams, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$signEVMMessage$1 oneKeyManagerImpl$signEVMMessage$1;
        InterfaceC57144ycq signEVMMessage;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$signEVMMessage$1) {
            oneKeyManagerImpl$signEVMMessage$1 = (OneKeyManagerImpl$signEVMMessage$1) continuation;
            int i = oneKeyManagerImpl$signEVMMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$signEVMMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$signEVMMessage$1 = new OneKeyManagerImpl$signEVMMessage$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$signEVMMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$signEVMMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            signEVMMessage = new SignEVMMessage(str, str2, eVMSignMessageParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmSignMessage";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$signEVMMessage$1.L$0 = this;
                oneKeyManagerImpl$signEVMMessage$1.L$1 = "evmSignMessage";
                oneKeyManagerImpl$signEVMMessage$1.L$2 = signEVMMessage;
                oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv;
                oneKeyManagerImpl$signEVMMessage$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$signEVMMessage$1.label = 1;
                if (job.join(oneKeyManagerImpl$signEVMMessage$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmSignMessage, params=" + signEVMMessage);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMMessage$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$signEVMMessage$1.L$3;
            signEVMMessage = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMMessage$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$signEVMMessage$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$signEVMMessage$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMMessage$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$signEVMMessage$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMMessage$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMMessage$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMMessage$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1 = new OneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$signEVMMessage$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1, oneKeyManagerImpl$signEVMMessage$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = webView;
            oneKeyManagerImpl$signEVMMessage$1.L$6 = str6;
            oneKeyManagerImpl$signEVMMessage$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMMessage$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$6 = null;
            oneKeyManagerImpl$signEVMMessage$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$signEVMMessage$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$signEVMMessage$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$signEVMMessage$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$signEVMMessage$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMMessage$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMMessage$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMMessage$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = webView;
            oneKeyManagerImpl$signEVMMessage$1.L$6 = str62;
            oneKeyManagerImpl$signEVMMessage$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMMessage$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$signEVMMessage$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$6 = null;
            oneKeyManagerImpl$signEVMMessage$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$signEVMMessage$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$signEVMMessage$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$signEVMMessage$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (EthereumMessageSignature) json.decodeFromJsonElement(EthereumMessageSignature.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$signEVMMessage$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$signEVMMessage$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$signEVMMessage$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
            oneKeyManagerImpl$signEVMMessage$1.L$2 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$3 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$4 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$5 = null;
            oneKeyManagerImpl$signEVMMessage$1.L$6 = null;
            oneKeyManagerImpl$signEVMMessage$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$signEVMMessage$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = signEVMMessage.getConnectId();
        oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck;
        oneKeyManagerImpl$signEVMMessage$1.L$1 = str3;
        oneKeyManagerImpl$signEVMMessage$1.L$2 = signEVMMessage;
        oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv;
        oneKeyManagerImpl$signEVMMessage$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$signEVMMessage$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$signEVMMessage$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = signEVMMessage;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$12 = new OneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$signEVMMessage$1.L$0 = c57138yck2;
        oneKeyManagerImpl$signEVMMessage$1.L$1 = str4;
        oneKeyManagerImpl$signEVMMessage$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$signEVMMessage$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$signEVMMessage$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$signEVMMessage$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$signEVMMessage$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$signEVMMessage$$inlined$callJavaScript$12, oneKeyManagerImpl$signEVMMessage$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$signEVMEIP712Message$1 oneKeyManagerImpl$signEVMEIP712Message$1;
        InterfaceC57144ycq signEVMEIP712Message;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$signEVMEIP712Message$1) {
            oneKeyManagerImpl$signEVMEIP712Message$1 = (OneKeyManagerImpl$signEVMEIP712Message$1) continuation;
            int i = oneKeyManagerImpl$signEVMEIP712Message$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$signEVMEIP712Message$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$signEVMEIP712Message$1 = new OneKeyManagerImpl$signEVMEIP712Message$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$signEVMEIP712Message$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$signEVMEIP712Message$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            signEVMEIP712Message = new SignEVMEIP712Message(str, str2, eVMSignMessageEIP712Params, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmSignMessageEIP712";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = this;
                oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = "evmSignMessageEIP712";
                oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = signEVMEIP712Message;
                oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv;
                oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$signEVMEIP712Message$1.label = 1;
                if (job.join(oneKeyManagerImpl$signEVMEIP712Message$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmSignMessageEIP712, params=" + signEVMEIP712Message);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMEIP712Message$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$signEVMEIP712Message$1.L$3;
            signEVMEIP712Message = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMEIP712Message$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$signEVMEIP712Message$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$signEVMEIP712Message$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMEIP712Message$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$signEVMEIP712Message$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMEIP712Message$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMEIP712Message$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMEIP712Message$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1 = new OneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1, oneKeyManagerImpl$signEVMEIP712Message$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = webView;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$6 = str6;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMEIP712Message$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$6 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$signEVMEIP712Message$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$signEVMEIP712Message$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$signEVMEIP712Message$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$signEVMEIP712Message$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMEIP712Message$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMEIP712Message$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMEIP712Message$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = webView;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$6 = str62;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMEIP712Message$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$signEVMEIP712Message$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$6 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$signEVMEIP712Message$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$signEVMEIP712Message$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$signEVMEIP712Message$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (EthereumMessageSignature) json.decodeFromJsonElement(EthereumMessageSignature.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$signEVMEIP712Message$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$signEVMEIP712Message$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$signEVMEIP712Message$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.L$6 = null;
            oneKeyManagerImpl$signEVMEIP712Message$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$signEVMEIP712Message$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = signEVMEIP712Message.getConnectId();
        oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str3;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = signEVMEIP712Message;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$signEVMEIP712Message$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$signEVMEIP712Message$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = signEVMEIP712Message;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$12 = new OneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$signEVMEIP712Message$1.L$0 = c57138yck2;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$1 = str4;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$signEVMEIP712Message$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$signEVMEIP712Message$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$signEVMEIP712Message$$inlined$callJavaScript$12, oneKeyManagerImpl$signEVMEIP712Message$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignTypedDataParams eVMSignTypedDataParams, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$signEVMTypedData$1 oneKeyManagerImpl$signEVMTypedData$1;
        InterfaceC57144ycq signEVMTypedData;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$signEVMTypedData$1) {
            oneKeyManagerImpl$signEVMTypedData$1 = (OneKeyManagerImpl$signEVMTypedData$1) continuation;
            int i = oneKeyManagerImpl$signEVMTypedData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$signEVMTypedData$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$signEVMTypedData$1 = new OneKeyManagerImpl$signEVMTypedData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$signEVMTypedData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$signEVMTypedData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            signEVMTypedData = new SignEVMTypedData(str, str2, eVMSignTypedDataParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmSignTypedData";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$signEVMTypedData$1.L$0 = this;
                oneKeyManagerImpl$signEVMTypedData$1.L$1 = "evmSignTypedData";
                oneKeyManagerImpl$signEVMTypedData$1.L$2 = signEVMTypedData;
                oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv;
                oneKeyManagerImpl$signEVMTypedData$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$signEVMTypedData$1.label = 1;
                if (job.join(oneKeyManagerImpl$signEVMTypedData$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmSignTypedData, params=" + signEVMTypedData);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMTypedData$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$signEVMTypedData$1.L$3;
            signEVMTypedData = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTypedData$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$signEVMTypedData$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$signEVMTypedData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMTypedData$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$signEVMTypedData$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTypedData$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMTypedData$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMTypedData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1 = new OneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$signEVMTypedData$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1, oneKeyManagerImpl$signEVMTypedData$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = webView;
            oneKeyManagerImpl$signEVMTypedData$1.L$6 = str6;
            oneKeyManagerImpl$signEVMTypedData$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMTypedData$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$6 = null;
            oneKeyManagerImpl$signEVMTypedData$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$signEVMTypedData$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$signEVMTypedData$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$signEVMTypedData$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$signEVMTypedData$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTypedData$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMTypedData$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMTypedData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = webView;
            oneKeyManagerImpl$signEVMTypedData$1.L$6 = str62;
            oneKeyManagerImpl$signEVMTypedData$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMTypedData$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$signEVMTypedData$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$6 = null;
            oneKeyManagerImpl$signEVMTypedData$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$signEVMTypedData$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$signEVMTypedData$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$signEVMTypedData$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (EthereumMessageSignature) json.decodeFromJsonElement(EthereumMessageSignature.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$signEVMTypedData$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$signEVMTypedData$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$signEVMTypedData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTypedData$1.L$2 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$3 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$4 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$5 = null;
            oneKeyManagerImpl$signEVMTypedData$1.L$6 = null;
            oneKeyManagerImpl$signEVMTypedData$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$signEVMTypedData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = signEVMTypedData.getConnectId();
        oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck;
        oneKeyManagerImpl$signEVMTypedData$1.L$1 = str3;
        oneKeyManagerImpl$signEVMTypedData$1.L$2 = signEVMTypedData;
        oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv;
        oneKeyManagerImpl$signEVMTypedData$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$signEVMTypedData$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$signEVMTypedData$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = signEVMTypedData;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$12 = new OneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$signEVMTypedData$1.L$0 = c57138yck2;
        oneKeyManagerImpl$signEVMTypedData$1.L$1 = str4;
        oneKeyManagerImpl$signEVMTypedData$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$signEVMTypedData$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$signEVMTypedData$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$signEVMTypedData$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$signEVMTypedData$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$signEVMTypedData$$inlined$callJavaScript$12, oneKeyManagerImpl$signEVMTypedData$1);
        if (objWithContext != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC57039yar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, @NotNull Continuation<? super EVMSignedTx> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$signEVMTransaction$1 oneKeyManagerImpl$signEVMTransaction$1;
        InterfaceC57144ycq signEVMTransaction;
        C57149ycv c57149ycv;
        android.webkit.WebView webViewCopydefault;
        java.lang.String str3;
        C57138yck c57138yck;
        C57149ycv c57149ycv2;
        InterfaceC57144ycq interfaceC57144ycq;
        java.lang.String str4;
        C57138yck c57138yck2;
        android.webkit.WebView webView;
        C57149ycv c57149ycv3;
        java.lang.String str5;
        C57138yck c57138yck3;
        Response response;
        if (continuation instanceof OneKeyManagerImpl$signEVMTransaction$1) {
            oneKeyManagerImpl$signEVMTransaction$1 = (OneKeyManagerImpl$signEVMTransaction$1) continuation;
            int i = oneKeyManagerImpl$signEVMTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$signEVMTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$signEVMTransaction$1 = new OneKeyManagerImpl$signEVMTransaction$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oneKeyManagerImpl$signEVMTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$signEVMTransaction$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            signEVMTransaction = new SignEVMTransaction(str, str2, eVMSignTransactionParams, commonParams);
            c57149ycv = this.fetchVPNInfo;
            webViewCopydefault = c57149ycv.copydefault();
            str3 = "evmSignTransaction";
            if (webViewCopydefault != null) {
                Job job = c57149ycv.values;
                if (job == null) {
                    throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
                }
                oneKeyManagerImpl$signEVMTransaction$1.L$0 = this;
                oneKeyManagerImpl$signEVMTransaction$1.L$1 = "evmSignTransaction";
                oneKeyManagerImpl$signEVMTransaction$1.L$2 = signEVMTransaction;
                oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv;
                oneKeyManagerImpl$signEVMTransaction$1.L$4 = webViewCopydefault;
                oneKeyManagerImpl$signEVMTransaction$1.label = 1;
                if (job.join(oneKeyManagerImpl$signEVMTransaction$1) == objCopydefault) {
                    return objCopydefault;
                }
                c57138yck = this;
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to nativeCall: method=evmSignTransaction, params=" + signEVMTransaction);
                throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
            }
        } else if (i2 == 1) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMTransaction$1.L$4;
            c57149ycv = (C57149ycv) oneKeyManagerImpl$signEVMTransaction$1.L$3;
            signEVMTransaction = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTransaction$1.L$2;
            str3 = (java.lang.String) oneKeyManagerImpl$signEVMTransaction$1.L$1;
            c57138yck = (C57138yck) oneKeyManagerImpl$signEVMTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else if (i2 == 2) {
            webViewCopydefault = (android.webkit.WebView) oneKeyManagerImpl$signEVMTransaction$1.L$4;
            c57149ycv2 = (C57149ycv) oneKeyManagerImpl$signEVMTransaction$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTransaction$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMTransaction$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = c57149ycv2.AhwBna;
            OneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1 = new OneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1(interfaceC57144ycq, null);
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv2;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = webViewCopydefault;
            oneKeyManagerImpl$signEVMTransaction$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1, oneKeyManagerImpl$signEVMTransaction$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            webView = webViewCopydefault;
            c57149ycv3 = c57149ycv2;
            java.lang.String str6 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = webView;
            oneKeyManagerImpl$signEVMTransaction$1.L$6 = str6;
            oneKeyManagerImpl$signEVMTransaction$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMTransaction$1), 1);
            cancellableContinuationImpl.initCancellability();
            java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
            java.lang.String str7 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str4 + "\", " + str6 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str7);
            webView.evaluateJavascript(str7, null);
            objWithContext = cancellableContinuationImpl.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
            }
            if (objWithContext == objCopydefault) {
            }
            CoroutineDispatcher coroutineDispatcher2 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$2 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$6 = null;
            oneKeyManagerImpl$signEVMTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$nativeCall$2, oneKeyManagerImpl$signEVMTransaction$1);
            if (objWithContext == objCopydefault) {
            }
        } else if (i2 == 3) {
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeyManagerImpl$signEVMTransaction$1.L$5;
            C57149ycv c57149ycv4 = (C57149ycv) oneKeyManagerImpl$signEVMTransaction$1.L$4;
            C57149ycv c57149ycv5 = (C57149ycv) oneKeyManagerImpl$signEVMTransaction$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeyManagerImpl$signEVMTransaction$1.L$2;
            str4 = (java.lang.String) oneKeyManagerImpl$signEVMTransaction$1.L$1;
            c57138yck2 = (C57138yck) oneKeyManagerImpl$signEVMTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            webView = webView2;
            c57149ycv3 = c57149ycv5;
            c57149ycv2 = c57149ycv4;
            java.lang.String str62 = (java.lang.String) objWithContext;
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = interfaceC57144ycq;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv3;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = c57149ycv2;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = webView;
            oneKeyManagerImpl$signEVMTransaction$1.L$6 = str62;
            oneKeyManagerImpl$signEVMTransaction$1.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$signEVMTransaction$1), 1);
            cancellableContinuationImpl2.initCancellability();
            java.lang.String strValueOf2 = java.lang.String.valueOf(c57149ycv2.copydefault.getAndIncrement());
            c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl2));
            java.lang.String str72 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"" + str4 + "\", " + str62 + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str72);
            webView.evaluateJavascript(str72, null);
            objWithContext = cancellableContinuationImpl2.getResult();
            if (objWithContext == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$signEVMTransaction$1);
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            CoroutineDispatcher coroutineDispatcher22 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$22 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$6 = null;
            oneKeyManagerImpl$signEVMTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher22, oneKeySDKJavaScriptEngine$nativeCall$22, oneKeyManagerImpl$signEVMTransaction$1);
            if (objWithContext == objCopydefault) {
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (java.lang.String) oneKeyManagerImpl$signEVMTransaction$1.L$1;
                c57138yck3 = (C57138yck) oneKeyManagerImpl$signEVMTransaction$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                response = (Response) objWithContext;
                if (!(response instanceof Success)) {
                    pUU.KWHzl("OneKeyManager", str5 + ": " + ((Success) response).getPayload());
                    try {
                        JsonElement payload = ((Success) response).getPayload();
                        if (payload != null) {
                            Json json = c57138yck3.AuCTel;
                            json.getSerializersModule();
                            return (EVMSignedTx) json.decodeFromJsonElement(EVMSignedTx.Companion.serializer(), payload);
                        }
                        throw new OneKeyException(new java.lang.NullPointerException("`payload` is null"));
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OneKeyManager", str5 + ": error", th);
                        throw new OneKeyException(th);
                    }
                }
                if (!(response instanceof Unsuccessful)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unsuccessful.Payload payload2 = ((Unsuccessful) response).getPayload();
                pUU.copydefault("OneKeyManager", str5 + ": error=" + payload2.KWHzl() + ", code=" + payload2.copydefault());
                throw new OneKeyException(OneKeySDKError.Companion.OLrzqt(payload2.copydefault()), payload2.KWHzl());
            }
            c57149ycv3 = (C57149ycv) oneKeyManagerImpl$signEVMTransaction$1.L$3;
            java.lang.String str8 = (java.lang.String) oneKeyManagerImpl$signEVMTransaction$1.L$1;
            C57138yck c57138yck4 = (C57138yck) oneKeyManagerImpl$signEVMTransaction$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str4 = str8;
            c57138yck2 = c57138yck4;
            CoroutineDispatcher coroutineDispatcher222 = c57149ycv3.AhwBna;
            OneKeySDKJavaScriptEngine$nativeCall$2 oneKeySDKJavaScriptEngine$nativeCall$222 = new OneKeySDKJavaScriptEngine$nativeCall$2((java.lang.String) objWithContext, null);
            oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
            oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
            oneKeyManagerImpl$signEVMTransaction$1.L$2 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$3 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$4 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$5 = null;
            oneKeyManagerImpl$signEVMTransaction$1.L$6 = null;
            oneKeyManagerImpl$signEVMTransaction$1.label = 5;
            objWithContext = BuildersKt.withContext(coroutineDispatcher222, oneKeySDKJavaScriptEngine$nativeCall$222, oneKeyManagerImpl$signEVMTransaction$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str5 = str4;
            c57138yck3 = c57138yck2;
            response = (Response) objWithContext;
            if (!(response instanceof Success)) {
            }
        }
        java.lang.String connectId = signEVMTransaction.getConnectId();
        oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck;
        oneKeyManagerImpl$signEVMTransaction$1.L$1 = str3;
        oneKeyManagerImpl$signEVMTransaction$1.L$2 = signEVMTransaction;
        oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv;
        oneKeyManagerImpl$signEVMTransaction$1.L$4 = webViewCopydefault;
        oneKeyManagerImpl$signEVMTransaction$1.label = 2;
        if (c57149ycv.AEQbTJ(webViewCopydefault, connectId, (Continuation<? super Unit>) oneKeyManagerImpl$signEVMTransaction$1) == objCopydefault) {
            return objCopydefault;
        }
        c57149ycv2 = c57149ycv;
        interfaceC57144ycq = signEVMTransaction;
        str4 = str3;
        c57138yck2 = c57138yck;
        CoroutineDispatcher coroutineDispatcher3 = c57149ycv2.AhwBna;
        OneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1 oneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$12 = new OneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$1(interfaceC57144ycq, null);
        oneKeyManagerImpl$signEVMTransaction$1.L$0 = c57138yck2;
        oneKeyManagerImpl$signEVMTransaction$1.L$1 = str4;
        oneKeyManagerImpl$signEVMTransaction$1.L$2 = interfaceC57144ycq;
        oneKeyManagerImpl$signEVMTransaction$1.L$3 = c57149ycv2;
        oneKeyManagerImpl$signEVMTransaction$1.L$4 = c57149ycv2;
        oneKeyManagerImpl$signEVMTransaction$1.L$5 = webViewCopydefault;
        oneKeyManagerImpl$signEVMTransaction$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher3, oneKeyManagerImpl$signEVMTransaction$$inlined$callJavaScript$12, oneKeyManagerImpl$signEVMTransaction$1);
        if (objWithContext != objCopydefault) {
        }
    }

    @Override // o.InterfaceC57039yar
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo.EZpvd(str);
    }

    @Override // o.InterfaceC57039yar
    public void KWHzl() {
        this.ejfBZ.removeCallbacks(this.getFieldNames);
        if (this.fARcdN) {
            pUU.valueOf("OneKeyManager", "Still scanning");
            return;
        }
        this.fJNWhG = android.os.SystemClock.uptimeMillis();
        this.fARcdN = true;
        this.AYXKKw.copydefault();
    }

    @Override // o.InterfaceC57039yar
    public void copydefault() {
        long j = this.fJNWhG + ((long) 8000);
        if (android.os.SystemClock.uptimeMillis() < j) {
            pUU.KWHzl("OneKeyManager", "scheduled to stop scanning");
            this.ejfBZ.postDelayed(this.getFieldNames, j - android.os.SystemClock.uptimeMillis());
        } else {
            pUU.KWHzl("OneKeyManager", "stop scanning now");
            this.getFieldNames.run();
        }
    }

    public boolean AEQbTJ(@NotNull OneKeyDevice oneKeyDevice) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        return this.AYXKKw.OLrzqt(this.AEQbTJ, oneKeyDevice.getConnectId());
    }

    /* JADX INFO: renamed from: o.yck$ActionBar */
    public static final class ActionBar implements StateListAnimator {
        public final /* synthetic */ CancellableContinuation<OneKeyDevice> AEQbTJ;
        public final /* synthetic */ C57138yck KWHzl;
        public final /* synthetic */ OneKeyDevice OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.wallet.hardware.api.onekey.OneKeyDevice> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(OneKeyDevice oneKeyDevice, C57138yck c57138yck, CancellableContinuation<? super OneKeyDevice> cancellableContinuation) {
            this.OLrzqt = oneKeyDevice;
            this.KWHzl = c57138yck;
            this.AEQbTJ = cancellableContinuation;
        }

        @Override // o.C57138yck.StateListAnimator
        public void OLrzqt(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            if (Intrinsics.EZpvd((java.lang.Object) c58160yvz.AkhnZx(), (java.lang.Object) this.OLrzqt.getConnectId())) {
                this.KWHzl.KWHzl(this);
                pUU.KWHzl("OneKeyManager", "bindDevice: device=" + this.OLrzqt);
                if (this.AEQbTJ.isActive()) {
                    CancellableContinuation<OneKeyDevice> cancellableContinuation = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(this.OLrzqt));
                }
            }
        }

        @Override // o.C57138yck.StateListAnimator
        public void EZpvd(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            if (Intrinsics.EZpvd((java.lang.Object) c58160yvz.AkhnZx(), (java.lang.Object) this.OLrzqt.getConnectId())) {
                this.KWHzl.KWHzl(this);
                OneKeyException oneKeyException = new OneKeyException(OneKeySDKError.BluetoothError, null, 2, null);
                pUU.copydefault("OneKeyManager", "bindDevice: error=" + oneKeyException);
                if (this.AEQbTJ.isActive()) {
                    CancellableContinuation<OneKeyDevice> cancellableContinuation = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(oneKeyException)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yck$Activity */
    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ ActionBar AEQbTJ;
        public final /* synthetic */ OneKeyDevice OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ActionBar actionBar, OneKeyDevice oneKeyDevice) {
            this.AEQbTJ = actionBar;
            this.OLrzqt = oneKeyDevice;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            C57138yck.this.KWHzl(this.AEQbTJ);
            C57138yck.this.AYXKKw.EZpvd(new BluetoothDeviceModel(this.OLrzqt.getName(), this.OLrzqt.getConnectId(), ""));
        }
    }

    /* JADX INFO: renamed from: o.yck$LoaderManager */
    public static final class LoaderManager implements TaskDescription {
        public final /* synthetic */ CancellableContinuation<OneKeyDevice> EZpvd;
        public final /* synthetic */ OneKeyDevice KWHzl;
        public final /* synthetic */ C57138yck OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.wallet.hardware.api.onekey.OneKeyDevice> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(OneKeyDevice oneKeyDevice, C57138yck c57138yck, CancellableContinuation<? super OneKeyDevice> cancellableContinuation) {
            this.KWHzl = oneKeyDevice;
            this.OLrzqt = c57138yck;
            this.EZpvd = cancellableContinuation;
        }

        @Override // o.C57138yck.TaskDescription
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.KWHzl.getConnectId())) {
                this.OLrzqt.OLrzqt(this);
                java.util.List<OneKeyDevice> listOLrzqt = this.OLrzqt.OLrzqt();
                OneKeyDevice oneKeyDevice = this.KWHzl;
                if ((listOLrzqt instanceof java.util.Collection) && listOLrzqt.isEmpty()) {
                    this.OLrzqt.OLrzqt().add(this.KWHzl);
                } else {
                    java.util.Iterator<T> it = listOLrzqt.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((OneKeyDevice) it.next()).getConnectId(), (java.lang.Object) oneKeyDevice.getConnectId())) {
                            break;
                        }
                    }
                    this.OLrzqt.OLrzqt().add(this.KWHzl);
                }
                pUU.KWHzl("OneKeyManager", "connect: device=" + this.KWHzl);
                if (this.EZpvd.isActive()) {
                    CancellableContinuation<OneKeyDevice> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(this.KWHzl));
                }
            }
        }

        @Override // o.C57138yck.TaskDescription
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.KWHzl.getConnectId())) {
                this.OLrzqt.OLrzqt(this);
                OneKeyException oneKeyException = new OneKeyException(OneKeySDKError.BluetoothError, null, 2, null);
                pUU.KWHzl("OneKeyManager", "connect: error=" + oneKeyException);
                if (this.EZpvd.isActive()) {
                    CancellableContinuation<OneKeyDevice> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(oneKeyException)));
                }
            }
        }

        @Override // o.C57138yck.TaskDescription
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.KWHzl.getConnectId())) {
                this.OLrzqt.OLrzqt(this);
                OneKeyException oneKeyException = new OneKeyException(OneKeySDKError.BluetoothError, null, 2, null);
                pUU.KWHzl("OneKeyManager", "connect: error=" + oneKeyException);
                if (this.EZpvd.isActive()) {
                    CancellableContinuation<OneKeyDevice> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(oneKeyException)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull OneKeyDevice oneKeyDevice, @NotNull Continuation<? super OneKeyDevice> continuation) throws java.lang.Throwable {
        OneKeyManagerImpl$connect$1 oneKeyManagerImpl$connect$1;
        if (continuation instanceof OneKeyManagerImpl$connect$1) {
            oneKeyManagerImpl$connect$1 = (OneKeyManagerImpl$connect$1) continuation;
            int i = oneKeyManagerImpl$connect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerImpl$connect$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerImpl$connect$1 = new OneKeyManagerImpl$connect$1(this, continuation);
            }
        }
        java.lang.Object result = oneKeyManagerImpl$connect$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeyManagerImpl$connect$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(result);
            oneKeyManagerImpl$connect$1.L$0 = this;
            oneKeyManagerImpl$connect$1.L$1 = oneKeyDevice;
            oneKeyManagerImpl$connect$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeyManagerImpl$connect$1), 1);
            cancellableContinuationImpl.initCancellability();
            LoaderManager loaderManager = new LoaderManager(oneKeyDevice, this, cancellableContinuationImpl);
            copydefault(loaderManager);
            cancellableContinuationImpl.invokeOnCancellation(new Dialog(loaderManager, oneKeyDevice));
            pUU.KWHzl("OneKeyManager", "connect start: device=" + oneKeyDevice);
            this.AYXKKw.KWHzl(new BluetoothDeviceModel(oneKeyDevice.getName(), oneKeyDevice.getConnectId(), ""));
            result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(oneKeyManagerImpl$connect$1);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = oneKeyManagerImpl$connect$1.L$0;
                C56391yDq.AEQbTJ(result);
                return obj;
            }
            C56391yDq.AEQbTJ(result);
        }
        oneKeyManagerImpl$connect$1.L$0 = result;
        oneKeyManagerImpl$connect$1.L$1 = null;
        oneKeyManagerImpl$connect$1.label = 2;
        return DelayKt.delay(100L, oneKeyManagerImpl$connect$1) == objCopydefault ? objCopydefault : result;
    }

    /* JADX INFO: renamed from: o.yck$Dialog */
    public static final class Dialog implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ OneKeyDevice AEQbTJ;
        public final /* synthetic */ LoaderManager copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(LoaderManager loaderManager, OneKeyDevice oneKeyDevice) {
            this.copydefault = loaderManager;
            this.AEQbTJ = oneKeyDevice;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            C57138yck.this.OLrzqt(this.copydefault);
            C57138yck.this.AYXKKw.EZpvd(new BluetoothDeviceModel(this.AEQbTJ.getName(), this.AEQbTJ.getConnectId(), ""));
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        pUU.KWHzl("OneKeyManager", "writeData: size=" + bArr.length);
        this.AYXKKw.AEQbTJ(str, bArr);
    }

    public static final boolean AEQbTJ(C58160yvz c58160yvz, OneKeyDevice oneKeyDevice) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        return Intrinsics.EZpvd((java.lang.Object) oneKeyDevice.getConnectId(), (java.lang.Object) c58160yvz.AkhnZx());
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(@NotNull final C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        C56406yEe.AEQbTJ(OLrzqt(), new Function1() { // from class: o.ycl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C57138yck.AEQbTJ(c58160yvz, (OneKeyDevice) obj));
            }
        });
        for (TaskDescription taskDescription : this.DbNXlk) {
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
            taskDescription.EZpvd(strAkhnZx);
        }
    }

    @Override // o.C57003yaH.Application
    public void djBIcL(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.lang.String strDbNXlk = c58160yvz.DbNXlk();
        Intrinsics.checkNotNullExpressionValue(strDbNXlk, "");
        java.lang.String strAkhnZx = c58160yvz.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
        OneKeyDevice oneKeyDeviceEZpvd = EZpvd(strDbNXlk, strAkhnZx);
        java.util.Iterator<T> it = this.fIwbmz.iterator();
        while (it.hasNext()) {
            ((InterfaceC57039yar.TaskDescription) it.next()).OLrzqt(oneKeyDeviceEZpvd);
        }
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(int i) {
        if (i == 10 || i == 13) {
            pUU.KWHzl("OneKeyManager", "stopScanning now");
            this.getFieldNames.run();
        }
        java.util.Iterator<T> it = this.valueOf.iterator();
        while (it.hasNext()) {
            ((InterfaceC57025yad) it.next()).AEQbTJ(i);
        }
    }

    @Override // o.C57003yaH.Application
    public void valueOf(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        int iEZpvd = c58160yvz.EZpvd(WriteType.WITHOUT_RESPONSE);
        pUU.KWHzl("OneKeyManager", "requestMtu: peripheral: " + c58160yvz.AkhnZx() + ", writeSize: " + iEZpvd + ", mtu: " + c58160yvz.fetchVPNInfo());
        if (iEZpvd < 64) {
            c58160yvz.EZpvd(517);
        }
    }

    public final boolean AhwBna(C58160yvz c58160yvz) {
        WriteType writeType = WriteType.WITHOUT_RESPONSE;
        int iEZpvd = c58160yvz.EZpvd(writeType);
        if (iEZpvd < 64) {
            pUU.KWHzl("OneKeyManager", c58160yvz.AkhnZx() + " not ready: writeSize=" + iEZpvd);
            return false;
        }
        UUID uuid = KWHzl;
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt = c58160yvz.OLrzqt(uuid, OLrzqt);
        if (bluetoothGattCharacteristicOLrzqt == null || !c58160yvz.copydefault(bluetoothGattCharacteristicOLrzqt)) {
            pUU.KWHzl("OneKeyManager", c58160yvz.AkhnZx() + " not ready: notificationCharacteristic=" + (bluetoothGattCharacteristicOLrzqt != null ? bluetoothGattCharacteristicOLrzqt.getUuid() : null));
            return false;
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt2 = c58160yvz.OLrzqt(uuid, copydefault);
        if (bluetoothGattCharacteristicOLrzqt2 != null) {
            if ((writeType.property & bluetoothGattCharacteristicOLrzqt2.getProperties()) != 0) {
                pUU.KWHzl("OneKeyManager", c58160yvz.AkhnZx() + " is ready: writeSize=" + iEZpvd + ", notificationCharacteristic=" + bluetoothGattCharacteristicOLrzqt.getUuid() + ",writeCharacteristic=" + bluetoothGattCharacteristicOLrzqt2.getUuid());
                return true;
            }
        }
        pUU.KWHzl("OneKeyManager", c58160yvz.AkhnZx() + " not ready: writeCharacteristic=" + (bluetoothGattCharacteristicOLrzqt2 != null ? bluetoothGattCharacteristicOLrzqt2.getUuid() : null));
        return false;
    }

    @Override // o.C57003yaH.Application
    public void EZpvd(@NotNull C58160yvz c58160yvz, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.lang.String strAkhnZx = c58160yvz.AkhnZx();
        java.util.List<OneKeyDevice> listOLrzqt = OLrzqt();
        if ((listOLrzqt instanceof java.util.Collection) && listOLrzqt.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((OneKeyDevice) it.next()).getConnectId(), (java.lang.Object) c58160yvz.AkhnZx())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        pUU.KWHzl("OneKeyManager", "setMtuSize: peripheral=" + strAkhnZx + ", mtuSize=" + i + ", hasConnectedDevice=" + z);
        AYXKKw(c58160yvz);
    }

    @Override // o.C57003yaH.Application
    public void AEQbTJ(@NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAkhnZx = c58160yvz.AkhnZx();
        java.util.List<OneKeyDevice> listOLrzqt = OLrzqt();
        if ((listOLrzqt instanceof java.util.Collection) && listOLrzqt.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((OneKeyDevice) it.next()).getConnectId(), (java.lang.Object) c58160yvz.AkhnZx())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        pUU.KWHzl("OneKeyManager", "onNotificationStateUpdate: peripheral=" + strAkhnZx + ", hasConnectedDevice=" + z);
        AYXKKw(c58160yvz);
    }

    public final void AYXKKw(C58160yvz c58160yvz) {
        if (AhwBna(c58160yvz)) {
            for (TaskDescription taskDescription : this.DbNXlk) {
                java.lang.String strAkhnZx = c58160yvz.AkhnZx();
                Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
                taskDescription.OLrzqt(strAkhnZx);
            }
        }
    }

    @Override // o.C57003yaH.Application
    public void copydefault(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        AYXKKw(c58160yvz);
    }

    @Override // o.C57003yaH.Application
    public void EZpvd(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        for (OneKeyDevice oneKeyDevice : OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) oneKeyDevice.getConnectId(), (java.lang.Object) c58160yvz.AkhnZx())) {
                oneKeyDevice.clearCachedResults();
            }
        }
        C57149ycv c57149ycv = this.fetchVPNInfo;
        java.lang.String strAkhnZx = c58160yvz.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
        c57149ycv.KWHzl(strAkhnZx);
    }

    public static final boolean KWHzl(C58160yvz c58160yvz, OneKeyDevice oneKeyDevice) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        return Intrinsics.EZpvd((java.lang.Object) oneKeyDevice.getConnectId(), (java.lang.Object) c58160yvz.AkhnZx());
    }

    @Override // o.C57003yaH.Application
    public void gEmmrt(@NotNull final C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        C56406yEe.AEQbTJ(OLrzqt(), new Function1() { // from class: o.ycn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C57138yck.KWHzl(c58160yvz, (OneKeyDevice) obj));
            }
        });
        for (TaskDescription taskDescription : this.DbNXlk) {
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
            taskDescription.KWHzl(strAkhnZx);
        }
    }

    @Override // o.C57003yaH.Application
    public void KWHzl(@NotNull C58160yvz c58160yvz, @NotNull byte[] bArr, @NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
        java.util.List<OneKeyDevice> listOLrzqt = OLrzqt();
        if ((listOLrzqt instanceof java.util.Collection) && listOLrzqt.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) ((OneKeyDevice) it.next()).getConnectId(), (java.lang.Object) c58160yvz.AkhnZx())) {
                if (Intrinsics.EZpvd(bluetoothGattCharacteristic.getUuid(), OLrzqt)) {
                    java.lang.String strAkhnZx = c58160yvz.AkhnZx();
                    int length = bArr.length;
                    java.lang.Byte bAEQbTJ = yDV.AEQbTJ(bArr, 0);
                    if (bAEQbTJ != null) {
                        str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(bAEQbTJ.byteValue())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                    } else {
                        str = null;
                    }
                    pUU.KWHzl("OneKeyManager", "onCharacteristicUpdate: connectId=" + strAkhnZx + ", size=" + length + ", firstByte=" + str);
                    this.fetchVPNInfo.EZpvd(bArr);
                    return;
                }
                return;
            }
        }
    }

    public final OneKeyDevice EZpvd(java.lang.String str, java.lang.String str2) {
        return new OneKeyDevice(str2, str, str2, C57145ycr.AEQbTJ(str));
    }

    public java.lang.Object AEQbTJ(@NotNull OneKeyDevice oneKeyDevice, @NotNull Continuation<? super OneKeyDevice> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ActionBar actionBar = new ActionBar(oneKeyDevice, this, cancellableContinuationImpl);
        AEQbTJ(actionBar);
        cancellableContinuationImpl.invokeOnCancellation(new Activity(actionBar, oneKeyDevice));
        pUU.KWHzl("OneKeyManager", "bindDevice start: device=" + oneKeyDevice);
        this.AYXKKw.KWHzl(oneKeyDevice.getConnectId());
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    @Override // o.C57003yaH.Application
    public void KWHzl(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.util.Iterator<T> it = this.djBIcL.iterator();
        while (it.hasNext()) {
            ((StateListAnimator) it.next()).OLrzqt(c58160yvz);
        }
    }

    @Override // o.C57003yaH.Application
    public void OLrzqt(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        java.util.Iterator<T> it = this.djBIcL.iterator();
        while (it.hasNext()) {
            ((StateListAnimator) it.next()).EZpvd(c58160yvz);
        }
    }

    @Override // o.C57003yaH.Application
    public void EZpvd() {
        java.util.Iterator<T> it = this.fIwbmz.iterator();
        while (it.hasNext()) {
            ((InterfaceC57039yar.TaskDescription) it.next()).KWHzl();
        }
    }

    public final void AEQbTJ(@NotNull OneKeyAuthStage oneKeyAuthStage) {
        Intrinsics.checkNotNullParameter(oneKeyAuthStage, "");
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((InterfaceC57039yar.ActionBar) it.next()).EZpvd(oneKeyAuthStage);
        }
    }
}
