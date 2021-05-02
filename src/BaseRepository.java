public class BaseRepository<Entity> implements Repository<Entity>{
    @Override
    public Entity add(Entity entity) {
        return entity;
    }

    @Override
    public Entity delete(Entity entity) {
        return entity;
    }

    @Override
    public Entity update(Entity entity) {
        return entity;
    }
}
