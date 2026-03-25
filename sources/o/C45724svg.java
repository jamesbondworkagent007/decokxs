package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.hero.data.model.HeroResponseRootModel;
import com.okinc.okex.lite.hero.data.model.HeroSection;
import com.okinc.okex.lite.hero.repo.HeroRepositoryImpl$fetchHeroSection$1;
import com.okinc.okex.lite.hero.repo.HeroRepositoryImpl$fetchHeroSection$2$1;
import com.okinc.okex.lite.hero.repo.HeroRepositoryImpl$updateCacheHero$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45724svg implements InterfaceC45723svf {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final MutableSharedFlow<HeroSection> EZpvd;
    public boolean KWHzl;
    public final InterfaceC45675suX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lkotlinx/coroutines/flow/SharedFlow; */
    @Override // o.InterfaceC45723svf
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow<HeroSection> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC45723svf
    public void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC45723svf
    public boolean EZpvd() {
        return this.KWHzl;
    }

    @yCM
    public C45724svg(@NotNull InterfaceC45675suX interfaceC45675suX, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(interfaceC45675suX, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = interfaceC45675suX;
        this.AEQbTJ = coroutineDispatcher;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.svj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45724svg.AEQbTJ(context);
            }
        });
        this.EZpvd = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final android.content.SharedPreferences KWHzl() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.content.SharedPreferences) value;
    }

    public static final android.content.SharedPreferences AEQbTJ(android.content.Context context) {
        return context.getSharedPreferences("HERO_SP", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC45723svf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<HeroResponseRootModel, OKServerException>> continuation) throws java.lang.Throwable {
        HeroRepositoryImpl$fetchHeroSection$1 heroRepositoryImpl$fetchHeroSection$1;
        if (continuation instanceof HeroRepositoryImpl$fetchHeroSection$1) {
            heroRepositoryImpl$fetchHeroSection$1 = (HeroRepositoryImpl$fetchHeroSection$1) continuation;
            int i = heroRepositoryImpl$fetchHeroSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heroRepositoryImpl$fetchHeroSection$1.label = i - Integer.MIN_VALUE;
            } else {
                heroRepositoryImpl$fetchHeroSection$1 = new HeroRepositoryImpl$fetchHeroSection$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = heroRepositoryImpl$fetchHeroSection$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = heroRepositoryImpl$fetchHeroSection$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                HeroRepositoryImpl$fetchHeroSection$2$1 heroRepositoryImpl$fetchHeroSection$2$1 = new HeroRepositoryImpl$fetchHeroSection$2$1(this, null);
                heroRepositoryImpl$fetchHeroSection$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, heroRepositoryImpl$fetchHeroSection$2$1, heroRepositoryImpl$fetchHeroSection$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC45723svf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(HeroSection heroSection, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        HeroRepositoryImpl$updateCacheHero$1 heroRepositoryImpl$updateCacheHero$1;
        if (continuation instanceof HeroRepositoryImpl$updateCacheHero$1) {
            heroRepositoryImpl$updateCacheHero$1 = (HeroRepositoryImpl$updateCacheHero$1) continuation;
            int i = heroRepositoryImpl$updateCacheHero$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heroRepositoryImpl$updateCacheHero$1.label = i - Integer.MIN_VALUE;
            } else {
                heroRepositoryImpl$updateCacheHero$1 = new HeroRepositoryImpl$updateCacheHero$1(this, continuation);
            }
        }
        java.lang.Object obj = heroRepositoryImpl$updateCacheHero$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = heroRepositoryImpl$updateCacheHero$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("LiteHeroPage", "updateCacheHero " + heroSection);
                Json.Default r8 = Json.Default;
                r8.getSerializersModule();
                KWHzl().edit().putString("HERO_PAGE_CONTENT_SP_KEY", r8.encodeToString(BuiltinSerializersKt.getNullable(HeroSection.Companion.serializer()), heroSection)).apply();
                MutableSharedFlow<HeroSection> mutableSharedFlowOLrzqt = OLrzqt();
                heroRepositoryImpl$updateCacheHero$1.label = 1;
                if (mutableSharedFlowOLrzqt.emit(heroSection, heroRepositoryImpl$updateCacheHero$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            pUU.copydefault("CacheError", "emitted");
        } catch (java.lang.Exception e) {
            pUU.copydefault("CacheError", "Failed to serialize HeroSection: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC45723svf
    public HeroSection copydefault() {
        java.lang.String string = KWHzl().getString("HERO_PAGE_CONTENT_SP_KEY", null);
        if (string == null) {
            return null;
        }
        try {
            Json.Default r1 = Json.Default;
            r1.getSerializersModule();
            return (HeroSection) r1.decodeFromString(BuiltinSerializersKt.getNullable(HeroSection.Companion.serializer()), string);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CacheError", "Failed to deserialize HeroSection: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: o.svg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.svg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
