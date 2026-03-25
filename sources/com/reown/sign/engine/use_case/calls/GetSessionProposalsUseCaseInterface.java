package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetSessionProposalsUseCaseInterface {
    Object getSessionProposals(@NotNull Continuation<? super List<EngineDO.SessionProposal>> continuation);
}
