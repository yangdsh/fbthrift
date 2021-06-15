/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.exceptions;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct("ComplexFieldNames")
public final class ComplexFieldNames extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1L;


    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();

    private static final TStruct STRUCT_DESC = new TStruct("ComplexFieldNames");
    private final String errorMessage;
    public static final int _ERROR_MESSAGE = 1;
    private static final TField ERROR_MESSAGE_FIELD_DESC = new TField("errorMessage", TType.STRING, (short)1);
    private final String internalErrorMessage;
    public static final int _INTERNAL_ERROR_MESSAGE = 2;
    private static final TField INTERNAL_ERROR_MESSAGE_FIELD_DESC = new TField("internalErrorMessage", TType.STRING, (short)2);

    @ThriftConstructor
    public ComplexFieldNames(
        @com.facebook.swift.codec.ThriftField(value=1, name="error_message", requiredness=Requiredness.NONE) final String errorMessage,
        @com.facebook.swift.codec.ThriftField(value=2, name="internal_error_message", requiredness=Requiredness.NONE) final String internalErrorMessage
    ) {
        this.errorMessage = errorMessage;
        this.internalErrorMessage = internalErrorMessage;
    }
    
    @ThriftConstructor
    protected ComplexFieldNames() {
      this.errorMessage = null;
      this.internalErrorMessage = null;
    }
    
    public static class Builder {
    
        private String errorMessage = null;
        private String internalErrorMessage = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="error_message", requiredness=Requiredness.NONE)
        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
    
        public String getErrorMessage() { return errorMessage; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="internal_error_message", requiredness=Requiredness.NONE)
        public Builder setInternalErrorMessage(String internalErrorMessage) {
            this.internalErrorMessage = internalErrorMessage;
            return this;
        }
    
        public String getInternalErrorMessage() { return internalErrorMessage; }
    
        public Builder() { }
        public Builder(ComplexFieldNames other) {
            this.errorMessage = other.errorMessage;
            this.internalErrorMessage = other.internalErrorMessage;
        }
    
        @ThriftConstructor
        public ComplexFieldNames build() {
            ComplexFieldNames result = new ComplexFieldNames (
                this.errorMessage,
                this.internalErrorMessage
            );
            return result;
        }
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="error_message", requiredness=Requiredness.NONE)
    public String getErrorMessage() { return errorMessage; }
        
    @com.facebook.swift.codec.ThriftField(value=2, name="internal_error_message", requiredness=Requiredness.NONE)
    public String getInternalErrorMessage() { return internalErrorMessage; }
        
    @java.lang.Override
    public String getMessage() {
      return internalErrorMessage;
    }
    
    public static com.facebook.thrift.payload.Reader<ComplexFieldNames> asReader() {
      return ComplexFieldNames::read0;
    }
    
    public static ComplexFieldNames read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(ComplexFieldNames.NAMES_TO_IDS, ComplexFieldNames.FIELD_METADATA);
      ComplexFieldNames.Builder builder = new ComplexFieldNames.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _ERROR_MESSAGE:
          if (__field.type == TType.STRING) {
            String errorMessage = oprot.readString();
            builder.setErrorMessage(errorMessage);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _INTERNAL_ERROR_MESSAGE:
          if (__field.type == TType.STRING) {
            String internalErrorMessage = oprot.readString();
            builder.setInternalErrorMessage(internalErrorMessage);
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
      if (this.errorMessage != null) {
        oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
        oprot.writeString(this.errorMessage);
        oprot.writeFieldEnd();
      }
      if (this.internalErrorMessage != null) {
        oprot.writeFieldBegin(INTERNAL_ERROR_MESSAGE_FIELD_DESC);
        oprot.writeString(this.internalErrorMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
