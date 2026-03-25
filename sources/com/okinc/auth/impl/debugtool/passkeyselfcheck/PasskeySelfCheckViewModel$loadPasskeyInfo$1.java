package com.okinc.auth.impl.debugtool.passkeyselfcheck;

import android.os.Build;
import androidx.biometric.BiometricManager;
import androidx.lifecycle.MutableLiveData;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.auth.impl.featureflag.FeatureFlag;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5725aBr;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5937aFr;
import o.C5938aFs;
import o.C5939aFt;
import o.C5941aFv;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeySelfCheckViewModel$loadPasskeyInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$10;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    int I$7;
    int I$8;
    int I$9;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    boolean Z$5;
    boolean Z$6;
    boolean Z$7;
    boolean Z$8;
    boolean Z$9;
    int label;
    final /* synthetic */ PasskeySelfCheckViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySelfCheckViewModel$loadPasskeyInfo$1(PasskeySelfCheckViewModel passkeySelfCheckViewModel, Continuation<? super PasskeySelfCheckViewModel$loadPasskeyInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeySelfCheckViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeySelfCheckViewModel$loadPasskeyInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeySelfCheckViewModel$loadPasskeyInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x070b A[Catch: Exception -> 0x0928, all -> 0x092a, TryCatch #2 {Exception -> 0x0928, all -> 0x092a, blocks: (B:7:0x006f, B:135:0x08b3, B:169:0x0908, B:10:0x00ee, B:131:0x07f8, B:13:0x0174, B:96:0x0693, B:102:0x06ff, B:104:0x070b, B:106:0x0711, B:111:0x0720, B:115:0x0731, B:119:0x0742, B:123:0x074d, B:127:0x0759, B:16:0x01d8, B:90:0x0615, B:92:0x061d, B:19:0x0244, B:86:0x05a5, B:22:0x02a9, B:82:0x051f, B:25:0x02fe, B:74:0x04a7, B:78:0x04b8, B:28:0x0332, B:48:0x040a, B:50:0x0416, B:57:0x042c, B:59:0x0430, B:65:0x0442, B:70:0x0452, B:31:0x0351, B:44:0x03a2, B:34:0x0368, B:37:0x0384, B:41:0x038a), top: B:178:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x087e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0430 A[Catch: Exception -> 0x0928, all -> 0x092a, TryCatch #2 {Exception -> 0x0928, all -> 0x092a, blocks: (B:7:0x006f, B:135:0x08b3, B:169:0x0908, B:10:0x00ee, B:131:0x07f8, B:13:0x0174, B:96:0x0693, B:102:0x06ff, B:104:0x070b, B:106:0x0711, B:111:0x0720, B:115:0x0731, B:119:0x0742, B:123:0x074d, B:127:0x0759, B:16:0x01d8, B:90:0x0615, B:92:0x061d, B:19:0x0244, B:86:0x05a5, B:22:0x02a9, B:82:0x051f, B:25:0x02fe, B:74:0x04a7, B:78:0x04b8, B:28:0x0332, B:48:0x040a, B:50:0x0416, B:57:0x042c, B:59:0x0430, B:65:0x0442, B:70:0x0452, B:31:0x0351, B:44:0x03a2, B:34:0x0368, B:37:0x0384, B:41:0x038a), top: B:178:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0442 A[Catch: Exception -> 0x0928, all -> 0x092a, TryCatch #2 {Exception -> 0x0928, all -> 0x092a, blocks: (B:7:0x006f, B:135:0x08b3, B:169:0x0908, B:10:0x00ee, B:131:0x07f8, B:13:0x0174, B:96:0x0693, B:102:0x06ff, B:104:0x070b, B:106:0x0711, B:111:0x0720, B:115:0x0731, B:119:0x0742, B:123:0x074d, B:127:0x0759, B:16:0x01d8, B:90:0x0615, B:92:0x061d, B:19:0x0244, B:86:0x05a5, B:22:0x02a9, B:82:0x051f, B:25:0x02fe, B:74:0x04a7, B:78:0x04b8, B:28:0x0332, B:48:0x040a, B:50:0x0416, B:57:0x042c, B:59:0x0430, B:65:0x0442, B:70:0x0452, B:31:0x0351, B:44:0x03a2, B:34:0x0368, B:37:0x0384, B:41:0x038a), top: B:178:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0491 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0507 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0586 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0606 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x061d A[Catch: Exception -> 0x0928, all -> 0x092a, TryCatch #2 {Exception -> 0x0928, all -> 0x092a, blocks: (B:7:0x006f, B:135:0x08b3, B:169:0x0908, B:10:0x00ee, B:131:0x07f8, B:13:0x0174, B:96:0x0693, B:102:0x06ff, B:104:0x070b, B:106:0x0711, B:111:0x0720, B:115:0x0731, B:119:0x0742, B:123:0x074d, B:127:0x0759, B:16:0x01d8, B:90:0x0615, B:92:0x061d, B:19:0x0244, B:86:0x05a5, B:22:0x02a9, B:82:0x051f, B:25:0x02fe, B:74:0x04a7, B:78:0x04b8, B:28:0x0332, B:48:0x040a, B:50:0x0416, B:57:0x042c, B:59:0x0430, B:65:0x0442, B:70:0x0452, B:31:0x0351, B:44:0x03a2, B:34:0x0368, B:37:0x0384, B:41:0x038a), top: B:178:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Boolean boolKWHzl;
        BiometricManager biometricManagerFrom;
        String strCopydefault;
        String str;
        Object objCopydefault;
        boolean zBooleanValue;
        Object objKWHzl;
        String str2;
        String str3;
        String str4;
        BiometricManager biometricManager;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        String str5;
        Object obj2;
        int i2;
        Object objKWHzl2;
        Object obj3;
        Object obj4;
        String str6;
        String str7;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str8;
        String str9;
        boolean z10;
        int i3;
        int i4;
        BiometricManager biometricManager2;
        int i5;
        Object objAEQbTJ;
        Object obj5;
        Object obj6;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        int i7;
        boolean z14;
        boolean z15;
        int i8;
        int i9;
        boolean z16;
        BiometricManager biometricManager3;
        int i10;
        boolean z17;
        Object objKWHzl3;
        Object obj7;
        Object obj8;
        int i11;
        boolean z18;
        boolean z19;
        boolean z20;
        String str10;
        BiometricManager biometricManager4;
        int i12;
        int i13;
        boolean z21;
        boolean z22;
        int i14;
        int i15;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i16;
        int i17;
        boolean z27;
        int i18;
        boolean z28;
        boolean z29;
        boolean z30;
        Object objEZpvd;
        Object obj9;
        int i19;
        Object obj10;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        int i20;
        String str11;
        String str12;
        String str13;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z40;
        boolean z41;
        int i21;
        boolean z42;
        String str14;
        String str15;
        int i22;
        boolean z43;
        boolean z44;
        int i23;
        boolean z45;
        Object objCopydefault2;
        BiometricManager biometricManager5;
        int i24;
        boolean z46;
        int i25;
        String str16;
        boolean z47;
        int i26;
        int i27;
        boolean z48;
        int i28;
        boolean z49;
        boolean z50;
        boolean z51;
        int i29;
        Object obj11;
        boolean z52;
        boolean z53;
        String str17;
        boolean z54;
        User userOLrzqt;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Object objEZpvd2;
        Object obj12;
        Object obj13;
        int i35;
        boolean z55;
        int i36;
        boolean z56;
        int i37;
        int i38;
        boolean z57;
        boolean z58;
        int i39;
        int i40;
        boolean z59;
        int i41;
        int i42;
        String str18;
        int i43;
        int i44;
        UserInfo info;
        Object objCopydefault3;
        Object obj14;
        String str19;
        String str20;
        int i45;
        int i46;
        boolean z60;
        boolean z61;
        boolean z62;
        boolean z63;
        int i47;
        String str21;
        String str22;
        boolean z64;
        int i48;
        boolean z65;
        boolean z66;
        boolean z67;
        int i49;
        int i50;
        boolean z68;
        boolean z69;
        int i51;
        int i52;
        int i53;
        String str23;
        int i54;
        String str24;
        int i55;
        String str25 = "";
        Object objCopydefault4 = C56442yFn.copydefault();
        try {
        } catch (Exception unused) {
            mutableLiveData = this.this$0.KWHzl;
            boolKWHzl = C56443yFo.KWHzl(false);
        } catch (Throwable th) {
            this.this$0.KWHzl.setValue(C56443yFo.KWHzl(false));
            throw th;
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.setValue(C56443yFo.KWHzl(true));
                biometricManagerFrom = BiometricManager.from(C32979mnm.EZpvd.OLrzqt().getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "");
                strCopydefault = this.this$0.copydefault();
                str = Build.MANUFACTURER;
                if (str == null) {
                    str = "";
                }
                String str26 = Build.MODEL;
                if (str26 != null) {
                    str25 = str26;
                }
                C5941aFv c5941aFv = this.this$0.EZpvd;
                this.L$0 = biometricManagerFrom;
                this.L$1 = strCopydefault;
                this.L$2 = str;
                this.L$3 = str25;
                this.label = 1;
                objCopydefault = c5941aFv.copydefault(this);
                if (objCopydefault == objCopydefault4) {
                    return objCopydefault4;
                }
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                boolean zCopydefault = this.this$0.gEmmrt.copydefault(FeatureFlag.BYPASS_CHINA_IP_CHECKING, false);
                boolean zCopydefault2 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_XIAOMI, false);
                boolean zCopydefault3 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO, true);
                boolean zCopydefault4 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO_OVERSEA, true);
                C5904aFK c5904aFK = this.this$0.OLrzqt;
                this.L$0 = biometricManagerFrom;
                this.L$1 = strCopydefault;
                this.L$2 = str;
                this.L$3 = str25;
                this.Z$0 = zBooleanValue;
                this.Z$1 = zCopydefault;
                this.Z$2 = zCopydefault2;
                this.Z$3 = zCopydefault3;
                this.Z$4 = zCopydefault4;
                this.label = 2;
                objKWHzl = c5904aFK.KWHzl(this);
                if (objKWHzl != objCopydefault4) {
                    return objCopydefault4;
                }
                str2 = str25;
                str3 = str;
                str4 = strCopydefault;
                biometricManager = biometricManagerFrom;
                z = zCopydefault;
                z2 = zCopydefault4;
                z3 = zCopydefault2;
                z4 = zCopydefault3;
                boolean zBooleanValue2 = ((Boolean) objKWHzl).booleanValue();
                int i56 = Build.VERSION.SDK_INT;
                i = (i56 >= 34 || C32979mnm.EZpvd.OLrzqt().getSystemService("credential") == null) ? 0 : 1;
                int i57 = i56 < 34 ? 1 : 0;
                str5 = Build.MANUFACTURER;
                if (str5 == null) {
                    obj2 = objCopydefault4;
                    int i58 = C59449zhJ.gEmmrt(str5, MTPushConstants.Manufacturer.XIAOMI, true) ? 1 : 0;
                    if (str5 != null) {
                        i2 = i58;
                        int i59 = C59449zhJ.gEmmrt(str5, MTPushConstants.Manufacturer.OPPO, true) ? 1 : 0;
                        String string = PasskeyDebugTool.EZpvd.AEQbTJ().toString();
                        C5938aFs c5938aFs = this.this$0.djBIcL;
                        this.L$0 = biometricManager;
                        this.L$1 = str4;
                        this.L$2 = str3;
                        this.L$3 = str2;
                        this.L$4 = string;
                        this.Z$0 = zBooleanValue;
                        this.Z$1 = z;
                        this.Z$2 = z3;
                        this.Z$3 = z4;
                        this.Z$4 = z2;
                        this.Z$5 = zBooleanValue2;
                        this.I$0 = i;
                        this.I$1 = i57;
                        BiometricManager biometricManager6 = biometricManager;
                        int i60 = i2;
                        this.I$2 = i60;
                        this.I$3 = i59;
                        this.label = 3;
                        objKWHzl2 = c5938aFs.KWHzl(this);
                        obj3 = obj2;
                        if (objKWHzl2 != obj3) {
                            return obj3;
                        }
                        obj4 = obj3;
                        str6 = str3;
                        str7 = string;
                        z5 = z;
                        z6 = z3;
                        z7 = z4;
                        z8 = z2;
                        z9 = zBooleanValue2;
                        str8 = str4;
                        str9 = str2;
                        z10 = zBooleanValue;
                        i3 = i57;
                        i4 = i59;
                        biometricManager2 = biometricManager6;
                        i5 = i60;
                        boolean zEZpvd = Intrinsics.EZpvd(objKWHzl2, PasskeyVersionState.Fido2Compatible.INSTANCE);
                        int i61 = Build.VERSION.SDK_INT < 28 ? 1 : 0;
                        boolean zAEQbTJ = this.this$0.AEQbTJ();
                        C5903aFJ c5903aFJ = this.this$0.valueOf;
                        this.L$0 = biometricManager2;
                        this.L$1 = str8;
                        this.L$2 = str6;
                        this.L$3 = str9;
                        this.L$4 = str7;
                        this.Z$0 = z10;
                        this.Z$1 = z5;
                        this.Z$2 = z6;
                        this.Z$3 = z7;
                        this.Z$4 = z8;
                        this.Z$5 = z9;
                        this.I$0 = i;
                        this.I$1 = i3;
                        BiometricManager biometricManager7 = biometricManager2;
                        int i62 = i5;
                        this.I$2 = i62;
                        int i63 = i4;
                        this.I$3 = i63;
                        this.Z$6 = zEZpvd;
                        this.I$4 = i61;
                        int i64 = i61;
                        this.Z$7 = zAEQbTJ;
                        this.label = 4;
                        objAEQbTJ = c5903aFJ.AEQbTJ(this);
                        obj5 = obj4;
                        if (objAEQbTJ != obj5) {
                            return obj5;
                        }
                        obj6 = obj5;
                        z11 = z9;
                        z12 = z7;
                        z13 = z5;
                        i6 = i;
                        i7 = i3;
                        z14 = z8;
                        z15 = z6;
                        i8 = i62;
                        i9 = i64;
                        z16 = zEZpvd;
                        biometricManager3 = biometricManager7;
                        i10 = i63;
                        z17 = zAEQbTJ;
                        boolean zBooleanValue3 = ((Boolean) objAEQbTJ).booleanValue();
                        boolean zAEQbTJ2 = this.this$0.AEQbTJ.AEQbTJ();
                        C5938aFs c5938aFs2 = this.this$0.djBIcL;
                        this.L$0 = biometricManager3;
                        this.L$1 = str8;
                        this.L$2 = str6;
                        this.L$3 = str9;
                        this.L$4 = str7;
                        this.Z$0 = z10;
                        this.Z$1 = z13;
                        this.Z$2 = z15;
                        this.Z$3 = z12;
                        this.Z$4 = z14;
                        this.Z$5 = z11;
                        this.I$0 = i6;
                        this.I$1 = i7;
                        this.I$2 = i8;
                        BiometricManager biometricManager8 = biometricManager3;
                        int i65 = i10;
                        this.I$3 = i65;
                        boolean z70 = z16;
                        this.Z$6 = z70;
                        int i66 = i9;
                        this.I$4 = i66;
                        boolean z71 = z17;
                        this.Z$7 = z71;
                        this.Z$8 = zBooleanValue3;
                        this.Z$9 = zAEQbTJ2;
                        this.label = 5;
                        objKWHzl3 = c5938aFs2.KWHzl(this);
                        obj7 = obj6;
                        if (objKWHzl3 != obj7) {
                            return obj7;
                        }
                        obj8 = obj7;
                        i11 = i7;
                        z18 = z13;
                        z19 = z12;
                        z20 = z11;
                        str10 = str8;
                        biometricManager4 = biometricManager8;
                        i12 = i65;
                        i13 = i66;
                        z21 = zBooleanValue3;
                        boolean z72 = z15;
                        z22 = z14;
                        i14 = i6;
                        i15 = i8;
                        z23 = z72;
                        z24 = z71;
                        z25 = zAEQbTJ2;
                        z26 = z70;
                        String string2 = ((PasskeyVersionState) objKWHzl3).toString();
                        int i67 = i15;
                        C5939aFt c5939aFt = this.this$0.AhwBna;
                        this.L$0 = biometricManager4;
                        this.L$1 = str10;
                        this.L$2 = str6;
                        this.L$3 = str9;
                        this.L$4 = str7;
                        this.L$5 = string2;
                        this.Z$0 = z10;
                        this.Z$1 = z18;
                        this.Z$2 = z23;
                        this.Z$3 = z19;
                        this.Z$4 = z22;
                        this.Z$5 = z20;
                        this.I$0 = i14;
                        this.I$1 = i11;
                        this.I$2 = i67;
                        i16 = i67;
                        int i68 = i12;
                        this.I$3 = i68;
                        i17 = i68;
                        boolean z73 = z26;
                        this.Z$6 = z73;
                        z27 = z73;
                        int i69 = i13;
                        this.I$4 = i69;
                        i18 = i69;
                        boolean z74 = z24;
                        this.Z$7 = z74;
                        z28 = z74;
                        boolean z75 = z21;
                        this.Z$8 = z75;
                        z29 = z75;
                        boolean z76 = z25;
                        this.Z$9 = z76;
                        z30 = z76;
                        this.label = 6;
                        objEZpvd = c5939aFt.EZpvd(this);
                        obj9 = obj8;
                        if (objEZpvd != obj9) {
                            return obj9;
                        }
                        i19 = i11;
                        obj10 = obj9;
                        z31 = z18;
                        z32 = z23;
                        z33 = z19;
                        z34 = z22;
                        z35 = z20;
                        i20 = i14;
                        str11 = str6;
                        str12 = str10;
                        str13 = string2;
                        if (Intrinsics.EZpvd(objEZpvd, PasskeyFido1State.Compatible.INSTANCE)) {
                            C5937aFr c5937aFr = this.this$0.AYXKKw;
                            this.L$0 = biometricManager4;
                            this.L$1 = str12;
                            this.L$2 = str11;
                            this.L$3 = str9;
                            this.L$4 = str7;
                            this.L$5 = str13;
                            this.Z$0 = z10;
                            this.Z$1 = z31;
                            this.Z$2 = z32;
                            this.Z$3 = z33;
                            this.Z$4 = z34;
                            this.Z$5 = z35;
                            this.I$0 = i20;
                            int i70 = i19;
                            this.I$1 = i70;
                            int i71 = i16;
                            this.I$2 = i71;
                            int i72 = i17;
                            this.I$3 = i72;
                            boolean z77 = z27;
                            this.Z$6 = z77;
                            z27 = z77;
                            int i73 = i18;
                            this.I$4 = i73;
                            i18 = i73;
                            boolean z78 = z28;
                            this.Z$7 = z78;
                            z45 = z78;
                            boolean z79 = z29;
                            this.Z$8 = z79;
                            boolean z80 = z30;
                            this.Z$9 = z80;
                            this.label = 7;
                            objCopydefault2 = c5937aFr.copydefault(this);
                            objCopydefault4 = obj10;
                            if (objCopydefault2 == objCopydefault4) {
                                return objCopydefault4;
                            }
                            biometricManager5 = biometricManager4;
                            z37 = z80;
                            z39 = z10;
                            z41 = z33;
                            i21 = i20;
                            i24 = i72;
                            z46 = z32;
                            z38 = z35;
                            i25 = i71;
                            z43 = z31;
                            z44 = z34;
                            i23 = i70;
                            str16 = str13;
                            z47 = z79;
                            biometricManager4 = biometricManager5;
                            if (!Intrinsics.EZpvd(objCopydefault2, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                                z36 = z46;
                                i17 = i24;
                                z42 = z47;
                                str13 = str16;
                                str14 = str9;
                                str15 = str7;
                                i22 = i25;
                                z40 = z45;
                                z50 = z42;
                                i26 = i22;
                                str7 = str15;
                                str9 = str14;
                                z52 = z43;
                                z51 = z37;
                                i27 = i17;
                                obj11 = objCopydefault4;
                                str17 = str13;
                                z48 = z27;
                                z53 = z36;
                                z54 = z39;
                                i28 = i18;
                                i29 = 1;
                                z49 = z40;
                                userOLrzqt = this.this$0.AkhnZx.OLrzqt();
                                if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null) {
                                    i30 = i23;
                                    int i74 = info.isInHousePasskeyV2GreyScaleOn() ? 1 : 0;
                                    if (biometricManager4.canAuthenticate(15) == 0) {
                                        i31 = i74;
                                        i32 = 1;
                                    } else {
                                        i31 = i74;
                                        i32 = 0;
                                    }
                                    if (biometricManager4.canAuthenticate(15) == 11) {
                                        i33 = 15;
                                        i34 = 1;
                                    } else {
                                        i33 = 15;
                                        i34 = 0;
                                    }
                                    int i75 = biometricManager4.canAuthenticate(i33) == 12 ? 1 : 0;
                                    int i76 = biometricManager4.canAuthenticate(15) == -2 ? 1 : 0;
                                    C5939aFt c5939aFt2 = this.this$0.AhwBna;
                                    this.L$0 = str12;
                                    this.L$1 = str11;
                                    this.L$2 = str9;
                                    this.L$3 = str7;
                                    this.L$4 = str17;
                                    String str27 = str17;
                                    this.L$5 = null;
                                    this.Z$0 = z54;
                                    this.Z$1 = z52;
                                    this.Z$2 = z53;
                                    this.Z$3 = z41;
                                    this.Z$4 = z44;
                                    this.Z$5 = z38;
                                    this.I$0 = i21;
                                    int i77 = i30;
                                    this.I$1 = i77;
                                    boolean z81 = z54;
                                    int i78 = i26;
                                    this.I$2 = i78;
                                    int i79 = i27;
                                    this.I$3 = i79;
                                    boolean z82 = z48;
                                    this.Z$6 = z82;
                                    int i80 = i28;
                                    this.I$4 = i80;
                                    boolean z83 = z49;
                                    this.Z$7 = z83;
                                    boolean z84 = z50;
                                    this.Z$8 = z84;
                                    boolean z85 = z51;
                                    this.Z$9 = z85;
                                    int i81 = i29;
                                    this.I$5 = i81;
                                    int i82 = i31;
                                    this.I$6 = i82;
                                    int i83 = i32;
                                    this.I$7 = i83;
                                    int i84 = i34;
                                    this.I$8 = i84;
                                    this.I$9 = i75;
                                    this.I$10 = i76;
                                    this.label = 8;
                                    objEZpvd2 = c5939aFt2.EZpvd(this);
                                    obj12 = obj11;
                                    if (objEZpvd2 == obj12) {
                                        return obj12;
                                    }
                                    obj13 = obj12;
                                    i35 = i78;
                                    z55 = z84;
                                    i36 = i84;
                                    z56 = z82;
                                    i37 = i81;
                                    i38 = i76;
                                    z57 = z81;
                                    z58 = z83;
                                    i39 = i83;
                                    i40 = i79;
                                    z59 = z85;
                                    i41 = i75;
                                    i42 = i77;
                                    str18 = str27;
                                    i43 = i80;
                                    i44 = i82;
                                    String string3 = ((PasskeyFido1State) objEZpvd2).toString();
                                    int i85 = i35;
                                    C5937aFr c5937aFr2 = this.this$0.AYXKKw;
                                    this.L$0 = str12;
                                    this.L$1 = str11;
                                    this.L$2 = str9;
                                    this.L$3 = str7;
                                    this.L$4 = str18;
                                    this.L$5 = string3;
                                    this.Z$0 = z57;
                                    this.Z$1 = z52;
                                    this.Z$2 = z53;
                                    this.Z$3 = z41;
                                    this.Z$4 = z44;
                                    this.Z$5 = z38;
                                    this.I$0 = i21;
                                    this.I$1 = i42;
                                    this.I$2 = i85;
                                    int i86 = i40;
                                    this.I$3 = i86;
                                    boolean z86 = z56;
                                    this.Z$6 = z86;
                                    int i87 = i43;
                                    this.I$4 = i87;
                                    boolean z87 = z58;
                                    this.Z$7 = z87;
                                    boolean z88 = z55;
                                    this.Z$8 = z88;
                                    boolean z89 = z59;
                                    this.Z$9 = z89;
                                    int i88 = i37;
                                    this.I$5 = i88;
                                    int i89 = i44;
                                    this.I$6 = i89;
                                    int i90 = i39;
                                    this.I$7 = i90;
                                    int i91 = i36;
                                    this.I$8 = i91;
                                    int i92 = i41;
                                    this.I$9 = i92;
                                    int i93 = i38;
                                    this.I$10 = i93;
                                    this.label = 9;
                                    objCopydefault3 = c5937aFr2.copydefault(this);
                                    obj14 = obj13;
                                    if (objCopydefault3 != obj14) {
                                        return obj14;
                                    }
                                    str19 = str18;
                                    str20 = str7;
                                    i45 = i93;
                                    i46 = i92;
                                    z60 = z89;
                                    z61 = z88;
                                    z62 = z87;
                                    z63 = z86;
                                    i47 = i86;
                                    str21 = string3;
                                    str22 = str12;
                                    z64 = z52;
                                    i48 = i21;
                                    z65 = z38;
                                    z66 = z44;
                                    z67 = z41;
                                    i49 = i89;
                                    i50 = i87;
                                    z68 = z57;
                                    z69 = z53;
                                    i51 = i42;
                                    i52 = i91;
                                    i53 = i88;
                                    str23 = str11;
                                    i54 = i90;
                                    str24 = str9;
                                    i55 = i85;
                                    this.this$0.copydefault.setValue(new C5725aBr(str22, str23, str24, z68, i51 == 0, i48 == 0, z65, z64, z69, i55 == 0, z67, z66, i47 == 0, true, str20, z63, i50 == 0, z62, z61, z60, str19, i53 == 0, i49 == 0, i54 == 0, i52 == 0, i46 == 0, i45 == 0, str21, String.valueOf(Intrinsics.EZpvd(objCopydefault3, PasskeyVersionState.Fido1v2Compatible.INSTANCE))));
                                    mutableLiveData = this.this$0.KWHzl;
                                    boolKWHzl = C56443yFo.KWHzl(false);
                                    mutableLiveData.setValue(boolKWHzl);
                                    return Unit.INSTANCE;
                                }
                                i30 = i23;
                                if (biometricManager4.canAuthenticate(15) == 0) {
                                }
                                if (biometricManager4.canAuthenticate(15) == 11) {
                                }
                                if (biometricManager4.canAuthenticate(i33) == 12) {
                                }
                                if (biometricManager4.canAuthenticate(15) == -2) {
                                }
                                C5939aFt c5939aFt22 = this.this$0.AhwBna;
                                this.L$0 = str12;
                                this.L$1 = str11;
                                this.L$2 = str9;
                                this.L$3 = str7;
                                this.L$4 = str17;
                                String str272 = str17;
                                this.L$5 = null;
                                this.Z$0 = z54;
                                this.Z$1 = z52;
                                this.Z$2 = z53;
                                this.Z$3 = z41;
                                this.Z$4 = z44;
                                this.Z$5 = z38;
                                this.I$0 = i21;
                                int i772 = i30;
                                this.I$1 = i772;
                                boolean z812 = z54;
                                int i782 = i26;
                                this.I$2 = i782;
                                int i792 = i27;
                                this.I$3 = i792;
                                boolean z822 = z48;
                                this.Z$6 = z822;
                                int i802 = i28;
                                this.I$4 = i802;
                                boolean z832 = z49;
                                this.Z$7 = z832;
                                boolean z842 = z50;
                                this.Z$8 = z842;
                                boolean z852 = z51;
                                this.Z$9 = z852;
                                int i812 = i29;
                                this.I$5 = i812;
                                int i822 = i31;
                                this.I$6 = i822;
                                int i832 = i32;
                                this.I$7 = i832;
                                int i842 = i34;
                                this.I$8 = i842;
                                this.I$9 = i75;
                                this.I$10 = i76;
                                this.label = 8;
                                objEZpvd2 = c5939aFt22.EZpvd(this);
                                obj12 = obj11;
                                if (objEZpvd2 == obj12) {
                                }
                            } else {
                                i26 = i25;
                                z54 = z39;
                                i29 = 0;
                                boolean z90 = z37;
                                obj11 = objCopydefault4;
                                str17 = str16;
                                z51 = z90;
                                boolean z91 = z45;
                                z50 = z47;
                                z53 = z46;
                                z48 = z27;
                                i28 = i18;
                                z49 = z91;
                                boolean z92 = z43;
                                i27 = i24;
                                z52 = z92;
                                userOLrzqt = this.this$0.AkhnZx.OLrzqt();
                                if (userOLrzqt != null) {
                                    i30 = i23;
                                    if (biometricManager4.canAuthenticate(15) == 0) {
                                    }
                                    if (biometricManager4.canAuthenticate(15) == 11) {
                                    }
                                    if (biometricManager4.canAuthenticate(i33) == 12) {
                                    }
                                    if (biometricManager4.canAuthenticate(15) == -2) {
                                    }
                                    C5939aFt c5939aFt222 = this.this$0.AhwBna;
                                    this.L$0 = str12;
                                    this.L$1 = str11;
                                    this.L$2 = str9;
                                    this.L$3 = str7;
                                    this.L$4 = str17;
                                    String str2722 = str17;
                                    this.L$5 = null;
                                    this.Z$0 = z54;
                                    this.Z$1 = z52;
                                    this.Z$2 = z53;
                                    this.Z$3 = z41;
                                    this.Z$4 = z44;
                                    this.Z$5 = z38;
                                    this.I$0 = i21;
                                    int i7722 = i30;
                                    this.I$1 = i7722;
                                    boolean z8122 = z54;
                                    int i7822 = i26;
                                    this.I$2 = i7822;
                                    int i7922 = i27;
                                    this.I$3 = i7922;
                                    boolean z8222 = z48;
                                    this.Z$6 = z8222;
                                    int i8022 = i28;
                                    this.I$4 = i8022;
                                    boolean z8322 = z49;
                                    this.Z$7 = z8322;
                                    boolean z8422 = z50;
                                    this.Z$8 = z8422;
                                    boolean z8522 = z51;
                                    this.Z$9 = z8522;
                                    int i8122 = i29;
                                    this.I$5 = i8122;
                                    int i8222 = i31;
                                    this.I$6 = i8222;
                                    int i8322 = i32;
                                    this.I$7 = i8322;
                                    int i8422 = i34;
                                    this.I$8 = i8422;
                                    this.I$9 = i75;
                                    this.I$10 = i76;
                                    this.label = 8;
                                    objEZpvd2 = c5939aFt222.EZpvd(this);
                                    obj12 = obj11;
                                    if (objEZpvd2 == obj12) {
                                    }
                                }
                                mutableLiveData.setValue(boolKWHzl);
                                return Unit.INSTANCE;
                            }
                        } else {
                            objCopydefault4 = obj10;
                            z36 = z32;
                            z37 = z30;
                            z38 = z35;
                            z39 = z10;
                            z40 = z28;
                            z41 = z33;
                            i21 = i20;
                            z42 = z29;
                            str14 = str9;
                            str15 = str7;
                            i22 = i16;
                            z43 = z31;
                            z44 = z34;
                            i23 = i19;
                            z50 = z42;
                            i26 = i22;
                            str7 = str15;
                            str9 = str14;
                            z52 = z43;
                            z51 = z37;
                            i27 = i17;
                            obj11 = objCopydefault4;
                            str17 = str13;
                            z48 = z27;
                            z53 = z36;
                            z54 = z39;
                            i28 = i18;
                            i29 = 1;
                            z49 = z40;
                            userOLrzqt = this.this$0.AkhnZx.OLrzqt();
                            if (userOLrzqt != null) {
                            }
                            mutableLiveData.setValue(boolKWHzl);
                            return Unit.INSTANCE;
                        }
                    } else {
                        i2 = i58;
                    }
                    String string4 = PasskeyDebugTool.EZpvd.AEQbTJ().toString();
                    C5938aFs c5938aFs3 = this.this$0.djBIcL;
                    this.L$0 = biometricManager;
                    this.L$1 = str4;
                    this.L$2 = str3;
                    this.L$3 = str2;
                    this.L$4 = string4;
                    this.Z$0 = zBooleanValue;
                    this.Z$1 = z;
                    this.Z$2 = z3;
                    this.Z$3 = z4;
                    this.Z$4 = z2;
                    this.Z$5 = zBooleanValue2;
                    this.I$0 = i;
                    this.I$1 = i57;
                    BiometricManager biometricManager62 = biometricManager;
                    int i602 = i2;
                    this.I$2 = i602;
                    this.I$3 = i59;
                    this.label = 3;
                    objKWHzl2 = c5938aFs3.KWHzl(this);
                    obj3 = obj2;
                    if (objKWHzl2 != obj3) {
                    }
                } else {
                    obj2 = objCopydefault4;
                }
                if (str5 != null) {
                }
                String string42 = PasskeyDebugTool.EZpvd.AEQbTJ().toString();
                C5938aFs c5938aFs32 = this.this$0.djBIcL;
                this.L$0 = biometricManager;
                this.L$1 = str4;
                this.L$2 = str3;
                this.L$3 = str2;
                this.L$4 = string42;
                this.Z$0 = zBooleanValue;
                this.Z$1 = z;
                this.Z$2 = z3;
                this.Z$3 = z4;
                this.Z$4 = z2;
                this.Z$5 = zBooleanValue2;
                this.I$0 = i;
                this.I$1 = i57;
                BiometricManager biometricManager622 = biometricManager;
                int i6022 = i2;
                this.I$2 = i6022;
                this.I$3 = i59;
                this.label = 3;
                objKWHzl2 = c5938aFs32.KWHzl(this);
                obj3 = obj2;
                if (objKWHzl2 != obj3) {
                }
                break;
            case 1:
                str25 = (String) this.L$3;
                str = (String) this.L$2;
                strCopydefault = (String) this.L$1;
                biometricManagerFrom = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                boolean zCopydefault5 = this.this$0.gEmmrt.copydefault(FeatureFlag.BYPASS_CHINA_IP_CHECKING, false);
                boolean zCopydefault22 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_XIAOMI, false);
                boolean zCopydefault32 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO, true);
                boolean zCopydefault42 = this.this$0.gEmmrt.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO_OVERSEA, true);
                C5904aFK c5904aFK2 = this.this$0.OLrzqt;
                this.L$0 = biometricManagerFrom;
                this.L$1 = strCopydefault;
                this.L$2 = str;
                this.L$3 = str25;
                this.Z$0 = zBooleanValue;
                this.Z$1 = zCopydefault5;
                this.Z$2 = zCopydefault22;
                this.Z$3 = zCopydefault32;
                this.Z$4 = zCopydefault42;
                this.label = 2;
                objKWHzl = c5904aFK2.KWHzl(this);
                if (objKWHzl != objCopydefault4) {
                }
                break;
            case 2:
                boolean z93 = this.Z$4;
                boolean z94 = this.Z$3;
                boolean z95 = this.Z$2;
                boolean z96 = this.Z$1;
                zBooleanValue = this.Z$0;
                String str28 = (String) this.L$3;
                String str29 = (String) this.L$2;
                String str30 = (String) this.L$1;
                BiometricManager biometricManager9 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                str2 = str28;
                str3 = str29;
                str4 = str30;
                z2 = z93;
                z4 = z94;
                z3 = z95;
                biometricManager = biometricManager9;
                z = z96;
                boolean zBooleanValue22 = ((Boolean) objKWHzl).booleanValue();
                int i562 = Build.VERSION.SDK_INT;
                if (i562 >= 34) {
                    if (i562 < 34) {
                    }
                    str5 = Build.MANUFACTURER;
                    if (str5 == null) {
                    }
                    if (str5 != null) {
                    }
                    String string422 = PasskeyDebugTool.EZpvd.AEQbTJ().toString();
                    C5938aFs c5938aFs322 = this.this$0.djBIcL;
                    this.L$0 = biometricManager;
                    this.L$1 = str4;
                    this.L$2 = str3;
                    this.L$3 = str2;
                    this.L$4 = string422;
                    this.Z$0 = zBooleanValue;
                    this.Z$1 = z;
                    this.Z$2 = z3;
                    this.Z$3 = z4;
                    this.Z$4 = z2;
                    this.Z$5 = zBooleanValue22;
                    this.I$0 = i;
                    this.I$1 = i57;
                    BiometricManager biometricManager6222 = biometricManager;
                    int i60222 = i2;
                    this.I$2 = i60222;
                    this.I$3 = i59;
                    this.label = 3;
                    objKWHzl2 = c5938aFs322.KWHzl(this);
                    obj3 = obj2;
                    if (objKWHzl2 != obj3) {
                    }
                }
                mutableLiveData.setValue(boolKWHzl);
                return Unit.INSTANCE;
            case 3:
                int i94 = this.I$3;
                int i95 = this.I$2;
                int i96 = this.I$1;
                int i97 = this.I$0;
                boolean z97 = this.Z$5;
                boolean z98 = this.Z$4;
                boolean z99 = this.Z$3;
                boolean z100 = this.Z$2;
                boolean z101 = this.Z$1;
                boolean z102 = this.Z$0;
                String str31 = (String) this.L$4;
                String str32 = (String) this.L$3;
                String str33 = (String) this.L$2;
                String str34 = (String) this.L$1;
                BiometricManager biometricManager10 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i5 = i95;
                str8 = str34;
                i4 = i94;
                obj4 = objCopydefault4;
                str9 = str32;
                biometricManager2 = biometricManager10;
                z10 = z102;
                objKWHzl2 = obj;
                i = i97;
                str6 = str33;
                str7 = str31;
                z5 = z101;
                z6 = z100;
                z7 = z99;
                z8 = z98;
                z9 = z97;
                i3 = i96;
                boolean zEZpvd2 = Intrinsics.EZpvd(objKWHzl2, PasskeyVersionState.Fido2Compatible.INSTANCE);
                if (Build.VERSION.SDK_INT < 28) {
                }
                boolean zAEQbTJ3 = this.this$0.AEQbTJ();
                C5903aFJ c5903aFJ2 = this.this$0.valueOf;
                this.L$0 = biometricManager2;
                this.L$1 = str8;
                this.L$2 = str6;
                this.L$3 = str9;
                this.L$4 = str7;
                this.Z$0 = z10;
                this.Z$1 = z5;
                this.Z$2 = z6;
                this.Z$3 = z7;
                this.Z$4 = z8;
                this.Z$5 = z9;
                this.I$0 = i;
                this.I$1 = i3;
                BiometricManager biometricManager72 = biometricManager2;
                int i622 = i5;
                this.I$2 = i622;
                int i632 = i4;
                this.I$3 = i632;
                this.Z$6 = zEZpvd2;
                this.I$4 = i61;
                int i642 = i61;
                this.Z$7 = zAEQbTJ3;
                this.label = 4;
                objAEQbTJ = c5903aFJ2.AEQbTJ(this);
                obj5 = obj4;
                if (objAEQbTJ != obj5) {
                }
                break;
            case 4:
                boolean z103 = this.Z$7;
                int i98 = this.I$4;
                boolean z104 = this.Z$6;
                int i99 = this.I$3;
                int i100 = this.I$2;
                int i101 = this.I$1;
                int i102 = this.I$0;
                boolean z105 = this.Z$5;
                boolean z106 = this.Z$4;
                boolean z107 = this.Z$3;
                boolean z108 = this.Z$2;
                boolean z109 = this.Z$1;
                boolean z110 = this.Z$0;
                String str35 = (String) this.L$4;
                String str36 = (String) this.L$3;
                String str37 = (String) this.L$2;
                String str38 = (String) this.L$1;
                BiometricManager biometricManager11 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i10 = i99;
                str6 = str37;
                i9 = i98;
                str8 = str38;
                z16 = z104;
                z11 = z105;
                z13 = z109;
                z10 = z110;
                str7 = str35;
                str9 = str36;
                z17 = z103;
                obj6 = objCopydefault4;
                biometricManager3 = biometricManager11;
                objAEQbTJ = obj;
                i8 = i100;
                z14 = z106;
                i7 = i101;
                z12 = z107;
                i6 = i102;
                z15 = z108;
                boolean zBooleanValue32 = ((Boolean) objAEQbTJ).booleanValue();
                boolean zAEQbTJ22 = this.this$0.AEQbTJ.AEQbTJ();
                C5938aFs c5938aFs22 = this.this$0.djBIcL;
                this.L$0 = biometricManager3;
                this.L$1 = str8;
                this.L$2 = str6;
                this.L$3 = str9;
                this.L$4 = str7;
                this.Z$0 = z10;
                this.Z$1 = z13;
                this.Z$2 = z15;
                this.Z$3 = z12;
                this.Z$4 = z14;
                this.Z$5 = z11;
                this.I$0 = i6;
                this.I$1 = i7;
                this.I$2 = i8;
                BiometricManager biometricManager82 = biometricManager3;
                int i652 = i10;
                this.I$3 = i652;
                boolean z702 = z16;
                this.Z$6 = z702;
                int i662 = i9;
                this.I$4 = i662;
                boolean z712 = z17;
                this.Z$7 = z712;
                this.Z$8 = zBooleanValue32;
                this.Z$9 = zAEQbTJ22;
                this.label = 5;
                objKWHzl3 = c5938aFs22.KWHzl(this);
                obj7 = obj6;
                if (objKWHzl3 != obj7) {
                }
                break;
            case 5:
                boolean z111 = this.Z$9;
                boolean z112 = this.Z$8;
                boolean z113 = this.Z$7;
                int i103 = this.I$4;
                boolean z114 = this.Z$6;
                int i104 = this.I$3;
                int i105 = this.I$2;
                int i106 = this.I$1;
                int i107 = this.I$0;
                boolean z115 = this.Z$5;
                boolean z116 = this.Z$4;
                boolean z117 = this.Z$3;
                boolean z118 = this.Z$2;
                boolean z119 = this.Z$1;
                boolean z120 = this.Z$0;
                String str39 = (String) this.L$4;
                String str40 = (String) this.L$3;
                String str41 = (String) this.L$2;
                String str42 = (String) this.L$1;
                BiometricManager biometricManager12 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i12 = i104;
                z20 = z115;
                z18 = z119;
                str9 = str40;
                z24 = z113;
                str10 = str42;
                z26 = z114;
                i14 = i107;
                z23 = z118;
                str7 = str39;
                z21 = z112;
                biometricManager4 = biometricManager12;
                objKWHzl3 = obj;
                obj8 = objCopydefault4;
                i11 = i106;
                z19 = z117;
                z10 = z120;
                z25 = z111;
                i13 = i103;
                str6 = str41;
                i15 = i105;
                z22 = z116;
                String string22 = ((PasskeyVersionState) objKWHzl3).toString();
                int i672 = i15;
                C5939aFt c5939aFt3 = this.this$0.AhwBna;
                this.L$0 = biometricManager4;
                this.L$1 = str10;
                this.L$2 = str6;
                this.L$3 = str9;
                this.L$4 = str7;
                this.L$5 = string22;
                this.Z$0 = z10;
                this.Z$1 = z18;
                this.Z$2 = z23;
                this.Z$3 = z19;
                this.Z$4 = z22;
                this.Z$5 = z20;
                this.I$0 = i14;
                this.I$1 = i11;
                this.I$2 = i672;
                i16 = i672;
                int i682 = i12;
                this.I$3 = i682;
                i17 = i682;
                boolean z732 = z26;
                this.Z$6 = z732;
                z27 = z732;
                int i692 = i13;
                this.I$4 = i692;
                i18 = i692;
                boolean z742 = z24;
                this.Z$7 = z742;
                z28 = z742;
                boolean z752 = z21;
                this.Z$8 = z752;
                z29 = z752;
                boolean z762 = z25;
                this.Z$9 = z762;
                z30 = z762;
                this.label = 6;
                objEZpvd = c5939aFt3.EZpvd(this);
                obj9 = obj8;
                if (objEZpvd != obj9) {
                }
                break;
            case 6:
                boolean z121 = this.Z$9;
                boolean z122 = this.Z$8;
                boolean z123 = this.Z$7;
                int i108 = this.I$4;
                boolean z124 = this.Z$6;
                int i109 = this.I$3;
                int i110 = this.I$2;
                int i111 = this.I$1;
                int i112 = this.I$0;
                boolean z125 = this.Z$5;
                boolean z126 = this.Z$4;
                boolean z127 = this.Z$3;
                boolean z128 = this.Z$2;
                boolean z129 = this.Z$1;
                boolean z130 = this.Z$0;
                String str43 = (String) this.L$5;
                String str44 = (String) this.L$4;
                String str45 = (String) this.L$3;
                String str46 = (String) this.L$2;
                String str47 = (String) this.L$1;
                BiometricManager biometricManager13 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i16 = i110;
                i19 = i111;
                z35 = z125;
                z34 = z126;
                z32 = z128;
                z31 = z129;
                str7 = str44;
                str9 = str45;
                z28 = z123;
                i18 = i108;
                str13 = str43;
                str12 = str47;
                z29 = z122;
                i17 = i109;
                i20 = i112;
                z33 = z127;
                z10 = z130;
                biometricManager4 = biometricManager13;
                z30 = z121;
                objEZpvd = obj;
                obj10 = objCopydefault4;
                z27 = z124;
                str11 = str46;
                if (Intrinsics.EZpvd(objEZpvd, PasskeyFido1State.Compatible.INSTANCE)) {
                }
                break;
            case 7:
                boolean z131 = this.Z$9;
                boolean z132 = this.Z$8;
                boolean z133 = this.Z$7;
                int i113 = this.I$4;
                boolean z134 = this.Z$6;
                i24 = this.I$3;
                i25 = this.I$2;
                i23 = this.I$1;
                i21 = this.I$0;
                z38 = this.Z$5;
                z44 = this.Z$4;
                z41 = this.Z$3;
                boolean z135 = this.Z$2;
                boolean z136 = this.Z$1;
                z37 = z131;
                z39 = this.Z$0;
                str16 = (String) this.L$5;
                String str48 = (String) this.L$4;
                String str49 = (String) this.L$3;
                String str50 = (String) this.L$2;
                String str51 = (String) this.L$1;
                BiometricManager biometricManager14 = (BiometricManager) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z43 = z136;
                str9 = str49;
                i18 = i113;
                str12 = str51;
                z46 = z135;
                str7 = str48;
                z45 = z133;
                z47 = z132;
                objCopydefault2 = obj;
                biometricManager5 = biometricManager14;
                z27 = z134;
                str11 = str50;
                biometricManager4 = biometricManager5;
                if (!Intrinsics.EZpvd(objCopydefault2, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                }
                break;
            case 8:
                int i114 = this.I$10;
                int i115 = this.I$9;
                int i116 = this.I$8;
                int i117 = this.I$7;
                int i118 = this.I$6;
                int i119 = this.I$5;
                boolean z137 = this.Z$9;
                boolean z138 = this.Z$8;
                boolean z139 = this.Z$7;
                int i120 = this.I$4;
                boolean z140 = this.Z$6;
                int i121 = this.I$3;
                int i122 = this.I$2;
                int i123 = this.I$1;
                int i124 = this.I$0;
                boolean z141 = this.Z$5;
                boolean z142 = this.Z$4;
                boolean z143 = this.Z$3;
                boolean z144 = this.Z$2;
                boolean z145 = this.Z$1;
                boolean z146 = this.Z$0;
                String str52 = (String) this.L$4;
                String str53 = (String) this.L$3;
                String str54 = (String) this.L$2;
                String str55 = (String) this.L$1;
                String str56 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i40 = i121;
                z41 = z143;
                i39 = i117;
                str12 = str56;
                objEZpvd2 = obj;
                obj13 = objCopydefault4;
                str18 = str52;
                z55 = z138;
                i35 = i122;
                str7 = str53;
                z58 = z139;
                i21 = i124;
                i38 = i114;
                i41 = i115;
                z57 = z146;
                z59 = z137;
                i42 = i123;
                str9 = str54;
                i43 = i120;
                z38 = z141;
                i36 = i116;
                z53 = z144;
                i44 = i118;
                str11 = str55;
                z56 = z140;
                z44 = z142;
                i37 = i119;
                z52 = z145;
                String string32 = ((PasskeyFido1State) objEZpvd2).toString();
                int i852 = i35;
                C5937aFr c5937aFr22 = this.this$0.AYXKKw;
                this.L$0 = str12;
                this.L$1 = str11;
                this.L$2 = str9;
                this.L$3 = str7;
                this.L$4 = str18;
                this.L$5 = string32;
                this.Z$0 = z57;
                this.Z$1 = z52;
                this.Z$2 = z53;
                this.Z$3 = z41;
                this.Z$4 = z44;
                this.Z$5 = z38;
                this.I$0 = i21;
                this.I$1 = i42;
                this.I$2 = i852;
                int i862 = i40;
                this.I$3 = i862;
                boolean z862 = z56;
                this.Z$6 = z862;
                int i872 = i43;
                this.I$4 = i872;
                boolean z872 = z58;
                this.Z$7 = z872;
                boolean z882 = z55;
                this.Z$8 = z882;
                boolean z892 = z59;
                this.Z$9 = z892;
                int i882 = i37;
                this.I$5 = i882;
                int i892 = i44;
                this.I$6 = i892;
                int i902 = i39;
                this.I$7 = i902;
                int i912 = i36;
                this.I$8 = i912;
                int i922 = i41;
                this.I$9 = i922;
                int i932 = i38;
                this.I$10 = i932;
                this.label = 9;
                objCopydefault3 = c5937aFr22.copydefault(this);
                obj14 = obj13;
                if (objCopydefault3 != obj14) {
                }
                break;
            case 9:
                int i125 = this.I$10;
                i46 = this.I$9;
                i52 = this.I$8;
                i54 = this.I$7;
                i49 = this.I$6;
                i53 = this.I$5;
                boolean z147 = this.Z$9;
                boolean z148 = this.Z$8;
                boolean z149 = this.Z$7;
                i50 = this.I$4;
                boolean z150 = this.Z$6;
                i47 = this.I$3;
                i55 = this.I$2;
                i51 = this.I$1;
                i48 = this.I$0;
                i45 = i125;
                boolean z151 = this.Z$5;
                boolean z152 = this.Z$4;
                boolean z153 = this.Z$3;
                boolean z154 = this.Z$2;
                boolean z155 = this.Z$1;
                boolean z156 = this.Z$0;
                String str57 = (String) this.L$5;
                String str58 = (String) this.L$4;
                String str59 = (String) this.L$3;
                String str60 = (String) this.L$2;
                String str61 = (String) this.L$1;
                String str62 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z60 = z147;
                z61 = z148;
                z62 = z149;
                z63 = z150;
                z66 = z152;
                z67 = z153;
                str21 = str57;
                str19 = str58;
                str20 = str59;
                str23 = str61;
                str22 = str62;
                z65 = z151;
                z64 = z155;
                z68 = z156;
                objCopydefault3 = obj;
                z69 = z154;
                str24 = str60;
                this.this$0.copydefault.setValue(new C5725aBr(str22, str23, str24, z68, i51 == 0, i48 == 0, z65, z64, z69, i55 == 0, z67, z66, i47 == 0, true, str20, z63, i50 == 0, z62, z61, z60, str19, i53 == 0, i49 == 0, i54 == 0, i52 == 0, i46 == 0, i45 == 0, str21, String.valueOf(Intrinsics.EZpvd(objCopydefault3, PasskeyVersionState.Fido1v2Compatible.INSTANCE))));
                mutableLiveData = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                mutableLiveData.setValue(boolKWHzl);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
