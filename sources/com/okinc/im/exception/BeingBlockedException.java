package com.okinc.im.exception;

import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class BeingBlockedException extends OKIMException {
    public static final int $stable = RelationInfo.$stable;
    private final RelationInfo relationInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo getRelationInfo() {
        return this.relationInfo;
    }

    public BeingBlockedException(RelationInfo relationInfo) {
        super((String) null, 0, 3, (DefaultConstructorMarker) null);
        this.relationInfo = relationInfo;
    }
}
