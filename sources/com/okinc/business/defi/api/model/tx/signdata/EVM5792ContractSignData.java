package com.okinc.business.defi.api.model.tx.signdata;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVM5792ContractSignData extends EVMContractSignData {
    public static final int $stable = 8;
    private final Boolean atomicRequired;
    private List<EVM5792Call> calls;
    private final Map<String, JsonObject> capabilities;
    private final String chainId;
    private String id;
    private final String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAtomicRequired() {
        return this.atomicRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVM5792Call> getCalls() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> getCapabilities() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalls(@NotNull List<EVM5792Call> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.calls = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.Boolean)
  (r16v0 java.util.List)
  (r17v0 java.util.Map)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVM5792Call>, java.util.Map<java.lang.String, com.google.gson.JsonObject>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization>):void (m)] (LINE:34) call: com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.util.Map, java.util.List):void type: THIS */
    public /* synthetic */ EVM5792ContractSignData(String str, String str2, String str3, String str4, Boolean bool, List list, Map map, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bool, list, map, (i & 128) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVM5792ContractSignData(String str, String str2, String str3, String str4, Boolean bool, @NotNull List<EVM5792Call> list, Map<String, JsonObject> map, List<EVMAuthorization> list2) {
        super(null, null, null, null, null, null, str3 == null ? "" : str3, null, null, null, null, null, null, list2, 8127, null);
        Intrinsics.checkNotNullParameter(list, "");
        this.version = str;
        this.id = str2;
        this.chainId = str4;
        this.atomicRequired = bool;
        this.calls = list;
        this.capabilities = map;
    }
}
