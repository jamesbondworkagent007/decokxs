package com.okinc.auth.impl.debugtool.passkey;

import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.featureflag.FeatureFlag;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C56391yDq;
import o.C56442yFn;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5937aFr;
import o.C5938aFs;
import o.C5939aFt;
import o.C5941aFv;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyDebugToolViewModel$prepareInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    final /* synthetic */ PasskeyDebugToolViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyDebugToolViewModel$prepareInfo$1(PasskeyDebugToolViewModel passkeyDebugToolViewModel, Continuation<? super PasskeyDebugToolViewModel$prepareInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyDebugToolViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyDebugToolViewModel$prepareInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyDebugToolViewModel$prepareInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0222  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        String str;
        PasskeyDebugToolViewModel passkeyDebugToolViewModel;
        String str2;
        boolean z;
        MutableLiveData mutableLiveData;
        Object objAEQbTJ;
        String str3;
        boolean z2;
        boolean z3;
        Object obj2;
        Object objEZpvd;
        Object obj3;
        PasskeyDebugToolViewModel passkeyDebugToolViewModel2;
        String str4;
        MutableLiveData mutableLiveData2;
        Object obj4;
        String str5;
        Object objCopydefault;
        PasskeyDebugToolViewModel passkeyDebugToolViewModel3;
        Object obj5;
        Object objKWHzl2;
        Object obj6;
        Object obj7;
        PasskeyDebugToolViewModel passkeyDebugToolViewModel4;
        String str6;
        String str7;
        MutableLiveData mutableLiveData3;
        Object obj8;
        Object obj9;
        Object objCopydefault2;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj10;
        Object objCopydefault3 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                Pair androidVersionInfo$default = PasskeyDebugToolViewModel.getAndroidVersionInfo$default(this.this$0, 0, 1, null);
                PasskeyDebugToolViewModel passkeyDebugToolViewModel5 = this.this$0;
                String str8 = (String) androidVersionInfo$default.component1();
                String str9 = (String) androidVersionInfo$default.component2();
                MutableLiveData mutableLiveData4 = passkeyDebugToolViewModel5.OLrzqt;
                boolean zCopydefault = passkeyDebugToolViewModel5.AYXKKw.copydefault(FeatureFlag.BYPASS_CHINA_IP_CHECKING, false);
                C5904aFK c5904aFK = passkeyDebugToolViewModel5.KWHzl;
                this.L$0 = passkeyDebugToolViewModel5;
                this.L$1 = str9;
                this.L$2 = str8;
                this.L$3 = mutableLiveData4;
                this.Z$0 = zCopydefault;
                this.label = 1;
                objKWHzl = c5904aFK.KWHzl(this);
                if (objKWHzl == objCopydefault3) {
                    return objCopydefault3;
                }
                str = str9;
                passkeyDebugToolViewModel = passkeyDebugToolViewModel5;
                str2 = str8;
                z = zCopydefault;
                mutableLiveData = mutableLiveData4;
                boolean zAEQbTJ = passkeyDebugToolViewModel.EZpvd.AEQbTJ();
                boolean zKWHzl = passkeyDebugToolViewModel.KWHzl();
                C5903aFJ c5903aFJ = passkeyDebugToolViewModel.copydefault;
                this.L$0 = passkeyDebugToolViewModel;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = mutableLiveData;
                this.L$4 = objKWHzl;
                this.Z$0 = z;
                this.Z$1 = zKWHzl;
                this.Z$2 = zAEQbTJ;
                this.label = 2;
                objAEQbTJ = c5903aFJ.AEQbTJ(this);
                if (objAEQbTJ != objCopydefault3) {
                    return objCopydefault3;
                }
                Object obj11 = objKWHzl;
                str3 = str2;
                z2 = zAEQbTJ;
                z3 = zKWHzl;
                obj2 = obj11;
                C5939aFt c5939aFt = passkeyDebugToolViewModel.djBIcL;
                this.L$0 = passkeyDebugToolViewModel;
                this.L$1 = str;
                this.L$2 = str3;
                this.L$3 = mutableLiveData;
                this.L$4 = obj2;
                this.L$5 = objAEQbTJ;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 3;
                objEZpvd = c5939aFt.EZpvd(this);
                if (objEZpvd != objCopydefault3) {
                    return objCopydefault3;
                }
                String str10 = str3;
                obj3 = obj2;
                passkeyDebugToolViewModel2 = passkeyDebugToolViewModel;
                str4 = str10;
                String str11 = str;
                mutableLiveData2 = mutableLiveData;
                obj4 = objAEQbTJ;
                str5 = str11;
                C5937aFr c5937aFr = passkeyDebugToolViewModel2.AhwBna;
                this.L$0 = passkeyDebugToolViewModel2;
                this.L$1 = str5;
                this.L$2 = str4;
                this.L$3 = mutableLiveData2;
                this.L$4 = obj3;
                this.L$5 = obj4;
                this.L$6 = objEZpvd;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 4;
                objCopydefault = c5937aFr.copydefault(this);
                if (objCopydefault != objCopydefault3) {
                    return objCopydefault3;
                }
                Object obj12 = objEZpvd;
                passkeyDebugToolViewModel3 = passkeyDebugToolViewModel2;
                obj5 = obj12;
                C5938aFs c5938aFs = passkeyDebugToolViewModel3.gEmmrt;
                this.L$0 = passkeyDebugToolViewModel3;
                this.L$1 = str5;
                this.L$2 = str4;
                this.L$3 = mutableLiveData2;
                this.L$4 = obj3;
                this.L$5 = obj4;
                this.L$6 = obj5;
                this.L$7 = objCopydefault;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 5;
                objKWHzl2 = c5938aFs.KWHzl(this);
                if (objKWHzl2 != objCopydefault3) {
                    return objCopydefault3;
                }
                Object obj13 = obj4;
                obj6 = obj5;
                obj7 = objCopydefault;
                passkeyDebugToolViewModel4 = passkeyDebugToolViewModel3;
                str6 = str5;
                str7 = str4;
                mutableLiveData3 = mutableLiveData2;
                obj8 = obj3;
                obj9 = obj13;
                C5941aFv c5941aFv = passkeyDebugToolViewModel4.AEQbTJ;
                this.L$0 = passkeyDebugToolViewModel4;
                this.L$1 = str6;
                this.L$2 = str7;
                this.L$3 = mutableLiveData3;
                this.L$4 = obj8;
                this.L$5 = obj9;
                this.L$6 = obj6;
                this.L$7 = obj7;
                this.L$8 = objKWHzl2;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 6;
                objCopydefault2 = c5941aFv.copydefault(this);
                if (objCopydefault2 != objCopydefault3) {
                    return objCopydefault3;
                }
                z4 = z2;
                z5 = z3;
                z6 = z;
                obj10 = objKWHzl2;
                boolean z7 = Build.VERSION.SDK_INT < 34 && C32979mnm.EZpvd.OLrzqt().getSystemService("credential") != null;
                mutableLiveData3.setValue(str7 + " " + str6 + "\n\nChina IP bypass AB: " + z6 + "\nChina IP: " + obj8 + "\nScreen lock: " + z4 + "\nGoogle supported: " + z5 + "\nFido2ApiClient supported: " + obj9 + "\n\nFido1v1State: " + obj6 + "\n\nFido1v2State: " + obj7 + "\n\nFido2State: " + obj10 + "\n\nCredentialManagerState: " + objCopydefault2 + "\nContext.CREDENTIAL_SERVICE: " + z7 + "\nCredentialManager AB: Always ON\nXiaomi AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_XIAOMI, false) + "\nOppo AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO, true) + "\nOppoOversea AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO_OVERSEA, true));
                return Unit.INSTANCE;
            case 1:
                boolean z8 = this.Z$0;
                MutableLiveData mutableLiveData5 = (MutableLiveData) this.L$3;
                String str12 = (String) this.L$2;
                String str13 = (String) this.L$1;
                PasskeyDebugToolViewModel passkeyDebugToolViewModel6 = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                str = str13;
                passkeyDebugToolViewModel = passkeyDebugToolViewModel6;
                mutableLiveData = mutableLiveData5;
                z = z8;
                str2 = str12;
                boolean zAEQbTJ2 = passkeyDebugToolViewModel.EZpvd.AEQbTJ();
                boolean zKWHzl2 = passkeyDebugToolViewModel.KWHzl();
                C5903aFJ c5903aFJ2 = passkeyDebugToolViewModel.copydefault;
                this.L$0 = passkeyDebugToolViewModel;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = mutableLiveData;
                this.L$4 = objKWHzl;
                this.Z$0 = z;
                this.Z$1 = zKWHzl2;
                this.Z$2 = zAEQbTJ2;
                this.label = 2;
                objAEQbTJ = c5903aFJ2.AEQbTJ(this);
                if (objAEQbTJ != objCopydefault3) {
                }
                break;
            case 2:
                z2 = this.Z$2;
                z3 = this.Z$1;
                z = this.Z$0;
                obj2 = this.L$4;
                mutableLiveData = (MutableLiveData) this.L$3;
                str3 = (String) this.L$2;
                str = (String) this.L$1;
                passkeyDebugToolViewModel = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                C5939aFt c5939aFt2 = passkeyDebugToolViewModel.djBIcL;
                this.L$0 = passkeyDebugToolViewModel;
                this.L$1 = str;
                this.L$2 = str3;
                this.L$3 = mutableLiveData;
                this.L$4 = obj2;
                this.L$5 = objAEQbTJ;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 3;
                objEZpvd = c5939aFt2.EZpvd(this);
                if (objEZpvd != objCopydefault3) {
                }
                break;
            case 3:
                z2 = this.Z$2;
                z3 = this.Z$1;
                z = this.Z$0;
                Object obj14 = this.L$5;
                Object obj15 = this.L$4;
                MutableLiveData mutableLiveData6 = (MutableLiveData) this.L$3;
                String str14 = (String) this.L$2;
                String str15 = (String) this.L$1;
                PasskeyDebugToolViewModel passkeyDebugToolViewModel7 = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                obj4 = obj14;
                passkeyDebugToolViewModel2 = passkeyDebugToolViewModel7;
                str5 = str15;
                str4 = str14;
                mutableLiveData2 = mutableLiveData6;
                obj3 = obj15;
                C5937aFr c5937aFr2 = passkeyDebugToolViewModel2.AhwBna;
                this.L$0 = passkeyDebugToolViewModel2;
                this.L$1 = str5;
                this.L$2 = str4;
                this.L$3 = mutableLiveData2;
                this.L$4 = obj3;
                this.L$5 = obj4;
                this.L$6 = objEZpvd;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 4;
                objCopydefault = c5937aFr2.copydefault(this);
                if (objCopydefault != objCopydefault3) {
                }
                break;
            case 4:
                z2 = this.Z$2;
                z3 = this.Z$1;
                z = this.Z$0;
                obj5 = this.L$6;
                obj4 = this.L$5;
                obj3 = this.L$4;
                mutableLiveData2 = (MutableLiveData) this.L$3;
                str4 = (String) this.L$2;
                str5 = (String) this.L$1;
                passkeyDebugToolViewModel3 = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                C5938aFs c5938aFs2 = passkeyDebugToolViewModel3.gEmmrt;
                this.L$0 = passkeyDebugToolViewModel3;
                this.L$1 = str5;
                this.L$2 = str4;
                this.L$3 = mutableLiveData2;
                this.L$4 = obj3;
                this.L$5 = obj4;
                this.L$6 = obj5;
                this.L$7 = objCopydefault;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 5;
                objKWHzl2 = c5938aFs2.KWHzl(this);
                if (objKWHzl2 != objCopydefault3) {
                }
                break;
            case 5:
                z2 = this.Z$2;
                z3 = this.Z$1;
                z = this.Z$0;
                obj7 = this.L$7;
                obj6 = this.L$6;
                obj9 = this.L$5;
                obj8 = this.L$4;
                mutableLiveData3 = (MutableLiveData) this.L$3;
                str7 = (String) this.L$2;
                str6 = (String) this.L$1;
                passkeyDebugToolViewModel4 = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl2 = obj;
                C5941aFv c5941aFv2 = passkeyDebugToolViewModel4.AEQbTJ;
                this.L$0 = passkeyDebugToolViewModel4;
                this.L$1 = str6;
                this.L$2 = str7;
                this.L$3 = mutableLiveData3;
                this.L$4 = obj8;
                this.L$5 = obj9;
                this.L$6 = obj6;
                this.L$7 = obj7;
                this.L$8 = objKWHzl2;
                this.Z$0 = z;
                this.Z$1 = z3;
                this.Z$2 = z2;
                this.label = 6;
                objCopydefault2 = c5941aFv2.copydefault(this);
                if (objCopydefault2 != objCopydefault3) {
                }
                break;
            case 6:
                z4 = this.Z$2;
                z5 = this.Z$1;
                z6 = this.Z$0;
                obj10 = this.L$8;
                obj7 = this.L$7;
                obj6 = this.L$6;
                obj9 = this.L$5;
                obj8 = this.L$4;
                mutableLiveData3 = (MutableLiveData) this.L$3;
                str7 = (String) this.L$2;
                str6 = (String) this.L$1;
                passkeyDebugToolViewModel4 = (PasskeyDebugToolViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault2 = obj;
                if (Build.VERSION.SDK_INT < 34) {
                }
                mutableLiveData3.setValue(str7 + " " + str6 + "\n\nChina IP bypass AB: " + z6 + "\nChina IP: " + obj8 + "\nScreen lock: " + z4 + "\nGoogle supported: " + z5 + "\nFido2ApiClient supported: " + obj9 + "\n\nFido1v1State: " + obj6 + "\n\nFido1v2State: " + obj7 + "\n\nFido2State: " + obj10 + "\n\nCredentialManagerState: " + objCopydefault2 + "\nContext.CREDENTIAL_SERVICE: " + z7 + "\nCredentialManager AB: Always ON\nXiaomi AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_XIAOMI, false) + "\nOppo AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO, true) + "\nOppoOversea AB: " + passkeyDebugToolViewModel4.AYXKKw.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO_OVERSEA, true));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
