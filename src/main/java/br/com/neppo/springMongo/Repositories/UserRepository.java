package br.com.neppo.springMongo.Repositories;

import br.com.neppo.springMongo.Models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<UserModel, String>{

}
