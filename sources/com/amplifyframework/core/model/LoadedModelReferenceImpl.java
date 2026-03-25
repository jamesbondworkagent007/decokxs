package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56424yEw;

/* JADX INFO: loaded from: classes21.dex */
@InternalAmplifyApi
public final class LoadedModelReferenceImpl<M extends Model> implements LoadedModelReference<M> {
    private final M value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoadedModelReferenceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.model.LoadedModelReference
    public M getValue() {
        return this.value;
    }

    public LoadedModelReferenceImpl(M m) {
        this.value = m;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.amplifyframework.core.model.Model:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.core.model.Model) : (r1v0 com.amplifyframework.core.model.Model))
 A[MD:(M extends com.amplifyframework.core.model.Model):void (m)] (LINE:21) call: com.amplifyframework.core.model.LoadedModelReferenceImpl.<init>(com.amplifyframework.core.model.Model):void type: THIS */
    public /* synthetic */ LoadedModelReferenceImpl(Model model, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : model);
    }

    @Override // com.amplifyframework.core.model.ModelReference
    public Map<String, Object> getIdentifier() {
        return C56424yEw.KWHzl();
    }
}
