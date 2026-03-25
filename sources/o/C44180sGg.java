package o;

import com.okinc.okimcore.feature.contact.manager.PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1;
import com.okinc.okimcore.feature.contact.manager.PhoneRelationManagerImpl$schedulePhoneRelationSync$1;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44180sGg implements sKN, sEH {
    public CoroutineScope AYXKKw;
    public Job AhwBna;
    public final C44513sSp EZpvd;
    public final C44517sSt KWHzl;
    public final C44514sSq OLrzqt;
    public final C44512sSo copydefault;
    public final C44519sSv djBIcL;
    public final CoroutineDispatcher gEmmrt;
    public final C44520sSw valueOf;
    public final sSC values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C44180sGg(@NotNull C44520sSw c44520sSw, @NotNull C44513sSp c44513sSp, @NotNull C44512sSo c44512sSo, @NotNull C44514sSq c44514sSq, @NotNull C44517sSt c44517sSt, @NotNull sSC ssc, @NotNull C44519sSv c44519sSv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c44520sSw, "");
        Intrinsics.checkNotNullParameter(c44513sSp, "");
        Intrinsics.checkNotNullParameter(c44512sSo, "");
        Intrinsics.checkNotNullParameter(c44514sSq, "");
        Intrinsics.checkNotNullParameter(c44517sSt, "");
        Intrinsics.checkNotNullParameter(ssc, "");
        Intrinsics.checkNotNullParameter(c44519sSv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = c44520sSw;
        this.EZpvd = c44513sSp;
        this.copydefault = c44512sSo;
        this.OLrzqt = c44514sSq;
        this.KWHzl = c44517sSt;
        this.values = ssc;
        this.djBIcL = c44519sSv;
        this.gEmmrt = coroutineDispatcher;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null));
        CoroutineScopeKt.cancel$default(CoroutineScope, null, 1, null);
        this.AYXKKw = CoroutineScope;
    }

    /* JADX INFO: renamed from: o.sGg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sGg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.sEH
    public void bp_() {
        C44124sEe.copydefault("PhoneRelationManager", "onUserLogin");
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null));
    }

    @Override // o.sEH
    public void bq_() {
        C44124sEe.copydefault("PhoneRelationManager", "onUserLogout");
        sGG sgg = sGG.copydefault;
        sgg.copydefault((java.util.List<PhoneRelationEntity>) null);
        sgg.OLrzqt(null);
        sgg.copydefault((java.lang.Integer) null);
        CoroutineScopeKt.cancel$default(this.AYXKKw, null, 1, null);
    }

    @Override // o.sKN
    public void AEQbTJ(@NotNull java.util.List<InHouseIMContactInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, this.gEmmrt, null, new PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1(this, list, null), 2, null);
    }

    @Override // o.sKN
    public Job EZpvd() {
        Job job = this.AhwBna;
        if (job != null && job.isActive()) {
            pUU.KWHzl("PhoneRelationManager", "schedulePhoneRelationSync: already have an active job, return existing job");
            return this.AhwBna;
        }
        pUU.KWHzl("PhoneRelationManager", "schedulePhoneRelationSync: no active job, start phone sync");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, this.gEmmrt, null, new PhoneRelationManagerImpl$schedulePhoneRelationSync$1(this, null), 2, null);
        this.AhwBna = jobLaunch$default;
        return jobLaunch$default;
    }

    @Override // o.sKN
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation) {
        return this.EZpvd.copydefault(continuation);
    }

    @Override // o.sKN
    public java.lang.Object AEQbTJ(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation) {
        return this.copydefault.OLrzqt(set, continuation);
    }

    @Override // o.sKN
    public Flow<java.util.List<PhoneRelationGroup>> KWHzl(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return this.OLrzqt.EZpvd(set);
    }

    @Override // o.sKN
    public Flow<java.util.List<PhoneRelationGroup>> OLrzqt(int i, boolean z) {
        return this.KWHzl.KWHzl(i, z);
    }

    @Override // o.sKN
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.djBIcL.AEQbTJ(continuation);
    }
}
