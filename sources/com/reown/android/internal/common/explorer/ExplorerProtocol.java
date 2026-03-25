package com.reown.android.internal.common.explorer;

import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.explorer.data.model.Project;
import com.reown.android.internal.common.explorer.domain.usecase.GetProjectsWithPaginationUseCase;
import com.reown.foundation.util.Logger;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C60018ztu;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ExplorerProtocol implements ExplorerInterface {
    public final InterfaceC56387yDm getProjectsWithPaginationUseCase$delegate;
    public final C60018ztu koinApp;
    public final InterfaceC56387yDm logger$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExplorerProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ExplorerProtocol(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
        this.getProjectsWithPaginationUseCase$delegate = C56392yDr.copydefault(new Function0<GetProjectsWithPaginationUseCase>() { // from class: com.reown.android.internal.common.explorer.ExplorerProtocol$getProjectsWithPaginationUseCase$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final GetProjectsWithPaginationUseCase invoke() {
                return (GetProjectsWithPaginationUseCase) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(GetProjectsWithPaginationUseCase.class), null, null);
            }
        });
        this.logger$delegate = C56392yDr.copydefault(new Function0<Logger>() { // from class: com.reown.android.internal.common.explorer.ExplorerProtocol$logger$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                C60022zty c60022ztyOLrzqt = this.this$0.koinApp.OLrzqt();
                return (Logger) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:14)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:13) call: com.reown.android.internal.common.explorer.ExplorerProtocol.<init>(o.ztu):void type: THIS */
    public /* synthetic */ ExplorerProtocol(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    public final GetProjectsWithPaginationUseCase getGetProjectsWithPaginationUseCase() {
        return (GetProjectsWithPaginationUseCase) this.getProjectsWithPaginationUseCase$delegate.getValue();
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.android.internal.common.explorer.ExplorerInterface
    /* JADX INFO: renamed from: getProjects-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7190getProjectsyxL6bBk(int i, int i2, boolean z, boolean z2, @NotNull Continuation<? super Result<? extends List<Project>>> continuation) {
        ExplorerProtocol$getProjects$1 explorerProtocol$getProjects$1;
        if (continuation instanceof ExplorerProtocol$getProjects$1) {
            explorerProtocol$getProjects$1 = (ExplorerProtocol$getProjects$1) continuation;
            int i3 = explorerProtocol$getProjects$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                explorerProtocol$getProjects$1.label = i3 - Integer.MIN_VALUE;
            } else {
                explorerProtocol$getProjects$1 = new ExplorerProtocol$getProjects$1(this, continuation);
            }
        }
        ExplorerProtocol$getProjects$1 explorerProtocol$getProjects$12 = explorerProtocol$getProjects$1;
        Object obj = explorerProtocol$getProjects$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = explorerProtocol$getProjects$12.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        GetProjectsWithPaginationUseCase getProjectsWithPaginationUseCase = getGetProjectsWithPaginationUseCase();
        explorerProtocol$getProjects$12.label = 1;
        Object objM7192invokeyxL6bBk = getProjectsWithPaginationUseCase.m7192invokeyxL6bBk(i, i2, z, z2, explorerProtocol$getProjects$12);
        return objM7192invokeyxL6bBk == objCopydefault ? objCopydefault : objM7192invokeyxL6bBk;
    }
}
