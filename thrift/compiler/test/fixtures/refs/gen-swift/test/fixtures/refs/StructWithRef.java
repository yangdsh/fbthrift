/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.refs;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@ThriftStruct(value="StructWithRef", builder=StructWithRef.Builder.class)
public final class StructWithRef {

    @ThriftConstructor
    public StructWithRef(
        @ThriftField(value=1, name="def_field", requiredness=Requiredness.NONE) final test.fixtures.refs.Empty defField,
        @ThriftField(value=2, name="opt_field", requiredness=Requiredness.OPTIONAL) final test.fixtures.refs.Empty optField,
        @ThriftField(value=3, name="req_field", requiredness=Requiredness.REQUIRED) final test.fixtures.refs.Empty reqField
    ) {
        this.defField = defField;
        this.optField = optField;
        this.reqField = reqField;
    }
    
    @ThriftConstructor
    protected StructWithRef() {
      this.defField = null;
      this.optField = null;
      this.reqField = null;
    }
    
    public static class Builder {
    
        private test.fixtures.refs.Empty defField = null;
        private test.fixtures.refs.Empty optField = null;
        private test.fixtures.refs.Empty reqField = null;
    
        @ThriftField(value=1, name="def_field", requiredness=Requiredness.NONE)
        public Builder setDefField(test.fixtures.refs.Empty defField) {
            this.defField = defField;
            return this;
        }
    
        public test.fixtures.refs.Empty getDefField() { return defField; }
    
            @ThriftField(value=2, name="opt_field", requiredness=Requiredness.OPTIONAL)
        public Builder setOptField(test.fixtures.refs.Empty optField) {
            this.optField = optField;
            return this;
        }
    
        public test.fixtures.refs.Empty getOptField() { return optField; }
    
            @ThriftField(value=3, name="req_field", requiredness=Requiredness.REQUIRED)
        public Builder setReqField(test.fixtures.refs.Empty reqField) {
            this.reqField = reqField;
            return this;
        }
    
        public test.fixtures.refs.Empty getReqField() { return reqField; }
    
        public Builder() { }
        public Builder(StructWithRef other) {
            this.defField = other.defField;
            this.optField = other.optField;
            this.reqField = other.reqField;
        }
    
        @ThriftConstructor
        public StructWithRef build() {
            StructWithRef result = new StructWithRef (
                this.defField,
                this.optField,
                this.reqField
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("StructWithRef");
    private final test.fixtures.refs.Empty defField;
    public static final int _DEF_FIELD = 1;
    private static final TField DEF_FIELD_FIELD_DESC = new TField("def_field", TType.STRUCT, (short)1);
        private final test.fixtures.refs.Empty optField;
    public static final int _OPT_FIELD = 2;
    private static final TField OPT_FIELD_FIELD_DESC = new TField("opt_field", TType.STRUCT, (short)2);
        private final test.fixtures.refs.Empty reqField;
    public static final int _REQ_FIELD = 3;
    private static final TField REQ_FIELD_FIELD_DESC = new TField("req_field", TType.STRUCT, (short)3);
    static {
      NAMES_TO_IDS.put("defField", 1);
      FIELD_METADATA.put(1, DEF_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("optField", 2);
      FIELD_METADATA.put(2, OPT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("reqField", 3);
      FIELD_METADATA.put(3, REQ_FIELD_FIELD_DESC);
    }
    
    @ThriftField(value=1, name="def_field", requiredness=Requiredness.NONE)
    public test.fixtures.refs.Empty getDefField() { return defField; }
    
    
    @ThriftField(value=2, name="opt_field", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.refs.Empty getOptField() { return optField; }
    
    
    @ThriftField(value=3, name="req_field", requiredness=Requiredness.REQUIRED)
    public test.fixtures.refs.Empty getReqField() { return reqField; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("defField", defField);
        helper.add("optField", optField);
        helper.add("reqField", reqField);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        StructWithRef other = (StructWithRef)o;
    
        return
            Objects.equals(defField, other.defField) &&
            Objects.equals(optField, other.optField) &&
            Objects.equals(reqField, other.reqField) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            defField,
            optField,
            reqField
        });
    }
    
    
    public static StructWithRef read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(StructWithRef.NAMES_TO_IDS, StructWithRef.FIELD_METADATA);
      StructWithRef.Builder builder = new StructWithRef.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _DEF_FIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.refs.Empty defField = test.fixtures.refs.Empty.read0(oprot);
            builder.setDefField(defField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPT_FIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.refs.Empty optField = test.fixtures.refs.Empty.read0(oprot);
            builder.setOptField(optField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _REQ_FIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.refs.Empty reqField = test.fixtures.refs.Empty.read0(oprot);
            builder.setReqField(reqField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.defField != null) {
        oprot.writeFieldBegin(DEF_FIELD_FIELD_DESC);
        this.defField.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.optField != null) {
        oprot.writeFieldBegin(OPT_FIELD_FIELD_DESC);
        this.optField.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.reqField != null) {
        oprot.writeFieldBegin(REQ_FIELD_FIELD_DESC);
        this.reqField.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
