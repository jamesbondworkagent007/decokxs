package o;

import com.donkingliang.groupedadapter.BuildConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BY;
import o.BinaryOperator;
import o.C52643wT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Executor implements BinaryOperator {
    public final zU AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> AhwBna;
    public final PipedReader KWHzl;
    public final Consumer OLrzqt;
    public final BinaryOperator.ActionBar copydefault;
    public final BT djBIcL;
    public final IntFunction gEmmrt;
    public final CZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BinaryOperator.ActionBar AEQbTJ() {
        return this.copydefault;
    }

    public Executor(@NotNull BinaryOperator.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
        this.valueOf = new CZ(null, 1, null);
        this.AEQbTJ = new zU(AEQbTJ().djBIcL());
        this.gEmmrt = new IntFunction(AEQbTJ());
        java.util.List<InterfaceC2861Ab> listCopydefault = AEQbTJ().copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listCopydefault, 10)), 16));
        for (java.lang.Object obj : listCopydefault) {
            linkedHashMap.put(C52643wT.copydefault(((InterfaceC2861Ab) obj).copydefault()), obj);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        C52643wT c52643wTCopydefault = C52643wT.copydefault(stateListAnimator.OLrzqt());
        if (mapIsConnected.get(c52643wTCopydefault) == null) {
            mapIsConnected.put(c52643wTCopydefault, new C2967Ad(C55815xr.copydefault(), "cognito-idp"));
        }
        C52643wT c52643wTCopydefault2 = C52643wT.copydefault(stateListAnimator.copydefault());
        if (mapIsConnected.get(c52643wTCopydefault2) == null) {
            mapIsConnected.put(c52643wTCopydefault2, zX.EZpvd);
        }
        this.AhwBna = C56424yEw.values(mapIsConnected);
        this.OLrzqt = new Consumer(AEQbTJ());
        this.AYXKKw = "aws.sdk.kotlin.services.cognitoidentityprovider";
        this.djBIcL = new BT("aws.sdk.kotlin.services.cognitoidentityprovider", AEQbTJ().DbNXlk());
        C5061Df.OLrzqt(this.valueOf, AEQbTJ().djBIcL());
        C5061Df.OLrzqt(this.valueOf, AEQbTJ().KWHzl());
        this.KWHzl = PipedReader.EZpvd.OLrzqt(new PrintStream("Cognito Identity Provider", "1.0.44"), AEQbTJ().AEQbTJ());
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull DHPublicKeySpec dHPublicKeySpec, @NotNull Continuation<? super IvParameterSpec> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(DHPublicKeySpec.class), C56524yIo.AEQbTJ(IvParameterSpec.class));
        bv.EZpvd(new BluetoothGatt());
        bv.OLrzqt(new BluetoothDevicePicker());
        bv.AEQbTJ("AdminListGroupsForUser");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, dHPublicKeySpec, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object AEQbTJ(@NotNull DHPrivateKeySpec dHPrivateKeySpec, @NotNull Continuation<? super PSpecified> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(DHPrivateKeySpec.class), C56524yIo.AEQbTJ(PSpecified.class));
        bv.EZpvd(new BluetoothGattServerCallback());
        bv.OLrzqt(new BluetoothGattServer());
        bv.AEQbTJ("AdminListUserAuthEvents");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, dHPrivateKeySpec, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull ChooseAccountTypeActivity chooseAccountTypeActivity, @NotNull Continuation<? super AuthenticatorDescription> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ChooseAccountTypeActivity.class), C56524yIo.AEQbTJ(AuthenticatorDescription.class));
        bv.EZpvd(new ScanCallback());
        bv.OLrzqt(new ResultStorageDescriptor());
        bv.AEQbTJ("AssociateSoftwareToken");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, chooseAccountTypeActivity, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull AnimationHandler animationHandler, @NotNull Continuation<? super Animator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(AnimationHandler.class), C56524yIo.AEQbTJ(Animator.class));
        bv.EZpvd(new BluetoothLeDeviceFilter());
        bv.OLrzqt(new BluetoothDeviceFilter());
        bv.AEQbTJ("ChangePassword");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, animationHandler, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object OLrzqt(@NotNull ArgbEvaluator argbEvaluator, @NotNull Continuation<? super BidirectionalTypeConverter> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ArgbEvaluator.class), C56524yIo.AEQbTJ(BidirectionalTypeConverter.class));
        bv.EZpvd(new ContentUris());
        bv.OLrzqt(new CursorEntityIterator());
        bv.AEQbTJ("ConfirmDevice");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, argbEvaluator, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull IntArrayEvaluator intArrayEvaluator, @NotNull Continuation<? super KeyframeSet> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(IntArrayEvaluator.class), C56524yIo.AEQbTJ(KeyframeSet.class));
        bv.EZpvd(new DefaultDataHandler());
        bv.OLrzqt(new CursorLoader());
        bv.AEQbTJ("ConfirmForgotPassword");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, intArrayEvaluator, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull IntKeyframeSet intKeyframeSet, @NotNull Continuation<? super Keyframe> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(IntKeyframeSet.class), C56524yIo.AEQbTJ(Keyframe.class));
        bv.EZpvd(new MutableContextWrapper());
        bv.OLrzqt(new EntityIterator());
        bv.AEQbTJ("ConfirmSignUp");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, intKeyframeSet, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull Condemned condemned, @NotNull Continuation<? super FractionRes> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(Condemned.class), C56524yIo.AEQbTJ(FractionRes.class));
        bv.EZpvd(new PackageInstaller());
        bv.OLrzqt(new PackageBackwardCompatibility());
        bv.AEQbTJ("DeleteUser");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, condemned, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object AEQbTJ(@NotNull TargetApi targetApi, @NotNull Continuation<? super XmlRes> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(TargetApi.class), C56524yIo.AEQbTJ(XmlRes.class));
        bv.EZpvd(new AbstractWindowedCursor());
        bv.OLrzqt(new BulkCursorDescriptor());
        bv.AEQbTJ("ForgetDevice");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, targetApi, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull Widget widget, @NotNull Continuation<? super UserIdInt> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(Widget.class), C56524yIo.AEQbTJ(UserIdInt.class));
        bv.EZpvd(new CrossProcessCursor());
        bv.OLrzqt(new ContentObserver());
        bv.AEQbTJ("ForgotPassword");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, widget, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull ApplicationLoaders applicationLoaders, @NotNull Continuation<? super ApplicationErrorReport> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ApplicationLoaders.class), C56524yIo.AEQbTJ(ApplicationErrorReport.class));
        bv.EZpvd(new SQLiteDatabaseCorruptException());
        bv.OLrzqt(new SQLiteDatabaseConfiguration());
        bv.AEQbTJ("GetUser");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, applicationLoaders, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull AppOpsManager appOpsManager, @NotNull Continuation<? super AlertDialog> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(AppOpsManager.class), C56524yIo.AEQbTJ(AlertDialog.class));
        bv.EZpvd(new SQLiteConstraintException());
        bv.OLrzqt(new SQLiteConnectionPool());
        bv.AEQbTJ("GetUserAttributeVerificationCode");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, appOpsManager, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull ApplicationThreadConstants applicationThreadConstants, @NotNull Continuation<? super ApplicationPackageManager> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ApplicationThreadConstants.class), C56524yIo.AEQbTJ(ApplicationPackageManager.class));
        bv.EZpvd(new SQLiteOutOfMemoryException());
        bv.OLrzqt(new SQLiteDirectCursorDriver());
        bv.AEQbTJ("GlobalSignOut");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, applicationThreadConstants, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull BroadcastOptions broadcastOptions, @NotNull Continuation<? super DialogFragment> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(BroadcastOptions.class), C56524yIo.AEQbTJ(DialogFragment.class));
        bv.EZpvd(new SQLiteStatementInfo());
        bv.OLrzqt(new SQLiteReadOnlyDatabaseException());
        bv.AEQbTJ("InitiateAuth");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, broadcastOptions, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull DatePickerDialog datePickerDialog, @NotNull Continuation<? super DexLoadReporter> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(DatePickerDialog.class), C56524yIo.AEQbTJ(DexLoadReporter.class));
        bv.EZpvd(new CameraStatus());
        bv.OLrzqt(new GestureStroke());
        bv.AEQbTJ("ListDevices");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, datePickerDialog, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object AEQbTJ(@NotNull ContentProviderHolder contentProviderHolder, @NotNull Continuation<? super FragmentBreadCrumbs> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ContentProviderHolder.class), C56524yIo.AEQbTJ(FragmentBreadCrumbs.class));
        bv.EZpvd(new GeomagneticField());
        bv.OLrzqt(new Camera());
        bv.AEQbTJ("ListGroups");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, contentProviderHolder, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull EnterTransitionCoordinator enterTransitionCoordinator, @NotNull Continuation<? super ExitTransitionCoordinator> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(EnterTransitionCoordinator.class), C56524yIo.AEQbTJ(ExitTransitionCoordinator.class));
        bv.EZpvd(new HardwareBuffer());
        bv.OLrzqt(new LegacySensorManager());
        bv.AEQbTJ("ListIdentityProviders");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, enterTransitionCoordinator, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object AEQbTJ(@NotNull ExpandableListActivity expandableListActivity, @NotNull Continuation<? super DownloadManager> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ExpandableListActivity.class), C56524yIo.AEQbTJ(DownloadManager.class));
        bv.EZpvd(new SensorAdditionalInfo());
        bv.OLrzqt(new SensorEventCallback());
        bv.AEQbTJ("ListResourceServers");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, expandableListActivity, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull FragmentContainer fragmentContainer, @NotNull Continuation<? super FragmentTransaction> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(FragmentContainer.class), C56524yIo.AEQbTJ(FragmentTransaction.class));
        bv.EZpvd(new CameraCaptureSession());
        bv.OLrzqt(new BiometricConstants());
        bv.AEQbTJ("ListUserPoolClients");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, fragmentContainer, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull GrantedUriPermission grantedUriPermission, @NotNull Continuation<? super Instrumentation> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(GrantedUriPermission.class), C56524yIo.AEQbTJ(Instrumentation.class));
        bv.EZpvd(new BiometricFingerprintConstants());
        bv.OLrzqt(new BiometricPrompt());
        bv.AEQbTJ("ListUserPools");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, grantedUriPermission, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull IntentService intentService, @NotNull Continuation<? super ListActivity> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(IntentService.class), C56524yIo.AEQbTJ(ListActivity.class));
        bv.EZpvd(new CaptureRequest());
        bv.OLrzqt(new CaptureResult());
        bv.AEQbTJ("ListUsers");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, intentService, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull FragmentTransition fragmentTransition, @NotNull Continuation<? super InstantAppResolverService> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(FragmentTransition.class), C56524yIo.AEQbTJ(InstantAppResolverService.class));
        bv.EZpvd(new CameraDevice());
        bv.OLrzqt(new CameraConstrainedHighSpeedCaptureSession());
        bv.AEQbTJ("ListUsersInGroup");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, fragmentTransition, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull Presentation presentation, @NotNull Continuation<? super ProfilerInfo> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(Presentation.class), C56524yIo.AEQbTJ(ProfilerInfo.class));
        bv.EZpvd(new MarshalHelpers());
        bv.OLrzqt(new RequestHandlerThread());
        bv.AEQbTJ("ResendConfirmationCode");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, presentation, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object OLrzqt(@NotNull RemoteAction remoteAction, @NotNull Continuation<? super RecoverableSecurityException> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(RemoteAction.class), C56524yIo.AEQbTJ(RecoverableSecurityException.class));
        bv.EZpvd(new MarshalQueryableColorSpaceTransform());
        bv.OLrzqt(new MarshalQueryableBlackLevelPattern());
        bv.AEQbTJ("RespondToAuthChallenge");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, remoteAction, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull RemoteInput remoteInput, @NotNull Continuation<? super ResultInfo> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(RemoteInput.class), C56524yIo.AEQbTJ(ResultInfo.class));
        bv.EZpvd(new MarshalQueryableBoolean());
        bv.OLrzqt(new MarshalQueryableHighSpeedVideoConfiguration());
        bv.AEQbTJ("RevokeToken");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, remoteInput, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull TimePickerDialog timePickerDialog, @NotNull Continuation<? super UiAutomationConnection> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(TimePickerDialog.class), C56524yIo.AEQbTJ(UiAutomationConnection.class));
        bv.EZpvd(new RggbChannelVector());
        bv.OLrzqt(new ReprocessFormatsMap());
        bv.AEQbTJ("SetUserMFAPreference");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, timePickerDialog, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object OLrzqt(@NotNull VrManager vrManager, @NotNull Continuation<? super UserSwitchObserver> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(VrManager.class), C56524yIo.AEQbTJ(UserSwitchObserver.class));
        bv.EZpvd(new ArrayUtils());
        bv.OLrzqt(new CloseableLock());
        bv.AEQbTJ("SignUp");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, vrManager, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object OLrzqt(@NotNull SystemUpdatePolicy systemUpdatePolicy, @NotNull Continuation<? super AssistStructure> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(SystemUpdatePolicy.class), C56524yIo.AEQbTJ(AssistStructure.class));
        bv.EZpvd(new GeofenceHardwareMonitorEvent());
        bv.OLrzqt(new GeofenceHardwareService());
        bv.AEQbTJ("UpdateDeviceStatus");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, systemUpdatePolicy, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object KWHzl(@NotNull BackupHelper backupHelper, @NotNull Continuation<? super BackupManagerMonitor> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(BackupHelper.class), C56524yIo.AEQbTJ(BackupManagerMonitor.class));
        bv.EZpvd(new AccessoryFilter());
        bv.OLrzqt(new RadioMetadata());
        bv.AEQbTJ("UpdateUserAttributes");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, backupHelper, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object copydefault(@NotNull ActivityConfigurationChangeItem activityConfigurationChangeItem, @NotNull Continuation<? super ActivityRelaunchItem> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(ActivityConfigurationChangeItem.class), C56524yIo.AEQbTJ(ActivityRelaunchItem.class));
        bv.EZpvd(new IpSecUdpEncapResponse());
        bv.OLrzqt(new IpSecTransformResponse());
        bv.AEQbTJ("VerifySoftwareToken");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, activityConfigurationChangeItem, continuation);
    }

    @Override // o.BinaryOperator
    public java.lang.Object EZpvd(@NotNull JobServiceEngine jobServiceEngine, @NotNull Continuation<? super ClientTransaction> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(JobServiceEngine.class), C56524yIo.AEQbTJ(ClientTransaction.class));
        bv.EZpvd(new LinkAddress());
        bv.OLrzqt(new IpSecTransform());
        bv.AEQbTJ("VerifyUserAttribute");
        bv.EZpvd("Cognito Identity Provider");
        C5033Cd c5033CdEZpvd = bv.EZpvd();
        c5033CdEZpvd.OLrzqt(AEQbTJ().DbNXlk());
        c5033CdEZpvd.EZpvd(this.AYXKKw);
        c5033CdEZpvd.OLrzqt(this.djBIcL);
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.system", "aws-api");
        c5033CdEZpvd.OLrzqt(c58002yt.AEQbTJ());
        bv.AEQbTJ().AEQbTJ(new BK(this.OLrzqt, this.AhwBna, this.gEmmrt));
        bv.AEQbTJ().OLrzqt(new LongBinaryOperator(AEQbTJ()));
        bv.AEQbTJ().OLrzqt(AEQbTJ().fetchVPNInfo());
        bv.AEQbTJ().AEQbTJ(AEQbTJ().AkhnZx());
        BY byOLrzqt = bv.OLrzqt();
        KWHzl(byOLrzqt.KWHzl());
        byOLrzqt.KWHzl(new StreamCorruptedException());
        byOLrzqt.EZpvd().add(SerializablePermission.EZpvd);
        byOLrzqt.AEQbTJ(new C54292xD("AWSCognitoIdentityProviderService", BuildConfig.VERSION_NAME));
        byOLrzqt.AEQbTJ(new SyncFailedException(this.KWHzl));
        byOLrzqt.AEQbTJ(new StringReader(null, 1, null));
        byOLrzqt.EZpvd().addAll(AEQbTJ().valueOf());
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, jobServiceEngine, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.valueOf.EZpvd();
    }

    private final void KWHzl(DT dt) {
        C57578yl c57578yl = C57578yl.EZpvd;
        C58108yv.KWHzl(dt, c57578yl.AEQbTJ(), AEQbTJ().EZpvd());
        C58108yv.KWHzl(dt, c57578yl.EZpvd(), AEQbTJ().AhwBna());
        C58108yv.EZpvd(dt, FilterOutputStream.EZpvd.AEQbTJ(), AEQbTJ().values());
        C55232xg c55232xg = C55232xg.EZpvd;
        C58108yv.EZpvd(dt, c55232xg.gEmmrt(), AEQbTJ().values());
        C58108yv.KWHzl(dt, c55232xg.AYXKKw(), "cognito-idp");
        C58108yv.KWHzl(dt, c55232xg.copydefault(), AEQbTJ().KWHzl());
    }
}
